package com.springboot.config

import com.springboot.service.GuestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.util.matcher.AntPathRequestMatcher
import org.springframework.util.AntPathMatcher


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Autowired
    private lateinit var guestService: GuestService

    @Bean
    fun bCryptPasswordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    override fun configure(http: HttpSecurity){
        http.csrf().disable()
        http.formLogin()
            .loginPage("/guest/login")
            .usernameParameter("userId")
            //.failureUrl("/guest/login/error")
            .defaultSuccessUrl("/order/list")
            .and()
            .logout()
            .logoutRequestMatcher(AntPathRequestMatcher("/guest/logout"))
            .logoutSuccessUrl("/guest/login")
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        super.configure(auth)
        if (auth != null) {
            auth.userDetailsService(guestService)
                .passwordEncoder(bCryptPasswordEncoder())
        }
    }
}