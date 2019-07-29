package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by dongchul on 2019-07-24.
 */
public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em =  emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setName("teamB");
            em.persist(team);
            Member member = new Member();
            member.setUserName("member2");
            member.setTeam(team);
            em.persist(member);

            Member findMemeber = em.find(Member.class, member.getId());

            List<Member> members = findMemeber.getTeam().getMembers();

            for (Member member1 : members) {
                System.out.println(member1.getUserName());
            }


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
