package br.com.bamt.jpa.modelo;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {
	
	public static EntityManager getEntityManager() {
		javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
