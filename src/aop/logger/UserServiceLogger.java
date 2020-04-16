package aop.logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import aop.logger.UserServiceLogger;

public class UserServiceLogger {
	private Logger log=Logger.getLogger(UserServiceLogger.class);
	//调用方法前的增强方法
	public void before(JoinPoint jp) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"的方法"
				+Arrays.toString(jp.getArgs()));
		
	}
	//调用报存方法后的增强方法
	public void after(JoinPoint jp,Object result) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法，方法返回值："+result);
	}
}
