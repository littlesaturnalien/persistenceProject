package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Tb_User")
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    @Column(name = "username", length = 25, nullable = false, unique = true)
    private String username;
    @Column(name = "password", length = 25, nullable = false)
    private String password;
    @Column(name = "full_name", length = 50, nullable = false)
    private String full_name;
    @Column(name = "phone_number", length = 15, nullable = false)
    private String phone_number;
    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id_role", nullable = false)
    private Role role;

    @Column(name = "status", nullable = false)
    private boolean status;
}
