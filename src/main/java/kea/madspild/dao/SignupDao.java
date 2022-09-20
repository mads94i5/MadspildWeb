package kea.madspild.dao;

import kea.madspild.ents.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupDao extends JpaRepository<Signup, Long> {

}
