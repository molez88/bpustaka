package org.bpustaka.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by galih.lasahido@gmail.com on 2/5/14.
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.bpustaka.repositories")
@EntityScan(basePackages = "org.bpustaka.entity")
public class DatabaseConfig {

}
