package com.skynet.systemstore.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(dataSource)
				.passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("SELECT usu_username, usu_password, usu_ativo FROM usuarios WHERE usu_username=?")
				.authoritiesByUsernameQuery("SELECT u.usu_username, aut.aut_descricao FROM usuarios u"
											+" JOIN usuarios_autorizacao ua ON (u.usu_usuarios_id = ua.uat_usu_usuarios_id)"
											+" JOIN autorizacao aut ON (ua.uat_aut_autorizacao_id = aut.aut_autorizacao_id) WHERE u.usu_username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/javax.faces.resource/**", "/", "index.jsp").permitAll()
			.antMatchers("/dashboard.xhtml").authenticated()
			.and()
			.formLogin().loginPage("/login.xhtml")
			.failureUrl("/login.xhtml?error=true")
			.usernameParameter("j_username").passwordParameter("j_password").permitAll()
			.and()
			.logout()
			.invalidateHttpSession(true)
			.deleteCookies("JSESSIONID")
			.and()
			.csrf();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}
