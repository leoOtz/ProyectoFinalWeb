package ec.edu.epn.adminusr.modelo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.epn.adminusr.modelo.entity.RopaCamiseta;





public class SevicioImagen 
{
	
	public SevicioImagen()
	{
		
	}
	
	
	public List<RopaCamiseta> consultarProductos (String nombre){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
	    		   "pruebaProducto");
		EntityManager em = emf.createEntityManager();		
		Query query = em.createQuery(
			      "SELECT r FROM RopaCamiseta AS r where r.name like ?", RopaCamiseta.class);		
		query.setParameter(1,nombre);
			  
		return query.getResultList();
	}
		

}
