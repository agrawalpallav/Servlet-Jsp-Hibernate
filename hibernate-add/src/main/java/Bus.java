import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bus {
	@Id
	private int bid;
	private String number;
	private String type;
	//we cannot use mappedBy in @MTO annotation
	@OneToMany(mappedBy = "b")
	private List<Seat> Seats;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Seat> getSeats() {
		return Seats;
	}

	public void setSeats(List<Seat> seats) {
		Seats = seats;
	}
	
	

}
