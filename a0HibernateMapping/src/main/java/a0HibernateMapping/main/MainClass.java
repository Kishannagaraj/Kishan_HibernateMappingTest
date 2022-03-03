package a0HibernateMapping.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.a0HibernateMapping.entities.ClassRoom;
import com.a0HibernateMapping.entities.Instructor;
import com.a0HibernateMapping.entities.Students;

public class MainClass {

	public static void main(String[] args)
	{
			getStudent();
		
		     OneToMany();
		
	}
	
	
	public static void getStudent() {
		Configuration confg = new Configuration();
		confg.configure("com/config/Hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory() ;
		Session session = factory.openSession();
		
		Students students = session.get(Students.class, 11);
		
		System.out.println(" ");
		System.out.println("<-------getting deatil from student table-------> ");
		System.out.println(" ");
		
		System.out.println( "result  :::"+ students);
		
		session.close();
		factory.close();
	}
	
	public static void OneToMany() {
		Configuration confg = new Configuration();
		confg.configure("com/config/Hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory() ;
		Session session = factory.openSession();
		
		Instructor instructor = session.get(Instructor.class, 2);

		System.out.println(" ");
		System.out.println("<-------OneToMany-------> ");
		System.out.println(" ");
		
		System.out.println( "result  :::"+ instructor);

		
		session.close();
		factory.close();
	}
	
}
