package com.ift.cap6.config;

import com.ift.cap6.bean.Pig;
import com.ift.cap6.bean.Cat;
import com.ift.cap6.bean.Dog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liufei
 * @since 2019/10/11
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (registry.containsBeanDefinition(Dog.class.getName()) &&
                registry.containsBeanDefinition(Cat.class.getName())) {
            registry.registerBeanDefinition("pig", new RootBeanDefinition(Pig.class));
        }
    }
}
