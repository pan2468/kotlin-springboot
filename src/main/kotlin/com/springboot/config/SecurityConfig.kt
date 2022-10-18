package com.springboot.config

import com.springboot.service.GuestService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.util.matcher.AndRequestMatcher


@Configuration
@EnableWebSecurity
class SecurityConfig() : WebSecurityConfigurerAdapter() {

    private lateinit var guestService: GuestService

    @Override
    protected override fun configure(http : HttpSecurity)  {
        http.formLogin()
            .loginPage("guest/login")
            .defaultSuccessUrl("order/list")
            .usernameParameter("email")
            .failureForwardUrl("guest/login/error")
            .and()
            .logout()
            .logoutSuccessUrl("guest/logout")
    }

    @Bean
    fun passwordEncoder() : BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Override
    protected override fun configure(auth : AuthenticationManagerBuilder) {
        auth.userDetailsService(guestService)
            .passwordEncoder(passwordEncoder())
    }
}