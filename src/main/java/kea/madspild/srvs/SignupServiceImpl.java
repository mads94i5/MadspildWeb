package kea.madspild.srvs;

import kea.madspild.dao.SignupDao;
import kea.madspild.dao.SignupDto;
import kea.madspild.ents.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService {

    private final SignupDao signupDao;
    @Autowired
    public SignupServiceImpl(@Qualifier("signup-mysql") SignupDao signupDao) {
        this.signupDao = signupDao;
    }
    @Override
    public int save(SignupDto signupDto) {
        Signup signup = new Signup(signupDto.getZipCode(),
                signupDto.getEmail());
        return signupDao.addSignup(signup);
    }
}
