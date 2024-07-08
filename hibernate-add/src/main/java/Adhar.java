

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
@Id
private int aid;
private long no;
private String city;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public long getNo() {
	return no;
}
public void setNo(long no) {
	this.no = no;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
