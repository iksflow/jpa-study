import domain.Locker;
import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Member m1 = new Member();
        m1.setName("테스트");
        em.persist(m1);
//        em.flush();
        Locker l1 = new Locker();
        l1.setMemberId(m1);

        Locker l2 = new Locker();
        l2.setMemberId(m1);


        em.persist(l1);
        em.persist(l2);

        transaction.commit();

        em.close();
        emf.close();
    }
}
