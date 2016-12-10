package ec.edu.epn.adminusr.modelo.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ec.edu.epn.adminusr.modelo.entity.Imagen;
import ec.edu.epn.adminusr.modelo.entity.TablaProducto;


public class ServicioImg 
{
	public TablaProducto consultarImagen (int id){
		EntityManagerFactory emf = 
	       Persistence.createEntityManagerFactory(
	    		   "pruebaProducto");
		EntityManager em = emf.createEntityManager();
		TablaProducto u = em.find(TablaProducto.class, id);
		return u;
	}

}
