package ec.edu.epn.adminusr.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@Table(name="imagen")
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	private byte[] imagen;

	@Column(name="Name")
	private String name;

	public Imagen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}