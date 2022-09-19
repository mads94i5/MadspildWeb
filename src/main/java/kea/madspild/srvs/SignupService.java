package kea.madspild.srvs;

import kea.madspild.dao.SignupDto;

public interface SignupService {
    int save(SignupDto signupDto);
}
