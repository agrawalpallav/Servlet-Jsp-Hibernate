import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine  e= new Engine();
		e.setEid("201");
		e.setCc(160);
		
		Bike b1 = new Bike();
		b1.setBid(101);
		b1.setName("enfield");
		b1.setE(e);
		
		Bike b2 = new Bike();
		b2.setBid(102);
		b2.setName("TVS");
		b2.setE(e);
		
		e.setB(b1);
		e.setB(b2);
		
		et.begin();
		em.persist(e);
		em.persist(b1);
		em.persist(b2);
		et.commit();
		
		

	}
}
