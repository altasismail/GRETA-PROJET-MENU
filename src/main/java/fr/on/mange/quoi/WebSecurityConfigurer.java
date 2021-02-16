package fr.on.mange.quoi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    /*@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**")
                .permitAll();
    }

    @Bean
    public PasswordEncoder encode(){
        return new BCryptPasswordEncoder();
    }

}
