package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Cliente implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cli_cedula")
	private String Cedula;
	private String nombre;
	private String Apellido;
	private String direccion;
	private String e_mail;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Reserva> listaReservas;
	
	
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	@Override
	public String toString() {
		return "Cliente [Cedula=" + Cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + ", direccion="
				+ direccion + ", e_mail=" + e_mail + "]";
	}
	
	
	
	
	
	
	

}
