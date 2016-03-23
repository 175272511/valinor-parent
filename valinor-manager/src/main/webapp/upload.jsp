<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page session="false"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
<title>腾讯云万象优图 - 示例程序</title>
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/jquery.form.min.js"></script>
<script type="text/javascript" src="js/zepto.min.js"></script>
</head>

<div>
	<h2>腾讯云万象优图 - 示例程序</h2>
    <form id="uploadForm">
    	<input type="file" name="FileContent"></input>
    	<input id="subbtn" type="submit">
    </form> 

 	<div id="downloadRet" style="display:none">
 		<h3>下载链接</h3>
 		<span id="downloadUrl"></span>
 		<!-- <input id="downloadBtn" type="button" value="下载"><br/> -->
 		<img id="downloadImg" src=""></img>
 		<h3>文件ID</h3>
 		<div id="fileid"></div>
 		<h3>管理URL</h3>
 		<span id="url"></span>&nbsp;&nbsp;
 		<!-- <input id="queryBtn" type="button" value="查询">&nbsp;&nbsp;
 		<input id="deleteBtn" type="button" value="删除">&nbsp;&nbsp;
 		<input id="copyBtn" type="button" value="复制"><br/> -->
 		<span id="imgInfo"></span>
 	</div>
</div>

<script type="text/javascript">

//var serverurl = 'http://192.168.210.63:8080/valinor-apiserver/image/createsign.do';
var serverurl = 'http://182.254.243.100/valinorapi/image/createsign.do';
//var serverurl = 'http://203.195.194.28/node';
//var serverurl = 'http://203.195.194.28/python';

$(document).ready(function() {
	initUploadForm();
});

/* $('input[name=FileContent]').change(function () {
	initUploadForm();
});

$('body').on('click', '#downloadBtn', function(){
	$('#downloadImg').attr('src', $('#downloadUrl').text());
}); */

/* $('body').on('click', '#deleteBtn', function(){
	var fileid = $('#fileid').text();
	if (!fileid) {
		alert('尚未获取fileid');
		return false;
	}
	// 请将以下获取签名的链接换成您部署好的服务端http url
	// 建议通过业务登陆态检查来增强安全性，避免签名被非法获取
	$.getJSON(serverurl + '?type=del&fileid='+encodeURIComponent(fileid), function(data) {
		var sign = data.sign,
			url = data.url + '?sign=' + encodeURIComponent(sign);
		$.ajax({
		    type: "POST",
		    url: url,
		    data: {},
		    success: function(ret) {
		  	    alert('删除成功');
		    },
	    	error:function(ret) {
	    		alert(ret.responseText);
	    	},
		    contentType:"multipart/form-data",
		    dataType: 'json'
		});
	});
}); */

/* $('body').on('click', '#copyBtn', function(){
	var fileid = $('#fileid').text();
	if (!fileid) {
		alert('尚未获取fileid');
		return false;
	}
	// 请将以下获取签名的链接换成您部署好的服务端http url
	// 建议通过业务登陆态检查来增强安全性，避免签名被非法获取
	$.getJSON(serverurl + '?type=copy&fileid='+encodeURIComponent(fileid), function(data) {
		var sign = data.sign,
			url = data.url + '?sign=' + encodeURIComponent(sign);
		$.ajax({
		    type: "POST",
		    url: url,
		    data: {},
		    success: function(ret) {
		  	    alert('复制成功');
		    },
	    	error:function(ret) {
	    		alert(ret.responseText);
	    	},
		    contentType:"multipart/form-data",
		    dataType: 'json'
		});
	});
}); */

/* $('body').on('click', '#queryBtn', function(){
	var fileid = $('#fileid').text();
	if (!fileid) {
		alert('尚未获取fileid');
		return false;
	}
	// 请将以下获取签名的链接换成您部署好的服务端http url
	// 建议通过业务登陆态检查来增强安全性，避免签名被非法获取
	$.getJSON(serverurl + '?type=stat&fileid='+encodeURIComponent(fileid), function(data) {
		var url = data.url;
		$.ajax({
		    type: "GET",
		    //type: "POST",
		    url: url,
		    data: {},
		    success: function(ret) {
		  	    $('#imgInfo').html(JSON.stringify(ret));
		    },
	    	error:function(ret) {
	    		alert(ret.responseText);
	    	},
		    dataType: 'json'
		});
	});
}); */

function initUploadForm () {
	// 请将以下获取签名的链接换成您部署好的服务端http url
	// 建议通过业务登陆态检查来增强安全性，避免签名被非法获取
	$.getJSON(serverurl, function(data) {
		var sign = data.sign,
			url = data.url + '?sign=' + encodeURIComponent(sign);
		console.log("sign="+sign);
		console.log("url="+url);
		var options = { 
            type: 'post',
            url: url,
            dataType: 'json',
		    success:function(ret) { 
		    	$('#downloadUrl').html(ret.data.download_url);
		    	$('#fileid').text(ret.data.fileid);
		    	$('#url').text(ret.data.url);
		    	$('#downloadRet').show();
		    },
		    error:function (ret) {
		    	alert(ret.responseText);
		    }
		}; 
		 
		$('#uploadForm').ajaxForm(options);
	}); 
	
	/* $.postJSON('http://localhost:8080/valinor-apiserver/baseinfo/brand/addbrand.do', {}, function(str){
		alert(str);
	}); */
}

</script>
</body>
</html>
