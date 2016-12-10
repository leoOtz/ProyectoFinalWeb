package ec.edu.epn.adminusr.modelo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ropaCamisetas database table.
 * 
 */
@Entity
@Table(name="ropaCamisetas")
@NamedQuery(name="RopaCamiseta.findAll", query="SELECT r FROM RopaCamiseta r")
public class RopaCamiseta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdRopaCamisetas")
	private int idRopaCamisetas;

	@Lob
	private byte[] imagen;

	@Column(name="Name")
	private String name;

	@Column(name="Precio")
	private double precio;

	public RopaCamiseta() {
	}

	public int getIdRopaCamisetas() {
		return this.idRopaCamisetas;
	}

	public void setIdRopaCamisetas(int idRopaCamisetas) {
		this.idRopaCamisetas = idRopaCamisetas;
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

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}