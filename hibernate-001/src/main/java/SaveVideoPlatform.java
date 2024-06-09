import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVideoPlatform {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Platform p1 = new Platform();
		p1.setPid(201);
		p1.setName("youtube");
		
		Platform p2 = new Platform();
		p2.setPid(202);
		p2.setName("ULLU");
		
		Video v1 = new Video();
		v1.setVid(101);
		v1.setTitle("learn java");
		v1.setDuration(10);
		v1.setP(p1);
		
		Video v2 = new Video();
		v2.setVid(102);
		v2.setTitle("cooking");
		v2.setDuration(6);
		v2.setP(p1);
		
		Video v3 = new Video();
		v3.setVid(103);
		v3.setTitle("chatgpt");
		v3.setDuration(12);
		v3.setP(p1);
		
		Video v4 = new Video();
		v4.setVid(104);
		v4.setTitle("YOGA");
		v4.setDuration(9);
		v4.setP(p2);
		
		Video v5 = new Video();
		v5.setVid(105);
		v5.setTitle("CHOTA");
		v5.setDuration(4);
		v5.setP(p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(v1);
		em.persist(v2);
		em.persist(v3);
		em.persist(v4);
		em.persist(v5);
		et.commit();
		
		
		
		
	}
}
