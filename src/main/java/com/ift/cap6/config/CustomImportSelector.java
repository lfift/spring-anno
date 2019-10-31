package com.ift.cap6.config;

import com.ift.cap6.bean.Finsh;
import com.ift.cap6.bean.Tiger;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liufei
 * @since 2019/10/11
 */
public class CustomImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata.getAnnotationTypes());
        return new String[] {Finsh.class.getCanonicalName(), Tiger.class.getName()};
    }
}
