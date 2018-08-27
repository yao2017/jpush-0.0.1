package com.xin.jpush.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SessionFactoryConfig {
    /**
     * 配置mybatis的mapper路径，对应dao层扫描的路径
     */
    @Value("${mybatis_config_file}")
    private String mybatisConfigFile;

    public void setMybatisConfigFile(String mybatisConfigFile) {
        this.mybatisConfigFile = mybatisConfigFile;
    }

    @Value("${mapper_path}")
    private String packageSearchPath;

    public void setPackageSearchPath(String packageSearchPath) {
        this.packageSearchPath = packageSearchPath;
    }

    @Value("${type_alias_package}")
    private static String typeAliasPackage;
    @Autowired
    private DataSource dataSource;

    /**
     * <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
     * <property name="dataSource" ref="dataSource" />
     * <property name="configLocation" value="classpath:mybatis-config.xml" />
     * <property name="typeAliasesPackage" value="com.xin.Jpush.entity" />
     * <property name="mapperLocations" value="classpath*:mapper/*.xml" />
     * </bean>
     *
     * @return
     * @throws IOException
     */

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        //创造实例
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //添加mapper扫描路径
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFile));
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
        //设置datasource
        sqlSessionFactoryBean.setDataSource(dataSource);
        //设置typealias包的扫描路径
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
        return sqlSessionFactoryBean;
    }
}
