package com.shopping.inventory;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name="description", columnDefinition="TEXT")
    private String description;
}
