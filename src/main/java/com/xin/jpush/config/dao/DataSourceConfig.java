package com.xin.jpush.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * 配置在application.properties中数据库的的driver，url，username，password
 */
@Configuration
@MapperScan("com.xin.jpush.dao")
public class DataSourceConfig {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        /**
         *<bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
         * 		<property name="driverClass" value="${jdbc.driver}" />
         * 		<property name="jdbcUrl" value="${jdbc.url}" />
         * 		<property name="user" value="${jdbc.username}" />
         * 		<property name="password" value="${jdbc.password}" />
         *
         * 		<property name="maxPoolSize" value="30" />
         * 		<property name="minPoolSize" value="10" />
         * 		<property name="autoCommitOnClose" value="false" />
         * 		<property name="checkoutTimeout" value="10000" />
         * 		<property name="acquireRetryAttempts" value="2" />
         * 	</bean>
         */
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(jdbcDriver);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUsername);
        comboPooledDataSource.setPassword(jdbcPassword);
        comboPooledDataSource.setMaxPoolSize(30);
        comboPooledDataSource.setMinPoolSize(10);
        comboPooledDataSource.setAutoCommitOnClose(false);
        comboPooledDataSource.setCheckoutTimeout(30000);
        comboPooledDataSource.setAcquireRetryAttempts(2);

        return comboPooledDataSource;
    }
}
