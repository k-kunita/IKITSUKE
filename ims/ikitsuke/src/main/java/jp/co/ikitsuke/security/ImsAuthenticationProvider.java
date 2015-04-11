package jp.co.ikitsuke.security;

import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.model.LoginModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.StringUtils;

public class ImsAuthenticationProvider implements AuthenticationProvider {

    static public final String PASSWORD_DELIMITER = ":";
    private UserDetailsService userDetailsService;
    
    @Autowired
    LoginLogic loginLogic;
    
    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {
        // TODO 自動生成されたメソッド・スタブ

        // パスワードを展開してリクエストの各種値を取得する
        String id = auth.getName();
        String complexPasswd = auth.getCredentials().toString();

        // チャレンジとパスワードに展開する
        int pos = complexPasswd.indexOf(PASSWORD_DELIMITER);
        if (!StringUtils.hasText(complexPasswd) || pos < 0) {
            throw new BadCredentialsException("認証エラー発生");
        }

        // 認証
        if (ImsAuthenticate(id, complexPasswd)) {
            auth = createAuthentication(id, (UsernamePasswordAuthenticationToken) auth);
        } else {
            throw new BadCredentialsException("認証エラー発生");
        }

        return auth;
    }

    /***
     * 認証処理
     * @param id
     * @param passwd
     * @return
     */
    protected boolean ImsAuthenticate(String id, String passwd) {

        boolean isRegularUser = false;
        
        LoginModel loginModel = loginLogic.executeLogin(id, passwd);
        
        if(loginModel ){
            
        }
        
        
        
        return isRegularUser;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    /*
     * 認証手形を発行する（作り直す） たいていの場合、指紋認証はロールの情報を持っていない。 DBにIDとロールを登録しているので、DBなどから情報を取得する処理をする。
     */
    protected final Authentication createAuthentication(String username, UsernamePasswordAuthenticationToken token) throws AuthenticationException {
        UsernamePasswordAuthenticationToken auth;
        UserDetails loadedUser;
        try {
            loadedUser = getUserDetailsService().loadUserByUsername(username);
        } catch (DataAccessException repositoryProblem) {
            throw new AuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }

        if (loadedUser == null) {
            throw new AuthenticationServiceException("UserDetailsService returned null, which is an interface contract violation");
        }

        // 指紋認証のため特にパスワードは不要。
        auth = new UsernamePasswordAuthenticationToken(token.getPrincipal(), "dummy　passwd", token.getAuthorities());
        auth.setDetails(loadedUser);

        return auth;
    }

    public UserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}
