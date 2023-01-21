package com.shopping.inventory;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name="full_description", columnDefinition="TEXT")
    private String fullDescription;
    private String price;
}
