<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>管理系统大布局</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
	</head>
	<body>
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<div class="layui-logo layui-hide-xs layui-bg-black">后台管理系统</div>
				<!-- 头部区域（可配合layui 已有的水平导航） -->
				
				<ul class="layui-nav layui-layout-right">
					<li class="layui-nav-item layui-hide layui-show-md-inline-block">
						<a href="javascript:;">
							<img src="https://ftp.bmp.ovh/imgs/2021/04/7ec52669c07e5b80.jpg"
								class="layui-nav-img">
							Alex
						</a>
						<dl class="layui-nav-child">
							<dd><a href="">个人空间</a></dd>
							<dd><a href="">设置</a></dd>
							<dd><a href="">注销</a></dd>
						</dl>
					</li>
					<li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
						<a href="javascript:;">
							<i class="layui-icon layui-icon-more-vertical"></i>
						</a>
					</li>
				</ul>
			</div>

			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="${pageContext.request.contextPath }/datadisplay.jsp" target="right-display">人员管理</a>
						</li>
						<li class="layui-nav-item">
							<a href="${pageContext.request.contextPath }/demo.jsp" target="right-display">示例展示</a>
						</li>

					</ul>
				</div>
			</div>

			<div class="layui-body">
				
				<iframe src="${pageContext.request.contextPath }/datadisplay.jsp" frameborder="0" id="demoAdmin" name="right-display" style="width: 100%; height: 100%; border-radius: 2px;"></iframe>
			</div>

			<div class="layui-footer">
				底部固定区域
			</div>
		</div>
		<script src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
		<script>
			//JS 
			layui.use(['element', 'layer', 'util'], function() {
				var element = layui.element,
					layer = layui.layer,
					util = layui.util,
					$ = layui.$;

				//头部事件
				util.event('lay-header-event', {
					//左侧菜单事件
					menuLeft: function(othis) {
						layer.msg('展开左侧菜单的操作', {
							icon: 0
						});
					},
					menuRight: function() {
						layer.open({
							type: 1,
							content: '<div style="padding: 15px;">处理右侧面板的操作</div>',
							area: ['260px', '100%'],
							offset: 'rt' //右上角
								,
							anim: 5,
							shadeClose: true
						});
					}
				});

			});
		</script>
	</body>
</html>
