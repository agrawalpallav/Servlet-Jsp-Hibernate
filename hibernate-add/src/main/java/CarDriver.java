import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c = new Car();
		//c.setId(101);
		c.setName("alto");
		
		et.begin();
		em.persist(c);
		em.detach(c);
		c.setName("nano");
		em.merge(c);
		et.commit();
		
	
	}

}
