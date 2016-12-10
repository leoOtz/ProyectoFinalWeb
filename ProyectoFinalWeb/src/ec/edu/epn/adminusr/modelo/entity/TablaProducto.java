package ec.edu.epn.adminusr.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tablaProducto database table.
 * 
 */
@Entity
@Table(name="tablaProducto")
@NamedQuery(name="TablaProducto.findAll", query="SELECT t FROM TablaProducto t")
public class TablaProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	public TablaProducto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}