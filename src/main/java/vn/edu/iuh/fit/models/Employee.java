package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullname;

    @Column(nullable = false)
    private Date dob;

    @Column(length = 250,unique = true,nullable = true)
    private  String email;

    @Column(length = 12,nullable = false,unique = true)
    private String phone;

    @Column(length = 300,nullable = false)
    private String address;


    //emp_id, full_name, dob, email, phone, address, status
}
