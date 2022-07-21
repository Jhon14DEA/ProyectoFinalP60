package ec.edu.ups.ProyectoFinalP60.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class FacturaCabecera implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fac_codigo")
	@GeneratedValue
	private int codigo;
	@Column(name = "fac_fecha")
	private String fecha;
	
	@OneToOne
	@JoinColumn(name = "per_cedula")
	private Cliente cliente;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<DetalleFactura> listaDetalles;
	


	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<DetalleFactura> getListaDetalles() {
		return listaDetalles;
	}
	public void setListaDetalles(List<DetalleFactura> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}
	
	public void addDetalle(DetalleFactura detalle) {
		if (listaDetalles == null) {
			listaDetalles = new ArrayList<DetalleFactura>();
			System.out.println("nuevod");
		}
		listaDetalles.add(detalle);
	}
	@Override
	public String toString() {
		return "FacturaCabecera [codigo=" + codigo + ", fecha=" + fecha + ", cliente=" + cliente + ", listaDetalles="
				+ listaDetalles + "]";
	}
	
	

}
