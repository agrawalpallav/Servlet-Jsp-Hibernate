import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Seat {
	@Id
	private int sno;
	private String color;
	@ManyToOne
	@JoinColumn
	private Bus b;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bus getB() {
		return b;
	}
	public void setB(Bus b) {
		this.b = b;
	}
	
	

}
