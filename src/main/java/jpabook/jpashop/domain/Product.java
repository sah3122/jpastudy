package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

//    @ManyToMany(mappedBy = "member")
//    private List<Member> members = new ArrayList<>();
//
//    @OneToMany(mappedBy = "product")
//    private List<MemberProduct> memberProducts = new ArrayList<>();
    private String name;
}
