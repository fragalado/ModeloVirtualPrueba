package aplicacion.controladores;


import aplicacion.model.Accesos;
import aplicacion.model.Prueba;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Menu {

	public static void main(String[] args) {
		// 
		Accesos a  = new Accesos("Empl", "Empleados");
		Accesos a2  = new Accesos("Usu", "Usuarios");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Prueba p = new Prueba();
		p.setNombre("Fran");
		//entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
