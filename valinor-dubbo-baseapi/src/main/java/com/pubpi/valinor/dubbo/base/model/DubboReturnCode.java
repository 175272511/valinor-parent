package com.pubpi.valinor.dubbo.base.model;

public class DubboReturnCode {
	/**
	 * 成功
	 */
	public static final int SUCCESS = 0;

	/**
	 * 客户端弹窗提示
	 */
	public static final int ALERT_ERR = 1;

	/**
	 * 客户端记录日志
	 */
	public static final int CONSOLE_ERR = 2;

	/**
	 * 鉴权失败
	 */
	public static final int AUTH_FAILED = 10001;

	/**
	 * 微信号没有绑定
	 */
	public static final int OPENID_NO_USER = 10002;

	/**
	 * 微信号已经被其他账户绑定
	 */
	public static final int USER_HAVE_BINDING = 10003;

	/**
	 * 报表获取数据错误
	 */
	public static final int REPORT_GET_DATA_ERR = 20001;
	
	/**
	 * 微信获取数据错误
	 */
	public static final int WEIXIN_GET_DATA_ERR = 23001;
	
	/**
	 * 新浪获取数据错误
	 */
	public static final int SINA_GET_DATA_ERR = 23002;

}
