

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
@OneToMany(mappedBy="b")
private List<Passenger>p;
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
public List<Passenger> getP() {
	return p;
}
public void setP(List<Passenger> p) {
	this.p = p;
}
}
