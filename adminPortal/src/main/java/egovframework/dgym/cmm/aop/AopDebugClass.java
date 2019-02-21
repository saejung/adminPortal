package egovframework.dgym.cmm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AopDebugClass	{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* egovframework.dgym.*..controller.*.*(..)) or execution(* egovframework.dgym.*..service.impl.*.*(..)) or execution(* egovframework.dgym.*..dao.impl.*.*(..))")
	public void before(JoinPoint joinPoint){
        logger.debug("before:" + joinPoint.getSignature());
        
        int i=0;        
        for(Object argObj : joinPoint.getArgs()){
        	if(argObj != null){
        		logger.debug("args["+ i +"] = " + argObj.toString());
        	}else{
        		logger.debug("args["+ i +"] = null");
        	}
            i++;
        }
    }
	
	@AfterReturning(pointcut="execution(* egovframework.dgym.*..controller.*.*(..)) or execution(* egovframework.dgym.*..service.impl.*.*(..)) or execution(* egovframework.dgym.*..dao.impl.*.*(..))", returning="ret")
	public void afterReturning(JoinPoint joinPoint, Object ret){
		logger.debug("afterReturning:" + joinPoint.getSignature() + "," + ((ret != null) ? ret.toString() : ""));
	}
    
	@After("execution(* egovframework.dgym.*..controller.*.*(..)) or execution(* egovframework.dgym.*..service.impl.*.*(..)) or execution(* egovframework.dgym.*..dao.impl.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.debug("after:" + joinPoint.getSignature());
    }
}