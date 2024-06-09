import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 101);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getId());
	}
}
