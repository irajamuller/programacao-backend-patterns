package br.com.patterns.creational.factory;

public class JavaFactoryExampleTest {

	public static void main(String[] args) {
		// Static Factory Method valueOf
		System.out.println(Integer.valueOf("1"));

		// Static Factory Method createEntityManagerFactory
		//EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("dev2");
		// Factory method createEntityManager
		//EntityManager em = emFactory.createEntityManager(); 
		//TypedQuery<Book> q = em.createQuery("SELECT b FROM Book b", Book.class); 
		//q.getResultList().stream().forEach(System.out::println);
	}

}
