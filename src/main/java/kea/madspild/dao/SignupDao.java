package kea.madspild.dao;

import kea.madspild.ents.Signup;

import java.util.List;
import java.util.Optional;

public interface SignupDao {
    int addSignup(Signup signup);
    List<Signup> selectAllSignups();
    Optional<Signup> selectSignupById(Long id);
    int deleteSignupById(Long id);
    int updateSignupById(Long id, Signup signup);
}
