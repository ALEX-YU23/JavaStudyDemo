<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册页</title>
</head>
<body>
	<form action="registHandler.jsp" method="post" id="regist-form">
		<div>
			用户名：<input type="text" name="username" id="username" value='<%=request.getParameter("username")==null ? "" : request.getParameter("username") %>'>
		</div>
		<div>
			密码：<input type="password" name="password" id="password">
		</div>
		<div>
			重复密码：<input type="password" name="repassword" id="repassword">
		</div>
		<div>
			生日：<input type="date" name="birthday" value='<%=request.getParameter("birthday")==null ? "" : request.getParameter("birthday") %>'>
		</div>
		<input type="submit" value="注册" />
		<div>
			<span><%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span>
		</div>
	</form>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script type="text/javascript">
		// 添加用户名内容校验规则   
		jQuery.validator.addMethod("usernameContent", function(value, element) {
			var reg = /^\w+$/;
			// this.optional(element) 只有在内容不必为空时才进行自定义校验
			return this.optional(element) || (reg.test(value));
		});
		// 使用validate插件
		$('#regist-form').validate({
			rules: {
				username: {
					required: true,
					minlength: 5,
					maxlength: 10,
					usernameContent: true
				},
				password: "required",
				repassword: {
					equalTo: "#password"
				}
			},
			messages: {
				username: {
					required: "用户名不能为空",
					minlength: "至少5个字符",
					maxlength: "最多10个字符",
					usernameContent: "用户名只能是数字字母下划线"
				},
				password: "密码不能为空!",
				repassword: {
					equalTo: "两次密码不相同"
				}
			}
		})
	</script>
</body>
</html>