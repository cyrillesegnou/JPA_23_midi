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
		
	}}
