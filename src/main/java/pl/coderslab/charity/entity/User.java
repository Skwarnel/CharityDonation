package pl.coderslab.charity.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String street;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private String password;
}
