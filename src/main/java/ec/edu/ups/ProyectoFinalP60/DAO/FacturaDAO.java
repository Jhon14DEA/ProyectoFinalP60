package ec.edu.ups.ProyectoFinalP60.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ProyectoFinalP60.modelo.FacturaCabecera;


@Stateless
public class FacturaDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert (FacturaCabecera pro) {
		em.persist(pro);
	}
	
	public void update (FacturaCabecera pro) {
		em.merge(pro);
	}
	
	public FacturaCabecera read(int codigo) {
		FacturaCabecera pro = em.find(FacturaCabecera.class, codigo);
		return pro;
	}
	
	public List<FacturaCabecera> getFactura(){
		String jpql = "Select f from Factura f";
		Query q = em.createQuery(jpql,FacturaCabecera.class);
		return q.getResultList();
	}
	
}
