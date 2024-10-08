package models;

import jakarta.persistence.*;

@Entity
@Table(name = "Tb_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    @Column(name = "username", length = 15, nullable = false, unique = true)
    private String username;
    @Column(name = "password", length = 25, nullable = false)
    private String password;
    @Column(name = "full_name", length = 50, nullable = false)
    private String full_name;
    @Column(name = "phone_number", length = 15, nullable = false)
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id_role", nullable = false)
    private Role role;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "status", nullable = false)
    private boolean status;
}
