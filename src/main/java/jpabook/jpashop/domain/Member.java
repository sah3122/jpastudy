package jpabook.jpashop.domain;

import javax.persistence.*;

/**
 * Created by dongchul on 2019-07-24.
 */
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name ="USERNAME")
    private String userName;

//    @Column(name = "TEAM_ID")
//    private Long teamId;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Team team;

    @OneToOne
    @JoinColumn(name ="LOCKER_ID")
    private Locker locker;


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
