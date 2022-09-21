package kea.madspild.ents;
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "signups")
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NumberFormat
    @Min(value = 800, message = "Zipcode must be greater than or equal to 800")
    @Max(value = 9990, message = "Zipcode must be smaller than or equal to 9990")
    @Column(name = "zipcode")
    private int zipCode;
    @Email
    @Column(name = "email")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
