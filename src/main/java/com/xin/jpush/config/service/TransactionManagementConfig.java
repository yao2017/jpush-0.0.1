package com.xin.jpush.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class TransactionManagementConfig implements TransactionManagementConfigurer {

    @Autowired
    private DataSource dataSource;

    /**
     * <bean id="transactionManager"
     * class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
     * <property name="dataSource" ref="dataSource" />
     * </bean>
     * <tx:annotation-driven transaction-manager="transactionManager" />
     *
     * @return
     */
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
