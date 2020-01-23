package fr.gtm.dao;

import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Contact;

public class ContactDao extends AbstractDao <Contact, Long>{
	
	public ContactDao(EntityManagerFactory emf) {
		super(Contact.class);
		
				this.emf = emf;

	}
}
