package com.ninesale.valinor.apiserver.web.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.client.ClientProtocolException;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class YuntuTest {
	
	// private static final String URL_BASE = "http://test.yuntubdp.com/cactus";
	private static final String URL_BASE = "http://127.0.0.1:8080/valinor-apiserver";
	private static final String URL_BASE_MANAGER = "http://127.0.0.1:6060/valinor-manager";
//	private static final String URL_BASE = "http://182.254.243.100/valinorapi";

	@Before
	public void setUp() {
		/**
		 * 管理员登陆
		 */
		JSONObject resp = UserControllerTest.test_manager_login(URL_BASE_MANAGER);
		System.out.println(resp.toJSONString());
//		/**
//		 * 登陆
//		 */
//		JSONObject resp = UserControllerTest.test_user_login(URL_BASE);
//		System.out.println(resp.toJSONString());
	}

	@Test
	public void test() throws ClientProtocolException, IOException {
		
		JSONObject resp = null;
//---------------------------鉴权---------------------------
//		/**
//		 * 发送验证码
//		 */
//		resp = UserControllerTest.test_user_sendverifycode(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 获取随机数
//		 */
//		resp = UserControllerTest.test_user_getrandom(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 注册
//		 */
//		resp = UserControllerTest.test_user_register(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 管理员登陆
//		 */
//		resp = UserControllerTest.test_manager_login(URL_BASE);
//		System.out.println(resp.toJSONString());
//		/**
//		 * 绑定微信
//		 */
//		resp = UserControllerTest.test_user_weixin_bind(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 微信登陆
//		 */
//		resp = UserControllerTest.test_user_weixin_login(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 登陆
//		 */
//		resp = UserControllerTest.test_user_login(URL_BASE);
//		System.out.println(resp.toJSONString());
//		/**
//		 * 微信确认登录
//		 */
//		resp = UserControllerTest.test_user_confirm(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 添加用户
//		 */
//		resp = UserControllerTest.test_user_add(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 找回密码
//		 */
//		resp = UserControllerTest.test_user_findpwd(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 获取用户列表
//		 */
//		resp = UserControllerTest.test_user_getlist(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 删除用户
//		 */
//		resp = UserControllerTest.test_user_del(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 管理员更新用户信息
//		 */
//		resp = UserControllerTest.test_user_updatebymanager(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 用户更新信息
//		 */
//		resp = UserControllerTest.test_user_updateuserinfo(URL_BASE);
//		System.out.println(resp);
//
		resp = UserControllerTest.test_user_getinfo(URL_BASE);
		System.out.println(resp);
//		/**
//		 * 根据用户id获取用户信息
//		 */
//		resp = UserControllerTest.test_user_getuserinfolist(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 获取用户绑定第三方信息
//		 */
//		resp = UserControllerTest.test_user_getopeninfo(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 查询菜单信息列表
//		 */
//		resp = UserControllerTest.test_user_getmenulist(URL_BASE);
//		System.out.println(resp);
//
//		/**
//		 * 登出
//		 */
//		 resp = UserControllerTest.test_user_logout(URL_BASE);
//		 System.out.println(resp);
		
//---------------------------用户信息---------------------------
//		/**
//		 * 添加用户地址
//		 */
//		resp = UserControllerTest.test_user_addAddress(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 获取用户地址
//		 */
//		resp = UserControllerTest.test_user_getUserAddress(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 更新用户地址
//		 */
//		resp = UserControllerTest.test_user_updateAddress(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 获取用户积分
//		 */
//		resp = UserControllerTest.test_user_getUserPoints(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 测试app登录会话保持
//		 */
//		resp = UserControllerTest.test_user_sendHeader(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 添加发票
//		 */
//		resp = UserControllerTest.test_user_addReceipt(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 查询发票
//		 */
//		resp = UserControllerTest.test_user_getReceipt(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 删除发票
//		 */
//		resp = UserControllerTest.test_user_delReceipt(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 查询用户订单
//		 */
//		resp = UserControllerTest.test_user_getOrderInfo(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 查询用户收藏
//		 */
//		resp = UserControllerTest.test_user_getUserCollect(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 查询用户钱包
//		 */
//		resp = UserControllerTest.test_user_getUserWallet(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 联系人信息上传
//		 */
//		resp = UserControllerTest.test_user_uploadcontacts(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 联系人匹配信息查询
//		 */
//		resp = UserControllerTest.test_user_getcontacts(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注人员数与粉丝人数查询
//		 */
//		resp = UserControllerTest.test_user_getpersoncount(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 添加关注人
//		 */
//		resp = UserControllerTest.test_user_concern(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 取消关注人
//		 */
//		resp = UserControllerTest.test_user_cancelconcern(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注笔记
//		 */
//		resp = UserControllerTest.test_user_concernnote(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 取消关注笔记
//		 */
//		resp = UserControllerTest.test_user_cancelconcernnote(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注标签
//		 */
//		resp = UserControllerTest.test_user_concerntag(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 取消关注标签
//		 */
//		resp = UserControllerTest.test_user_cancelconcerntag(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注人列表
//		 */
//		resp = UserControllerTest.test_user_getconcernpersonlist(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注笔记列表
//		 */
//		resp = UserControllerTest.test_user_getconcernnotelist(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 关注标签列表
//		 */
//		resp = UserControllerTest.test_user_getconcerntaglist(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 用户点赞
//		 */
//		resp = UserControllerTest.test_user_praise(URL_BASE);
//		System.out.println(resp);
//		/**
//		 * 用户取消点赞
//		 */
//		resp = UserControllerTest.test_user_cancelpraise(URL_BASE);
//		System.out.println(resp);
//				
				
				
//------------------------用户信息end-------------------------------
		
		
//		resp = MerchantControllerTest.test_merchant_add(URL_BASE);
//		System.out.println(resp);
//
//		resp = MerchantControllerTest.test_merchant_getlist(URL_BASE);
//		System.out.println(resp);
//
//		resp = MerchantControllerTest.test_merchant_update(URL_BASE);
//		System.out.println(resp);
//
//		resp = MerchantControllerTest.test_merchant_del(URL_BASE);
//		System.out.println(resp);
//
//		resp = PageControllerTest.test_page_customemerchantpage(URL_BASE);
//		System.out.println(resp);
//
//		resp = PageControllerTest.test_page_customeuserpage(URL_BASE);
//		System.out.println(resp);
//
//		resp = PageControllerTest.test_page_getmerchantpageinfo(URL_BASE);
//		System.out.println(resp);
//
//		resp = PageControllerTest.test_page_getuserpageinfo(URL_BASE);
//		System.out.println(resp);
	}

//	@Test
//	public void test1() {
//		JSONObject resp = ReportControllerTest.test_report_getreportsofpage(URL_BASE);
//		System.out.println(resp.toJSONString());
//
//		resp = ReportControllerTest.test_report_viewdata(URL_BASE);
//		System.out.println(resp.toJSONString());
//	}
//
//	@Test
//	public void test2() {
//		JSONObject resp = ReportControllerTest.test_report_add(URL_BASE);
//		System.out.println(resp.toJSONString());
//
//	}
//
//	@Test
//	public void test3() {
//		JSONObject resp = ReportControllerTest.test_report_getlist(URL_BASE);
//		System.out.println(resp.toJSONString());
//	}
//
//	@Test
//	public void test4() {
//		JSONObject resp = ReportControllerTest.test_report_getdata(URL_BASE);
//		System.out.println(resp.toJSONString());
//	}
//
	
//	junit本身不支持多线程测试,这是因为Junit的底层实现上，是用System.exit退出用例执行的,因此多线程会出现提前中断的情况,下列测试需通过其他方法测试
//	@Test
//	public void test9() {
//		for (int i = 0; i < 1; i++) {
//			Thread thread = new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					for (int j = 0; j < 10000; j++) {
//						JSONObject resp;
//						JSONObject req = new JSONObject();
//						req.put("reportId", 153L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//
//						req.put("reportId", 84L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//
//						req.put("reportId", 83L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//
//						req.put("reportId", 82L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//
//						req.put("reportId", 81L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//
//						req.put("reportId", 80L);
//						resp = HttpUtils.getInstance().post(URL_BASE + "/report/getdata.do", req);
//						System.out.println(resp);
//					}
//				}
//			});
//			
//			thread.start();
//
//		}
//	}
	
	
	
	public static void main(String[] args) {
		Pattern referer_pattern = Pattern.compile("(@([^@^\\s^:]{1,})([\\s\\:\\,\\;]{0,1}))+");
		Matcher matchr = referer_pattern.matcher("fdsfs@  @123456;@ewqs dsads");
		System.out.println(matchr.find());
		String origion_str = matchr.group();
		System.out.println("-->" + origion_str);
		
		
	}
}
