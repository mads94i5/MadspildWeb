package kea.madspild.dao;

import kea.madspild.ents.Signup;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Optional;

@Repository("signup-mysql")
public class SignupDto implements SignupDao {

    private Long id;
    private int zipCode;
    private String email;

    public SignupDto() {
    }

    public SignupDto(Long id, int zipCode, String email) {
        this.id = id;
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

    @Override
    public int addSignup(Signup signup) {
        return 0;
    }

    @Override
    public List<Signup> selectAllSignups() {
        return null;
    }

    @Override
    public Optional<Signup> selectSignupById(Long id) {
        return Optional.empty();
    }

    @Override
    public int deleteSignupById(Long id) {
        return 0;
    }

    @Override
    public int updateSignupById(Long id, Signup signup) {
        return 0;
    }
}
