package ec.edu.ups.ProyectoFinalP60.DAO;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ProyectoFinalP60.modelo.Reserva;

@Stateless
public class ReservaDAO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;

	public void insert(Reserva reserva) {
		em.persist(reserva);
	}
	
	public void update(Reserva reserva ) {
		em.merge(reserva);
	}
	
	public Reserva read(int codigo) {
		Reserva reserva = em.find(Reserva.class, codigo);
		return reserva;
	}
	public Reserva delete(int codigo) {
		em.remove(this.read(codigo));
		return null;
	}
	
	public List<Reserva> list(){
		String jql = "SELECT r FROM Reserva r";
		Query query = em.createQuery(jql, Reserva.class);
		return query.getResultList();
	}
	

}
