import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");

	}

}
