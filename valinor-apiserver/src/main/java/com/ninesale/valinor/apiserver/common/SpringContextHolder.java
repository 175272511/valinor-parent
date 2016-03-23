package com.ninesale.valinor.apiserver.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.apiserver.common.constant.ExceptionCode;
import com.pubpi.common.exception.ServiceException;

/**
 * 
 * @author hawk
 *
 */
@Service
@Lazy(false)
public class SpringContextHolder implements ApplicationContextAware, DisposableBean {
	private static Logger logger = LoggerFactory.getLogger(SpringContextHolder.class);

	private static ApplicationContext applicationContext = null;

	/**
	 * 获取applicationContext
	 * 
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		assertContextInjected();
		return applicationContext;
	}

	/**
	 * 根据名称获取bean
	 * 
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		assertContextInjected();
		return (T) applicationContext.getBean(name);
	}

	/**
	 * 根据类型获取bean
	 * 
	 * @param requiredType
	 * @return
	 */
	public static <T> T getBean(Class<T> requiredType) {
		assertContextInjected();
		return applicationContext.getBean(requiredType);
	}

	/**
	 * 清除SpringContextHolder中的ApplicationContext为Null.
	 */
	public static void clearHolder() {
		if (logger.isDebugEnabled()) {
			logger.debug("clear applicationContext" + applicationContext);
		}
		applicationContext = null;
	}

	/**
	 * 实现ApplicationContextAware接口, 注入Context到静态变量中.
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextHolder.applicationContext = applicationContext;

//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while(true){
//					
//				DbConnectionManager.validateCon();
//				try {
//					Thread.sleep(30000);
//				}
//				catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				}
//			}
//		});
//		thread.setName("");
//		thread.setDaemon(true);
//		thread.start();
	}

	/**
	 * 实现DisposableBean接口, 在Context关闭时清理静态变量.
	 */
	@Override
	public void destroy() throws Exception {
		SpringContextHolder.clearHolder();
	}

	/**
	 * 检查ApplicationContext不为空.
	 */
	private static void assertContextInjected() {
		if (null == applicationContext) {
			throw new ServiceException(ExceptionCode.SYSERR, "applicationcontext 注入失败");
		}
	}
}