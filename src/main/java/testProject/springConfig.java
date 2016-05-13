package testProject;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

/**
 * Created by Admin on 10.05.2016.
 */
@Configuration
@ComponentScan
public class springConfig {

    @Bean
    DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/TestDB");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("nba777");
        basicDataSource.setInitialSize(5);
        basicDataSource.setMaxTotal(10);
        return basicDataSource;
    }

    @Bean
    LocalSessionFactoryBean
}
