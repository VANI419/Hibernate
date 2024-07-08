import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpLifeTest {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vani");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	 
	//transiant state
	Employee e=new Employee();
	e.setEname("WARD");
	e.setSal(1200);
	
	et.begin();
	//persist state
	em.persist(e);
	//detached state
	em.detach(e);
	e.setEname("ALLEN");
	
	//persist state
	em.merge(e);
	
	et.commit();
}
}
