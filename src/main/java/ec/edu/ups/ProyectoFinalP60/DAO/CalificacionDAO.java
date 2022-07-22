package ec.edu.ups.ProyectoFinalP60.DAO;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ProyectoFinalP60.modelo.Calificacion;


@Stateless
public class CalificacionDAO implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	public EntityManager em;
	
	public void insert(Calificacion calificacion) {
		em.persist(calificacion);
	}
	
	public void update(Calificacion calificacion) {
		em.merge(calificacion);
	}
	
	public Calificacion read(int codigo) {
		Calificacion calificacion = em.find(Calificacion.class, codigo);
		return calificacion;
	}
	
	public Calificacion delete(int codigo) {
		em.remove(this.read(codigo));
		return null;
	}
	
	public List<Calificacion> list(){
		String jpql = "SELECT c FROM Calificacion c";
		Query query =  em.createQuery(jpql, Calificacion.class);
		return query.getResultList();
				
	}
	

}
