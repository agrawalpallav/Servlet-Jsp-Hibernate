import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		//String hql = "SELECT p FROM Person p";
		String hql = "FROM Person";
		
		Query q = em.createQuery(hql);
		
		List<Person> persons = q.getResultList();
		
		for(Person p : persons) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getGender());
			System.out.println("------------------");
		}
		
	}
}
//make emp class cid,ename,sal,dept
//save,update,delete,findall,find