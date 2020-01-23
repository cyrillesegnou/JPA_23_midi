package fr.gtm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AbstractDao <E, Id>{

	protected EntityManagerFactory emf;
	private Class<E> entityClass ;
	
	public AbstractDao(Class <E> clazz) {
		entityClass = clazz;
	}

	public E findById(Id id) {
		EntityManager em = emf.createEntityManager();
		E c = em.find(entityClass, id);
		em.close();
		return c ;
		
	}

//	public void saveOrUpdate(E e) {
//		if (c.getId() == 0){save (c);
//				}
//		else 
//		{
//			update(c);
//		}
//	}
//		
	public void save(E e) {	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		
	}

	public void update(E e) {	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();	
	}

	public E remove(Id id) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		E e = em.find(entityClass, id);
		em.remove(e);;
		em.getTransaction().commit();
		em.close();
		return e;
	}
}