package ec.edu.epn.adminusr.modelo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.epn.adminusr.modelo.entity.RopaCamiseta;
import ec.edu.epn.adminusr.modelo.entity.TablaProducto;





public class SevicioImagen 
{
	
	public SevicioImagen()
	{
		
	}
	
	
	public List<TablaProducto> consultarProductos (String nombre){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
	    		   "pruebaProducto");
		EntityManager em = emf.createEntityManager();		
		Query query = em.createQuery(
			      "SELECT t FROM TablaProducto AS t where t.nombre like ?", TablaProducto.class);		
		query.setParameter(1,nombre);
			  
		return query.getResultList();
	}
		

}
