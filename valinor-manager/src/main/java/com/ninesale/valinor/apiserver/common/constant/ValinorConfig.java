package com.ninesale.valinor.apiserver.common.constant;

import com.pubpi.common.utils.PropertiesLoader;

/**
 * 全局配置
 * 
 * @author hawk
 *
 */
public class ValinorConfig {
	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader loader = new PropertiesLoader("config.properties");

	public static final String REDIS_KEY_PREFIX = loader.getProperty("redis.keyPrefix");
	/**
	 * 实时数据API接口IP
	 */
	public static final String REALTIME_SERVER_IP = loader.getProperty("realtime.server.ip", "127.0.0.1");
	/**
	 * 实时数据API接口IP
	 */
	public static final int REALTIME_SERVER_PORT = loader.getInteger("realtime.server.port", 11001);
	/**
	 * 实时数据API接口IP
	 */
	public static final String REALTIME_SERVER_IP_2 = loader.getProperty("realtimeforchannel.server.ip", "127.0.0.1");
	/**
	 * 实时数据API接口IP
	 */
	public static final int REALTIME_SERVER_PORT_2 = loader.getInteger("realtimeforchannel.server.port", 11002);
	/**
	 * 跨域域名
	 */
	public static final String CROSS_DOMAIN_URL = loader.getProperty("corss.domain.url", "*");
}
