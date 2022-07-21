package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigo;
	private String orden;
	private double precio;	
	private double total;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", orden=" + orden + ", precio=" + precio + ", total=" + total + "]";
	}
	

	
}
