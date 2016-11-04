package br.edu.ifsp.regesc.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.regesc.models.Student;

public class Test {

	public static void main(String[] args) {
		// nome da unidade de persistência definida em persistance.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("regesc");
		
		EntityManager manager = factory.createEntityManager();
		
		Student student = new Student("Goku do Serrado", 30);
		
		manager.getTransaction().begin();
		
		manager.persist(student);
		
		manager.getTransaction().commit(); // ta ok, pode confirmar no banco
		
		manager.close();		
	}

}
