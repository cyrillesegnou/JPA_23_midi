package fr.gtm.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Film;

public class FilmDao extends AbstractDao <Film, Long> {
	
	
	public FilmDao(EntityManagerFactory emf) {
		super(Film.class);		
				this.emf = emf;
	}

	public List <Film> findAll (){
		String jpql = "SELECT f FROM Film AS f" ;
		EntityManager em = emf.createEntityManager();
		List<Film> films = em.createQuery(jpql, Film.class).getResultList();
		em.close();
		return films ;
		
	}
	public List<Film> findByTitreLike(String titre) {
		EntityManager em = emf.createEntityManager();
		List<Film> films = em.createNamedQuery("Film.findByTitreLike", Film.class).setParameter ("titre", titre).getResultList();
		em.close();
		return films ;
		}	
}
//	}
////	public List<Film> findByAnnee(Date dateSortie) {
////		EntityManager em = emf.createEntityManager();
////		List<Film> films = em.createNamedQuery("Film.findByAnneeLike", 
////		Film.class).setParameter ("dateSortie", date).getResultList();
////		em.close();
////		return films;
////		}
//}