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
import ec.edu.ups.ProyectoFinalP60.modelo.Calificacion;

@Path("restaurante")
public class CalificacionService {
	
	@Inject
	private CalificacionDAO calificacionON;
	
	@POST
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
	@Produces(MediaType.APPLICATION_JSON)
	public List<Calificacion> getCalificaciones(){
		List<Calificacion> calificaciones = calificacionON.getlist();
		return calificaciones;
	}
	
}
