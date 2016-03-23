package com.ninesale.valinor.apiserver.web.common.constant;

public interface RexpConstant {
	/**
	 * 用户名正则
	 */
	String USERNAME = "[\\u4E00-\\u9FFF|\\w|\\s|\\-|\\.]{1,64}";

	/**
	 * 密码正则
	 */
	String PASSWORD = "[a-zA-z0-9~!@#$%&_=<>\\.\\^\\*\\(\\)\\-\\+\\\\]{1,64}";

	/**
	 * 加密密码正则
	 */
	String ENCRYPT_PASSWORD = "[0-9a-f]{64}";

	/**
	 * IP地址或者域名
	 */
	String IP = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(\\w{1,10}(\\.\\w{1,10}){1,5})";

	/**
	 * 数据库名称正则
	 */
	String DBNAME = "[A-Za-z0-9_\\-\\.]{1,64}";

	/**
	 * 邮箱正则
	 */
	String EMAIL = "\\w{1,32}@(\\w+\\.){1,5}\\w{1,12}";

	/**
	 * 电话号码正则
	 */
	String PHONE = "(\\d{3,4}-\\d{7,8})|(\\d{11})|(\\d{7,8})";

	/**
	 * 地址正则
	 */
	String ADDRESS = "[\\x{4e00}-\\x{9fa5}A-Za-z0-9_\\-\\.]{1,64}";
}
