package net.masadora.example.mall.business.infrastructure.security;

import moe.src.leyline.framework.infrastructure.security.LeylineWebSecurityConfiguration;
import net.masadora.mall.business.service.UserService;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

/**
 * Created by bytenoob on 6/9/16.
 */
@Configuration
public class WebSecurityConfigurationImpl extends LeylineWebSecurityConfiguration<UserService> {

    public WebSecurityConfigurationImpl() {
        super(true);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http  .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .anyRequest().permitAll()
                .and().addFilterBefore(new CookieAuthenticationFilter(getUserDetailsService()),
                UsernamePasswordAuthenticationFilter.class).formLogin().and().addFilter(new ExceptionTranslationFilter(new BasicAuthenticationEntryPoint())).csrf().disable();

    }


}