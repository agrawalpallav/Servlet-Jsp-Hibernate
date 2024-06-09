import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveSignIn {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MyKey mk = new MyKey();
		mk.setEmail("balagi@gmail.com");
		mk.setPhone(700223379);
		
		SignIn si = new SignIn();
		si.setMk(mk);
		si.setName("balaji");
		si.setAge(22);
		si.setPassword("1234");
		
		et.begin();
		em.persist(si);
		et.commit();
		
	}

}
