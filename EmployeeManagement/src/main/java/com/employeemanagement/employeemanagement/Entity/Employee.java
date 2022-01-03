package com.employeemanagement.employeemanagement.Entity;

import lombok.*;

import javax.persistence.*;
@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_id")
    private Long id;
    @Column(name="First_Name")
    private String firstName;
    @Column(name="Last_Name")
    private String lastName;
    @Column(name="Email")
    private String email;


}
