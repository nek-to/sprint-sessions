package com.bpp;

import com.annotations.Sorter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class StudentServiceBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(">>>>>" + bean.getClass().getName());
        Class<?> metaData = bean.getClass();
        Field[] declaredFields = metaData.getDeclaredFields();
        List list;
        for(Field field : declaredFields){
            if (field.isAnnotationPresent(Sorter.class)){
                System.out.println(">>>" + field.getName());
                field.setAccessible(true);
                try {
                    list=(List) field.get(bean);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                Collections.sort(list);
            }
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
