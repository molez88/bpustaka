package org.bpustaka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.security.oauth2.sso.OAuth2SsoConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import javax.sql.DataSource;

/**
 * Created by galih.lasahido@gmail.com on 2/5/14.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Secured(value = "enabled")
public class SecurityConfig extends OAuth2SsoConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        ShaPasswordEncoder encoder = new ShaPasswordEncoder(512);
        auth.userDetailsService(jdbcDao()).passwordEncoder(encoder);
    }

    public JdbcDaoImpl jdbcDao() {
        JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
        jdbcDao.setEnableAuthorities(Boolean.FALSE);
        jdbcDao.setEnableGroups(Boolean.TRUE);
        jdbcDao.setUsersByUsernameQuery("SELECT USERNAME, PASSWORD, ACTIVE FROM MEMBER WHERE UPPER(USERNAME) = UPPER(?) ");
        jdbcDao.setGroupAuthoritiesByUsernameQuery("SELECT R.ID_ROLES, R.NAME AS GROUP_NAME, P.VALUE AS AUTHORITY " +
                "FROM USERS U INNER JOIN ROLES R ON U.ID_ROLES = R.ID_ROLES INNER JOIN " +
                "ROLES_PERMISSION RP ON RP.ID_ROLES = R.ID_ROLES INNER JOIN " +
                "PERMISSION P ON RP.ID_PERMISSION = P.ID_PERMISSION " +
                "WHERE UPPER(U.USERNAME) = UPPER(?) ");
        jdbcDao.setDataSource(dataSource);
        return jdbcDao;
    }
}
