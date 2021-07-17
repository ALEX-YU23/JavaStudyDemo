<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" class="loginHtml">
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!--<link rel="icon" href="/resources/favicon.ico">-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/public.css" media="all">

</head>
<body class="loginBody">
<form class="layui-form">
    <div class="login_face">
        <img src="https://ftp.bmp.ovh/imgs/2021/04/7ec52669c07e5b80.jpg" height="60px" class="userAvatar">
    </div>
    <div>
        <div class="loginbox-title">登录</div>
        <div class="loginbox-social">
            <div class="social-title">系统</div>
    </div>
    <div class="layui-form-item input-item">
        <label>用户名</label>
        <input type="text" placeholder="请输入用户名" autocomplete="off" name="username" class="layui-input"
               lay-verify="required">
    </div>
    <div class="layui-form-item input-item">
        <label>密码</label>
        <input type="password" placeholder="请输入密码" autocomplete="off" name="password" class="layui-input"
               lay-verify="required">
    </div>
    <div class="layui-form-item">
	    <label class="layui-form-label">七天免登陆</label>
	    <div class="layui-input-block">
	      <input type="checkbox" name="sevenpass" lay-skin="switch">
	    </div>
  	</div>
  	<!-- <div class="layui-form-item">
  		<label class="layui-form-label">记住我</label>
	    <div class="layui-input-block">
	      <input type="checkbox" name="remember" lay-skin="switch">
	    </div>
  	</div> -->
    <!-- <div class="layui-form-item input-item" id="imgCode">
        <input type="text" placeholder="请输入验证码" name="code" autocomplete="off" id="code" class="layui-input">
        <img style="margin-right: 20px" width="100px" id="verify_code_img" height="32"
             src="/verifyCode/getImg" onclick="javascript:changeImg()"><br>
    </div> -->
    <div class="layui-form-item">
        <button class="layui-btn layui-block" lay-filter="login" lay-submit>登录</button>
    </div>
    <div class="layui-form-item">
        <a href="${pageContext.request.contextPath }">还没有账户？点击注册</a>
        <!--<input id="butt" type="button" value="注册" /><br><br><br>-->
    </div>
</form>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/cache.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/login.js"></script>

</html>
