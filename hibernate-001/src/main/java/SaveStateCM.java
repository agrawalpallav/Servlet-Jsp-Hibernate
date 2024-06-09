import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCM {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		State s = new State();
		s.setNo(1);
		s.setName("west bengal");
		s.setCapital("kolkata");
		
		CM cm = new CM();
		cm.setName("mamata didi");
		cm.setAge(68);
		cm.setQualification("CSE");
		s.setCm(cm);
		cm.setS(s);
		
		et.begin();
		em.persist(cm);
		em.persist(s);
		et.commit();
	}		
	
}
