package ec.edu.ups.ProyectoFinalP60.DAO;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ProyectoFinalP60.modelo.Cliente;


@Stateless
public class ClienteDAO implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cliente cliente ) {
		em.persist(cliente);
	}

	public void update(Cliente cliente ) {
		em.merge(cliente);
	}
	
	public Cliente read(String cedula) {
		Cliente cliente = em.find(Cliente.class, cedula);
		return cliente;
	}
	
	public Cliente delete(String cedula) {
		em.remove(this.read(cedula));		
		return null;	
	}
	
	public List<Cliente> getlist(){
		String jpql = "SELECT c FROM Cliente c";
		Query query = em.createQuery(jpql, Cliente.class);
		return query.getResultList();
	}
	
}
