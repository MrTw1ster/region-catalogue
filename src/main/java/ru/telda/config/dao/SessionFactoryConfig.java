package ru.telda.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SessionFactoryConfig {

    @Value("${mybatis.config-locations}")
    private String mybatisConfigFilePath;
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Value("${mybatis.mapper-locations}")
    private String mapperPath;
    @Value("{mybatis.type-aliases-package}")
    private String entityPackage;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean (); // Создать экземпляр SqlSession FactoryBean
        sqlSessionFactoryBean.setConfigLocation (new ClassPathResource(mybatisConfigFilePath)); // сканировать файл конфигурации mybatis;
        // Установить информацию о соединении с базой данных
        sqlSessionFactoryBean.setDataSource(dataSource);
        // Установить путь сканирования файла XML, соответствующего mapper mapper
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+mapperPath;
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
        // Устанавливаем путь сканирования класса сущностей
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
        return sqlSessionFactoryBean;
    }
}
