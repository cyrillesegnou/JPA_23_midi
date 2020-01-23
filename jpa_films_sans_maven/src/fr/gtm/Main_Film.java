package fr.gtm;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import fr.gtm.dao.FilmDao;
import fr.gtm.entities.Film;
public class Main_Film {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("film");
		FilmDao filmDao = new FilmDao(emf) ;
		
		List<Film> films = filmDao.findAll();
		for(Film f: films){
			System.out.println(f);
			}
		emf.close();
	}

}
