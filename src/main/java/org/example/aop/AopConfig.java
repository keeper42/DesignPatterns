package org.example.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 * <p>
 * AOP配置类
 * 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
 * </p>
 */
@Configuration
@ComponentScan("org.example")
@EnableAspectJAutoProxy
public class AopConfig {
}
