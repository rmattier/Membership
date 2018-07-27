import org.hibernate.HibernateException;

import javax.persistence.*;

public class JPATest {
    private static final String PERSISTENCE_UNIT_NAME = "Member";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory             = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em    = factory.createEntityManager();

        em.getTransaction().begin();

        Member member           = new Member();

        member.setFirstName("Timmy");
        member.setLastName("Grant");
        member.setEmail("timmy.grant@tester.com");

        try {
            em.persist(member);
            em.getTransaction().commit();
            em.close();
        }
        catch (HibernateException he) {
            System.out.println("Hibernate Error: " + he);
        }
    }
}

