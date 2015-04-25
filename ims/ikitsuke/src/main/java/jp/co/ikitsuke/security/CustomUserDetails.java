package jp.co.ikitsuke.security;

import java.util.Collection;
import java.util.Collections;

import jp.co.ikitsuke.model.LoginModel;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
    
    // ログインモデル
    private LoginModel login;
    
    public LoginModel getModel() {
        return login;
    }

    public void setModel(LoginModel model) {
        this.login = model;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return this.login.getLoginPassword();
    }

    @Override
    public String getUsername() {
        return String.valueOf(this.login.getUserId());
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
