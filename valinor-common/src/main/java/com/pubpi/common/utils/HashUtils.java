package com.pubpi.common.utils;

import java.security.GeneralSecurityException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * hash 方法类
 * 
 * @author hawk
 *
 */
public class HashUtils {

	/**
	 * md5加密
	 *
	 * @param value
	 *            要加密的值
	 * @return md5加密后的值
	 */
	public static String md5Hex(String value) {
		return DigestUtils.md5Hex(value);
	}

	/**
	 * sha1加密
	 *
	 * @param value
	 *            要加密的值
	 * @return sha1加密后的值
	 */
	public static String sha1Hex(String value) {
		return DigestUtils.sha1Hex(value);
	}

	/**
	 * sha256加密
	 *
	 * @param value
	 *            要加密的值
	 * @return sha256加密后的值
	 */
	public static String sha256Hex(String value) {
		return DigestUtils.sha256Hex(value);
	}

	/**
	 * 
	 * @param input
	 * @param key
	 * @param algo
	 * @return
	 */
	private static byte[] hmac(byte[] input, byte[] key, String algo) {
		try {
			SecretKey secretKey = new SecretKeySpec(key, algo);
			Mac mac = Mac.getInstance(algo);
			mac.init(secretKey);
			return mac.doFinal(input);
		}
		catch (GeneralSecurityException e) {
			throw Exceptions.unchecked(e);
		}
	}

	/**
	 * hmacsha256算法
	 * 
	 * @param input
	 * @param key
	 * @return
	 */
	public static byte[] hmacsha256(byte[] input, byte[] key) {
		return hmac(input, key, "HmacSHA256");
	}

	/**
	 * hamcsha256算法
	 * 
	 * @param input
	 * @param key
	 * @return
	 */
	public static String hmacsha256(String input, String key) {
		return Encodes.encodeHex(hmacsha256(input.getBytes(), key.getBytes()));
	}
}