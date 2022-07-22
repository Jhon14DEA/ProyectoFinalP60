package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	
	@OneToOne
	@JoinColumn(name = "ped_codigo")
	private Pedido pedido;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "res_codigo")
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

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Cliente [Cedula=" + Cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + ", direccion="
				+ direccion + ", e_mail=" + e_mail + ", pedido=" + pedido + ", listaReservas=" + listaReservas + "]";
	}

	
	
	
	
	
	
	

}
