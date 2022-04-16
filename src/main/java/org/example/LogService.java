package org.example;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/16
 */
import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
// @Slf4j
public class LogService {

    private static Logger logger = LoggerFactory.getLogger(LogService.class);

    @Pointcut("@annotation(org.example.MethodLog)")
    public void methodCachePointcut() {}

    /**
     * 方法执行的前后调用
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("methodCachePointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        // 获取方法名
        String methodName = point.getSignature().getName();
        // 获取自定义注解描述
        String remark = getMethodRemark(point);
        // 获取类包
        String packages = point.getThis().getClass().getName();
        // 去掉CGLIB动态生成的类
        if (packages.indexOf("$$EnhancerBySpringCGLIB$$") > -1) {
            try {
                packages = packages.substring(0, packages.indexOf("$$"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        logger.info(methodName);

        Object object;
        try {
            // 获取方法参数
            point.getArgs();
            object = point.proceed();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return object;
    }

    /**
     * 获取自定义注解描述
     * @param joinPoint
     * @return
     * @throws Exception
     */
    public static String getMethodRemark(ProceedingJoinPoint joinPoint)
            throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        Class targetClass = Class.forName(targetName);
        Method[] method = targetClass.getMethods();
        String methode = "";
        for (Method m : method) {
            if (m.getName().equals(methodName)) {
                Class[] parameterTypes = m.getParameterTypes();
                if (parameterTypes.length == arguments.length) {
                    MethodLog methodCache = m.getAnnotation(MethodLog.class);
                    if (methodCache != null) {
                        methode = methodCache.remark();
                    }
                    break;
                }
            }
        }
        return methode;
    }

}

