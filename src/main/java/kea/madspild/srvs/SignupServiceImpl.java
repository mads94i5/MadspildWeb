package kea.madspild.srvs;
import kea.madspild.dao.SignupDao;
import kea.madspild.ents.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SignupServiceImpl implements SignupService {
    private final SignupDao signupDao;
    @Autowired
    public SignupServiceImpl(SignupDao signupDao) {
        this.signupDao = signupDao;
    }
    @Override
    public Signup save(Signup signup) {
        return signupDao.save(signup);
    }
}
