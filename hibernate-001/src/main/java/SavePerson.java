import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p =new Person();
		p.setId(104);
		p.setName("Aman");
		p.setGender("male");
		p.setAge(24);
		
		et.begin();
		em.persist(p);
		et.commit();
		
		
	}

}
