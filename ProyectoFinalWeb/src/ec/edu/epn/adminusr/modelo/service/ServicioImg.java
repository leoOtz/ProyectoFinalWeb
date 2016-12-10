package ec.edu.epn.adminusr.modelo.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ec.edu.epn.adminusr.modelo.entity.Imagen;


public class ServicioImg 
{
	public Imagen consultarImagen (int id){
		EntityManagerFactory emf = 
	       Persistence.createEntityManagerFactory(
	    		   "pruebaProducto");
		EntityManager em = emf.createEntityManager();
		Imagen u = em.find(Imagen.class, id);
		return u;
	}

}
