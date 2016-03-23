/**   
* @Title: TestUpload.java 
* @Package com.ninesale.valinor.apiserver.junit.web.controller 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月30日 上午9:43:23 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.junit.web.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.pubpi.common.utils.BeanMapper;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月30日 上午9:43:23
 * 
 */
public class TestUpload {

	@Test
	public void test() throws ClientProtocolException, IOException {
		HttpClient httpclient = new DefaultHttpClient();

		// 请求处理页面
		HttpPost httppost = new HttpPost(
				"http://web.image.myqcloud.com/photos/v2/10000941/ninesale/0/7aab7e8cc189479889271dc31b808718?sign=PJ56Qza1YFjZPC8todRrdqoNeaBhPTEwMDAwOTQxJmI9bmluZXNhbGUmaz1BS0lEMXk3dmNsWmdIbXRIWVdMTjJSVjlhOTY4SXB0Z3FPUTYmZT0xNDQ4ODUyOTk1JnQ9MTQ0ODg0OTM5NSZyPTU4Nzk1MzczOSZ1PTAmZj0%3D");
		// 创建待处理的文件
		FileBody file = new FileBody(new File("E://1.png"));
		System.out.println(file.getContentType());
		// 创建待处理的表单域内容文本

		// 对请求的表单域进行填充
		MultipartEntity reqEntity = new MultipartEntity();
		reqEntity.addPart("FileContent", file);

		// 设置请求
		httppost.setEntity(reqEntity);
		// 执行
		HttpResponse response = httpclient.execute(httppost);
		// HttpEntity resEntity = response.getEntity();
		// System.out.println(response.getStatusLine());
		if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
			HttpEntity entity = response.getEntity();
			// 显示内容
			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));
			}
			if (entity != null) {
				entity.consumeContent();
			}
		}
	}

	@Test
	public void test1() throws ClientProtocolException, IOException {
		Obj1 obj1 = new Obj1();
		obj1.setDate(new Date());

		Obj2 obj2 = BeanMapper.map(obj1, Obj2.class);
		
		
		
		System.out.println(BeanMapper.map(obj2, Obj1.class).getDate());

	}
	
	@Test
	public void test2() throws ClientProtocolException, IOException {
		List<String> testList = new ArrayList<>();
		testList.addAll(null);
	}

}
