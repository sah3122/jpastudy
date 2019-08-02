package jpabook.jpashop.domain;

import javax.persistence.Entity;

/**
 * Created by dongchul on 2019-08-02.
 */
@Entity
public class Album extends Item{
    private String artist;
}
