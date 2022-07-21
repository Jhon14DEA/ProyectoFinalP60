package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DetalleFactura implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fac_det_codigo")
	@GeneratedValue	
	private int codigo;
	@Column(name = "fac_det_cantidad")
	private int cantidad;
	@Column(name = "fac_det_precio")
	private double precio;
	
	@OneToOne
	@JoinColumn(name = "ped_codigo")
	private  Pedido pedido;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "DetalleFactura [codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + ", pedido="
				+ pedido + "]";
	}



}
