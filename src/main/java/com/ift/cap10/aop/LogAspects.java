package com.ift.cap10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author liufei
 * @since 2019/10/28
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.ift.cap10.bean.Calculator.div(int, int))")
    public void pointcut() {}

    @Before("pointcut()")
    public void logStart() {
        System.out.println("logStart----");
    }

    @After("pointcut()")
    public void logEnd() {
        System.out.println("logEnd----");
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("logReturn---返回值是：{" + result + "}");
    }

    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void logThrow(Exception exception) {
        System.out.println("logThrow----" + exception.getMessage());
    }

    @Around("pointcut()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("logAround----执行前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("logAround----执行后");
        return proceed;
    }


}
