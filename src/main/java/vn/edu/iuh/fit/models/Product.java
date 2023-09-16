package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(length = 150,nullable = false,unique = true)
    private String name;

    @Column(length = 200)
    private String description;

    private String unit;

    private String manufacturer_name;


    //product_id, name, description, unit, manufacturer_name, status
}
