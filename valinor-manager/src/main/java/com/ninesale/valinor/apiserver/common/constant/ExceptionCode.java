package com.ninesale.valinor.apiserver.common.constant;

/**
 * Exception编码常量类
 * 
 * @author hawk
 *
 */
public interface ExceptionCode {
	/**
	 * 用户未登录
	 */
	int UNLOGIN = 50001;
	/**
	 * 参数错误
	 */
	int PARAM_ERROR = 50002;

	/**
	 * 系统错误
	 */
	int SYSERR = 50003;
	/**
	 * 登陆失败
	 */
	int LOGIN_FAILED = 50004;

	/**
	 * 数据库异常
	 */
	int SQL_ERR = 50005;

	/**
	 * 内部错误
	 */
	int INNER_ERR = 50006;
}
