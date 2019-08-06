package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

/**
 * Created by dongchul on 2019-07-24.
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    private int orderPrice;
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
