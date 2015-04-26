package jp.co.ikitsuke.security;

import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.model.LoginModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    LoginLogic loginLogic;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        LoginModel model = loginLogic.getModel(username);
//
//        if (model == null || model.getMailAddress() == null) {
//            throw new UsernameNotFoundException("login_mail_address:" + username);
//        }
//
//        CustomUserDetails user = this.createUserDetails(model);

        return null;
    }

    private CustomUserDetails createUserDetails(LoginModel model) {

        CustomUserDetails user = new CustomUserDetails();
        user.setModel(model);
        
        return user;
    }
}
