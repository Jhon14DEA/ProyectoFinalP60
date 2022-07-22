	package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reserva implements Serializable{

	/**
	 *RESERVACIO PUEDE QUEDAR SIEMPRE EN UN TIEMPO DETERMINADO "2 HORAS"
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int codigo;
	private String fechaIngreso;
	private String fechaSalida;
	private int numeroPersona;
	private int numeroMesa;
	private String valor;
	
	
	@OneToOne
	@JoinColumn(name = "cli_cedula")
	private Cliente cliente;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public int getNumeroPersona() {
		return numeroPersona;
	}
	public void setNumeroPersona(int numeroPersona) {
		this.numeroPersona = numeroPersona;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", numeroPersona=" + numeroPersona + ", numeroMesa=" + numeroMesa + ", valor=" + valor + ", cliente="
				+ cliente + "]";
	}
	
	
	

}
