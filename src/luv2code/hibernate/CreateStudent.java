package luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
    public static void main(String[] args) {
        //create session Factory
SessionFactory factory = new Configuration()
        .configure()
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();
        try{
            //create a student object
            System.out.println("Creating student object");
Student tempStudent = new Student("Vasia", "Petrov", "Petrov@mail.ru");
            //start a transaction
session.beginTransaction();
            //save the student object
session.save(tempStudent);
            System.out.println("Object is saved");
            //commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
factory.close();
        }
    }
}
