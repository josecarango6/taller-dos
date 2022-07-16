package co.com.poli.userservice.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;

    @NotEmpty(message = "El nombre no puede estar vacio")
    private String name;

    @NotEmpty(message = "El apellido no puede estar vacio")
    private String lastName;

}

