

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class person {
@Id
private int aid;
private String NAme;
private  String Gender;
@OneToOne
private Adhar a;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getNAme() {
	return NAme;
}
public void setNAme(String nAme) {
	NAme = nAme;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public Adhar getA() {
	return a;
}
public void setA(Adhar a) {
	this.a = a;
}

}
