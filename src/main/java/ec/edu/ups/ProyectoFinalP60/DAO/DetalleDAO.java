package ec.edu.ups.ProyectoFinalP60.DAO;

import java.util.List;
import ec.edu.ups.ProyectoFinalP60.modelo.DetalleFactura;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class DetalleDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert (DetalleFactura pro) {
		em.persist(pro);
	}
	
	public void update (DetalleFactura pro) {
		em.merge(pro);
	}
	
	public DetalleFactura read(int codigo) {
		DetalleFactura pro = em.find(DetalleFactura.class, codigo);
		return pro;
	}
	
	public List<DetalleFactura> getDetalleFactura(){
		String jpql = "Select d from DetalleFactura d";
		Query q = em.createQuery(jpql,DetalleFactura.class);
		return q.getResultList();
	}
}
