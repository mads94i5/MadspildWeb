package kea.madspild.ents;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NumberFormat
    private int zipCode;
    @Email
    private String email;

    public Signup() {
    }

    public Signup(Long id, int zipCode, String email) {
        this.id = id;
        this.zipCode = zipCode;
        this.email = email;
    }

    public Signup(int zipCode, String email) {
        this.zipCode = zipCode;
        this.email = email;
    }
}
