package ec.edu.ups.ProyectoFinalP60.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.ProyectoFinalP60.DAO.CalificacionDAO;
import ec.edu.ups.ProyectoFinalP60.DAO.ClienteDAO;
import ec.edu.ups.ProyectoFinalP60.modelo.Calificacion;
import ec.edu.ups.ProyectoFinalP60.modelo.Cliente;

@Path("restaurante")
public class RestauranteService {
	@Inject
	private CalificacionDAO calificacionON;
	private ClienteDAO clienteON;
	//==========================================CALIFICACIONES========================	
	@POST
	@Path("crearNotaCalificaciones")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Respuesta crearCalificacion(Calificacion calificacion) {
		Respuesta respuesta;
		try {
			calificacionON.insert(calificacion);
			respuesta = new Respuesta(1, "Guardado Satisfactoriamente");
		} catch (Exception e) {
			respuesta = new Respuesta(2,"No se guardo"+e.getMessage());
		}
		return respuesta;
	}
	
	@GET
	@Path("listarCalificaciones")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Calificacion> getCalificaciones(){
		List<Calificacion> calificaciones = calificacionON.getlist();
		return calificaciones;
	}
//==========================================CLIENTES========================
	@POST
	@Path("crearCliente")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Respuesta crearCliente(Cliente cliente) {
		Respuesta respuesta;
		try {
			clienteON.insert(cliente);;
			respuesta = new Respuesta(1, "Guardado Satisfactoriamente");
		} catch (Exception e) {
			respuesta = new Respuesta(2,"No se guardo"+e.getMessage());
		}
		return respuesta;
	}
	
	@GET
	@Path("listarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> getClientes(){
		List<Cliente> clientes = clienteON.getlist();
		return clientes;
	}

}
