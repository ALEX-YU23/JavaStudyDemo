<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/layui/css/layui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/public.css">
</head>

<body style="background-image: url('${pageContext.request.contextPath }/static/img/bci1.jpg')">

<div id="gb">
    <form class="layui-form" action="">
        <input type="hidden" id="us" th:value="${session.user}">
        <input type="hidden" id="imgs" th:if="${session.user!=null}" th:value="${session.user.avatarUrl}">
        <input type="hidden" name="id" th:if="${session.user!=null}" th:value="${session.user.id}">
        <div class="registerbox-title">用户注册中心</div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户账号</label>
            <div class="layui-input-inline">
                <input type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off"
                       th:value="${session.user!=null?session.user.username:''}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户密码</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="pwd" placeholder="请输入密码" autocomplete="off"
                       th:value="${session.user!=null?session.user.password:''}" class="layui-input" id="pass1">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">确认密码</label>
            <div class="layui-input-inline">
                <input type="password" name="passwords" required lay-verify="pwd" placeholder="请再次输入密码"
                       th:value="${session.user!=null?session.user.password:''}" autocomplete="off" class="layui-input" id="pass2">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block" th:if="${session.user==null}">
                <input type="radio" name="sex" value="0" title="男" checked>
                <input type="radio" name="sex" value="1" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="name" required lay-verify="name" placeholder="请输入您的姓名"
                       th:value="${session.user!=null?session.user.name:''}" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>

</div>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-min.js"></script>
<!--<script type="text/javascript" src="./layui/layui.all.js"></script>-->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/register.js"></script>
</html>
