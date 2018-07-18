package com.qma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.qma.repository.AlunoRepository;

@EnableWebSecurity
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	//private ImplementsUserDetailsService userDetailsService;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
                .antMatchers("/", "/aluno", "/tutor", "/todosTutores").permitAll()
                .antMatchers("/alunos", "/tutores").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
            .formLogin()
            	.loginPage("/login")
                .permitAll()
                .and()
            .logout()
            	.permitAll();
                
    }
	
	
	/*@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
			.antMatchers("/", "/cadastrarAluno").permitAll()
			.antMatchers("/todosAlunos").hasRole("ADMIN")
			.anyRequest().authenticated().and()
		.formLogin()
         	.loginPage("/login")
            .permitAll()
            .and()
         .logout()
         	.permitAll();
	}
	
	/*@Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("fab")
                .password("777")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }*/
	
	public void REALconfigureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService());
	}
	
	@Bean
	protected UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Autowired
			AlunoRepository al;
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				UserDetails user =
			             User.withDefaultPasswordEncoder()
			                .username(al.findByMatricula(username).getMatricula())
			                .password("777")
			                .roles("ADMIN")
			                .build();

			        return user;
			}

		};
	}

	/*@Bean
	protected UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Autowired
			AlunoRepository al;
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// Account account = accountRepository.findByUsername(username);
				if ("teste" != null) {
					return new User(al.findByMatricula(username).getMatricula(), "777", true, true, true, true,
							AuthorityUtils.createAuthorityList("ADMIN"));
				} else {
					throw new UsernameNotFoundException("could not find the user '" + username + "'");
				}
			}

		};
	}*/

}
