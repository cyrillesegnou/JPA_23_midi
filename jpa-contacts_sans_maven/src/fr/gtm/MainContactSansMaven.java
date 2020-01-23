package fr.gtm;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import fr.gtm.dao.ContactDao;
import fr.gtm.entities.Contact;
public class MainContactSansMaven {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contacts");
		ContactDao contactDao = new ContactDao (emf) ;
//		Contact c1 = contactDao.findById(45L);
//		System.out.println(c1);
//		
//		Contact c2 = new Contact("M", "Toto", "Titi");
//		contactDao.save(c2);
//		c2.setCivilite("Mme");emf
//		contactDao.update(c2);
//		
//		contactDao.remove(c2.getId());
	//	System.out.println(c2);
		
		List<Contact> contacts = contactDao.findAll();
		for (Contact c : contacts ) {
			System.out.println(c);
		}
		emf.close();
	}
}
