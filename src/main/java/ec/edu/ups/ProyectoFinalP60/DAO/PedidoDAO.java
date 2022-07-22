package ec.edu.ups.ProyectoFinalP60.DAO;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ProyectoFinalP60.modelo.Pedido;



@Stateless
public class PedidoDAO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Pedido pedido) {
		em.persist(pedido);
	}

	public void update(Pedido pedido) {
		em.merge(pedido);
	}
	
	public Pedido read(int codigo) {
		Pedido pedido = em.find(Pedido.class, codigo);
		return pedido;
	}
	
	public Pedido delete(int codigo ) {
		em.remove(this.read(codigo));		
		return null;	
	}
	
	public List<Pedido> list(){
		String jpql = "SELECT p FROM Pedido p";//		
		Query query = em.createQuery(jpql, Pedido.class);
		return query.getResultList();
	}
	

}
