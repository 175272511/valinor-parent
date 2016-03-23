package com.ninesale.valinor.apiserver.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSONObject;
import com.pubpi.common.utils.HashUtils;
import com.pubpi.common.utils.HttpUtils;

public class UserControllerTest {
	/**
	 * 用户登陆接口测试
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_login(String URL_BASE) {
		JSONObject req = new JSONObject();

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getrandom.do", req);
		String random = resp.getString("data");
		String phone = "13744444444";
		String password = "123456";
//		String loginType = "app";
		password = getRepeatSHA256(password, 10);
		password = HashUtils.hmacsha256(password, random);

		req.put("phone", phone);
//		req.put("loginType", loginType);
		req.put("password", password);

		resp = HttpUtils.getInstance().post(URL_BASE + "/user/userlogin.do", req);
		return resp;
	}
	/**
	 * 管理员登陆接口测试
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_manager_login(String URL_BASE) {
		//获取登录随机数
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getrandom.do", req);
		String random = resp.getString("data");
		
		String username = "admin";
		String password = "admin";
		password = getRepeatSHA256(password, 10);
		password = HashUtils.hmacsha256(password, random);

		req.put("username", username);
		req.put("password", password);

		resp = HttpUtils.getInstance().post(URL_BASE + "/manager/managerlogin.do", req);
		return resp;
	}
	
	
	/**
	 * 绑定微信
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_weixin_bind(String URL_BASE) {
		String weixinCode = "123456";

		JSONObject req = new JSONObject();
		req.put("weixinCode", weixinCode);

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/bindweixin.do", req);
		return resp;
	}

	/**
	 * 微信登陆接口
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_weixin_login(String URL_BASE) {
		String weixinCode = "wangtonghuan";

		JSONObject req = new JSONObject();
		req.put("weixinCode", weixinCode);

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/weixin_login.do", req);
		return resp;
	}

	/**
	 * 微信绑定确认接口
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_confirm(String URL_BASE) {
		JSONObject resp = HttpUtils.getInstance().get(URL_BASE + "/user/confirm.do");
		return resp;
	}

	/**
	 * 添加用户接口
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_add(String URL_BASE) {
		String username = "刘辉测试用账户" + System.currentTimeMillis();
		String password = "123456";
		Long roleId = 20L;

		JSONObject req = new JSONObject();
		req.put("username", username);
		req.put("password", getRepeatSHA256(password, 10));
		req.put("roleId", roleId);
		req.put("userType", 2);

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/add.do", req);
		return resp;
	}

	/**
	 * 获取用户列表
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_getlist(String URL_BASE) {
		String username = "刘辉测试用账户";
		int pageSize = 0;
		int currentPage = 0;

		JSONObject req = new JSONObject();
		req.put("username", username);
		req.put("userType", 2);
		req.put("pageSize", pageSize);
		req.put("currentPage", currentPage);

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getlist.do", req);
		return resp;
	}

	/**
	 * 删除用户
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_del(String URL_BASE) {
		Long userId = 0L;
		/**
		 * 先添加用户
		 */
		test_user_add(URL_BASE);

		/**
		 * 获取用户列表
		 */
		JSONObject tempResp = test_user_getlist(URL_BASE);
		if (tempResp.getJSONArray("data").size() > 0) {
			userId = tempResp.getJSONArray("data").getJSONObject(0).getLong("userId");
		}
		else {
			throw new RuntimeException("there is no user to delete");
		}

		JSONObject req = new JSONObject();
		req.put("userId", userId);

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/del.do", req);
		return resp;
	}

	/**
	 * 更新用户信息
	 * 
	 * @param URL_BASE
	 * @return
	 * 
	 * 
	 */
	public static JSONObject test_user_updatebymanager(String URL_BASE) {
		Long userId = 0L;
		/**
		 * 先添加用户
		 */
		test_user_add(URL_BASE);

		/**
		 * 获取用户列表
		 */
		JSONObject tempResp = test_user_getlist(URL_BASE);
		if (tempResp.getJSONArray("data").size() > 0) {
			userId = tempResp.getJSONArray("data").getJSONObject(0).getLong("userId");
		}
		else {
			throw new RuntimeException("there is no user to update");
		}

		String username = "刘辉更新用户信息测试" + System.currentTimeMillis();
		String password = "123456";

		JSONObject req = new JSONObject();
		req.put("userId", userId);
		req.put("username", username);
		req.put("password", getRepeatSHA256(password, 10));

		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/updatebymanager.do", req);
		return resp;
	}

	/**
	 * 查询登陆用户信息
	 * 
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_getinfo(String URL_BASE) {
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserinfo.do", new JSONObject());
		return resp;
	}
	
	/**
	 * 查询登陆用户信息
	 * 
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_getuserinfolist(String URL_BASE) {
		JSONObject req = new JSONObject();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("7");
		list.add("9");
		req.put("userIdList", list);
		System.out.println(req);
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserinfolist.do", req);
		return resp;
	}
	
	/**
	 * 获取用户绑定第三方信息
	 * 
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_getopeninfo(String URL_BASE) {
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getopeninfo.do", req);
		return resp;
	}

	/**
	 * 获取菜单列表
	 * 
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_getmenulist(String URL_BASE) {
		JSONObject resp = HttpUtils.getInstance().get(URL_BASE + "/user/getmenulist.do");
		return resp;
	}

	/**
	 * 登出
	 * 
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_logout(String URL_BASE) {
		JSONObject resp = HttpUtils.getInstance().get(URL_BASE + "/user/logout.do");
		return resp;
	}

	/**
	 * 用户注册
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_register(String URL_BASE) {
		JSONObject req = new JSONObject();
		String num = "0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 8; i++){
			sb.append(num.charAt(random.nextInt(num.length())));
		}
		String phone = "136" + sb.toString();
		
		//获取验证码
		req.put("phone", phone);
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/sendverifycode.do", req);
		
		if(resp.getInteger("code") == 0){
			
			String password = "123456";

			password = getRepeatSHA256(password, 10);
			
			req.put("password", password);
			req.put("verifyCode", "123456");
			resp = HttpUtils.getInstance().post(URL_BASE + "/user/register.do", req);
			
		}
		
		return resp;
	}
	
	
	/**
	 * 发送验证码
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_sendverifycode(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("phone", "13612345671");
		req.put("verifyCode", "123456");
		req.put("tid", "1234");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/sendverifycode.do", req);
		return resp;
	}
	
	/**
	 * 获取随机数
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getrandom(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("tid", "1234");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getrandom.do", req);
//		JSONObject resp = HttpUtils.getInstance().get(URL_BASE + "/user/getrandom.do");
		return resp;
	}
	
	/**
	 * 找回密码
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_findpwd(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("phone", "13611111111");
		req.put("password", HashUtils.sha256Hex("123456"));
		req.put("verifyCode", "123456");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/findpwd.do", req);
		return resp;
	}
	
	/**
	 * 添加用户地址
	 * @param URL_BASE
	 * @return
	 */
	public static JSONObject test_user_addAddress(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("province", "gd");
		req.put("city", "sz");
		req.put("area", "ba");
		req.put("road", "新安街道xxx");
		req.put("address", "佳华名苑");
		req.put("linkman", "张三");
		req.put("phone", "13612312312");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/adduseraddress.do", req);
		return resp;
	}
	public static JSONObject test_user_getUserAddress(String URL_BASE) {
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuseraddress.do", req);
		return resp;
	}
	public static JSONObject test_user_updateAddress(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("id", 4);
		req.put("province", "sh");
		req.put("city", "gz");
		req.put("area", "ns");
		req.put("road", "xx街道xxx");
		req.put("address", "xx名苑");
		req.put("linkman", "李四");
		req.put("phone", "13611111111");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/updateuseraddress.do", req);
		return resp;
	}
	/**
	 * 查询用户积分
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getUserPoints(String URL_BASE) {
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserpoints.do", req);
		return resp;
	}
	
	public static JSONObject test_user_sendHeader(String URL_BASE){
		//模拟app登录
//		JSONObject userResp = test_user_login(URL_BASE);
		
		JSONObject req = new JSONObject();
		Map<String, String> headerMap = new HashMap<String, String>();
//		headerMap.put("token", userResp.getJSONObject("data").getString("token"));
		headerMap.put("token", "d5e31297cbef49038a12991c021194fa");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserpoints.do", req, headerMap);
		return resp;
	}
	/**
	 * 添加用户发票
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_addReceipt(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("receiptType", "个人发票");
		req.put("receiptTitle", "发票抬头");
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/adduserreceipt.do", req);
		return resp;
	}
	/**
	 * 获取用户发票
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getReceipt(String URL_BASE) {
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserreceipt.do", req);
		return resp;
	}
	/**
	 * 删除用户发票
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_delReceipt(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("receiptId", 3);
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/deluserreceipt.do", req);
		return resp;
	}
	/**
	 * 查询用户订单信息
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getOrderInfo(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("pageSize", 0);
		req.put("currentPage", 0);
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserorderinfo.do", req);
		return resp;
	}
	/**
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getUserCollect(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("pageSize", 0);
		req.put("currentPage", 0);
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getusercollect.do", req);
		return resp;
	}
	/**
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_getUserWallet(String URL_BASE) {
		JSONObject req = new JSONObject();
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/getuserwallet.do", req);
		return resp;
	}
	
	private static String getRepeatSHA256(String password, int repeatNum){
		for(int i = 0; i < repeatNum; i++){
			password = HashUtils.sha256Hex(password + "4fe6eb0cd1ec87022a90e5acb4e7a2041d31d6e22c36265f722093482a6b20b74fe6eb0cd1ec87022a90e5acb4e7a2041d31d6e22c36265f722093482a6b20b7");
		}
		
		return password;
	}
	/**
	 * @param urlBase
	 * @return
	 */
	public static JSONObject test_user_updateuserinfo(String URL_BASE) {
		JSONObject req = new JSONObject();
		req.put("password", getRepeatSHA256("admin", 10));
		req.put("sex", 1);
		req.put("nickname", "admin");
		req.put("phone", "13611111111");
		req.put("email", "admin@yunjuhuihuang.com");
		req.put("address", "宝安佳华名苑");
		req.put("remark", "开发测试");
		req.put("downloadUrl", "https://static/img/xxx.jpg");
		req.put("manageUrl", "https://static/managerurl/xxx.jpg");
		req.put("fileId", "2f5f8860-279c-423e-a0c4-895a927853d8");
		req.put("imageText", "test");
		
		JSONObject resp = HttpUtils.getInstance().post(URL_BASE + "/user/updateuserinfo.do", req);
		
		return resp;
	}
	
}
