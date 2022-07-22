	package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_RESERVA")
public class Reserva implements Serializable{

	/**
	 *RESERVACIO PUEDE QUEDAR SIEMPRE EN UN TIEMPO DETERMINADO "2 HORAS"
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "res_codigo")
	private int codigo;
	private String fechaIngreso;
	private String fechaSalida;
	private int numeroPersona;
	private int numeroMesa;
	private String valor;

	public Reserva() {
		
	}
	
	public Reserva(int codigo, String fechaIngreso, String fechaSalida, int numeroPersona, int numeroMesa,
			String valor) {
		super();
		this.codigo = codigo;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.numeroPersona = numeroPersona;
		this.numeroMesa = numeroMesa;
		this.valor = valor;
	}
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

	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", numeroPersona=" + numeroPersona + ", numeroMesa=" + numeroMesa + ", valor=" + valor + "]";
	}

	
	
	

}
