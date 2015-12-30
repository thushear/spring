package net.shopin.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * 说明:
 * User: kongming
 * Date: 14-6-5
 * Time: 下午2:53
 */
@Aspect
public class AfterReturningAdviceTest {

    @AfterReturning(returning = "rvt",pointcut = "execution(* net.shopin.aop.*.*(..))")
    public void log(Object rvt){
        System.out.println("获取目标方法的返回值" + rvt);
        System.out.println("模拟日志记录功能");
    }




}
