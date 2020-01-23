package fr.gtm.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Contact;
public class ContactDao extends AbstractDao <Contact, Long>{
		public ContactDao(EntityManagerFactory emf) {
		super(Contact.class);		
				this.emf = emf;
	}
	//	@Override 
//	public void 
//	
	public List <Contact> findAll (){
		String jpql = "SELECT c FROM Contact AS c" ;
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createQuery(jpql, Contact.class).getResultList();
		em.close();
		return contacts ;
	}
	public List<Contact> findByNomLike(String nom) {
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createNamedQuery("Contact.findByNomLike", Contact.class).setParameter ("nom", nom).getResultList();
		em.close();
		return contacts;
		}
}