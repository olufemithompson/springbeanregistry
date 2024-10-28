package io.github.olufemithompson.multibeanconfig;


import io.github.olufemithompson.multibeanconfig.BeanPropertyPostProcessor;
import io.github.olufemithompson.multibeanconfig.ConfigurationPropertyPostProcessor;
import io.github.olufemithompson.multibeanconfig.MultipleBeanDefinitionPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleBeanConfig {
    @Bean
    public BeanDefinitionRegistryPostProcessor multipleBeanDefinitionPostProcessor() {
        return new MultipleBeanDefinitionPostProcessor();
    }

    @Bean
    public BeanPostProcessor beanPropertyPostProcessor() {
        return new BeanPropertyPostProcessor();
    }
    @Bean
    public ConfigurationPropertiesBindingPostProcessor configurationPropertyPostProcessor() {
        return new ConfigurationPropertyPostProcessor();
    }
}
