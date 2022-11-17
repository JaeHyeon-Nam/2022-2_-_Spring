//package cbnu.capstone.tripwithme.config;
//
//import cbnu.capstone.tripwithme.service.LoginPwValidator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    LoginPwValidator loginPwValidator;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http
//                .authorizeRequests()
//                    .antMatchers("/chk").permitAll()
//                    .antMatchers("/manage").hasAnyAuthority("ROLE_ADMIN")
//                    .anyRequest().authenticated()
//                .and()
//                    .formLogin()
//                    .loginPage("/view/login")
//                    .loginProcessingUrl("/loginProc")
//                    .usernameParameter("id")
//                    .passwordParameter("pw")
//                    .defaultSuccessUrl("/view/dashboard",true)
//                    .permitAll()
//                .and()
//                    .logout()
//                    .logoutRequestMatcher(new AntPathRequestMatcher("/logoutProc")); // 다시 로그인 페이지로 이동 (생략했음)
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception{
//        web.ignoring().antMatchers("/static/js/**","/static/css/**","/static/img/**","/static/frontend/**");
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(loginPwValidator);
//    }
//
//}
