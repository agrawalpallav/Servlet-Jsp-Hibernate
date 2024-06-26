import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CM {
	@Id
	private String name;
	private int age;
	private String qualification;
	
	@OneToOne
	private State s;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	
	
}
