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
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int codigo;
	private String fechaIngreso;
	private String fechaSalida;
	private int numeroPersana;
	private int numeroMesa;
	
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
	public int getNumeroPersana() {
		return numeroPersana;
	}
	public void setNumeroPersana(int numeroPersana) {
		this.numeroPersana = numeroPersana;
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
	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", numeroPersana=" + numeroPersana + ", numeroMesa=" + numeroMesa + ", cliente=" + cliente + "]";
	}	
	
	

}
