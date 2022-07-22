package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ped_codigo")
	private int codigo;	
	private String orden;
	private int cantidad;
	private double precio;	
	private double total;
	
	public Pedido() {}
	
	
	public Pedido(int codigo, String orden, int cantidad, double precio, double total) {
		super();
		this.codigo = codigo;
		this.orden = orden;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}


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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", orden=" + orden + ", precio=" + precio + ", total=" + total + "]";
	}
	

	
}
