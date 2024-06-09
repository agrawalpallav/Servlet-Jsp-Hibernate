import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveGirlBoys {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Girl g = new Girl();
		g.setName("SUNNY");
		
		Boy b1 = new Boy();
		b1.setName("GANESH");
		b1.setG(g);
		
		Boy b2 = new Boy();
		b2.setName("TANMAY");
		b2.setG(g);
		
		Boy b3 = new Boy();
		b3.setName("PRAKASH");
		b3.setG(g);
		
		Boy b4 = new Boy();
		b4.setName("PRAVEEN");
		b4.setG(g);
		
		Boy b5 = new Boy();
		b5.setName("BALAJI");
		
		List<Boy> boys = new ArrayList<Boy>();
		boys.add(b1);
		boys.add(b2);
		boys.add(b3);
		boys.add(b4);
		
		g.setBoyfriends(boys);
		
		et.begin();
		em.persist(g);
		et.commit();
	}

}
