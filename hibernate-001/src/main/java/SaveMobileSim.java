import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Sim s1 = new Sim();
		s1.setSid(103);
		s1.setProvider("BSNL");
		s1.setType("3G");
		
		Sim s2 = new Sim();
		s2.setSid(104);
		s2.setProvider("VI");
		s2.setType("4G");
		
		List<Sim> sims = new ArrayList<Sim>(); 
		sims.add(s1);
		sims.add(s2);
		
		Mobile m = new Mobile();
		m.setMid(202);
		m.setBrand("SAMSUNG");
		m.setPrice(60000);
		m.setSims(sims);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(m);
		et.commit();
		
		
	}
}
