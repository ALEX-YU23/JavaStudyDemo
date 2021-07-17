

function shift() {
	$("#regist").fadeToggle();
	$("#login").fadeToggle();
}

// 用户名校验
var checkUserName = function() {
	let username = $(this).val();
	let reg = /[a-zA-Z0-9_\u4e00-\u9fa5]+$/;
	if (username === '') {
		$(this).siblings("span").html("用户名不能为空").css("color", "red");
	} else if (username.length < 3 || username.length > 10) {
		$(this).siblings("span").html("用户名长度必须在3到10个字符之间").css("color", "red");
	} else if (!reg.test(username)) {
		$(this).siblings("span").html("用户名必须由数字字母下划线组成").css("color", "red");
	} else {
		$(this).siblings("span").html("用户名格式正确").css("color", "green");
	}
}
// 用户名校验
var checkUserName1 = function() {
	let username = $(this).val();
	let reg = /[a-zA-Z0-9_\u4e00-\u9fa5]+$/;
	if (username === '') {
		$(this).siblings("span").html("用户名不能为空").css("color", "red");
		return ;
	} else if (username.length < 3 || username.length > 10) {
		$(this).siblings("span").html("用户名长度必须在3到10个字符之间").css("color", "red");
		return ;
	} else if (!reg.test(username)) {
		$(this).siblings("span").html("用户名必须由数字字母下划线组成").css("color", "red");
		return ;
	} else {
		$(this).siblings("span").html("用户名格式正确").css("color", "green");
	}
	// 异步请求查询用户名是否已被注册
	$.ajax({
		url: '/testJavaweb02work/checkUserServlet',
		data: {"username":username},
		dataType: "json",
		type: "post",
		async: false,
		success : function(data){
			console.log(data.msg);
			if(data.msg==="1"){
				$('#registForm .msg-username').html("用户名合法").css("color","green")
			}else{
				$('#registForm .msg-username').html("用户名不合法").css("color","red");
			}
			
			
		},
		error: function(){
			console.log("数据请求失败");
		}
		
	})
}
// 密码校验
var checkPassword = function() {
	let password = $(this).val();
	let reg = /[^\u4e00-\u9fa5]+$/;
	if (password === '') {
		$(this).siblings("span").html("密码不能为空").css("color", "red");
	} else if (password.length < 6 || password.length > 10) {
		$(this).siblings("span").html("密码长度必须在6到10个字符之间").css("color", "red");
	} else if (!reg.test(password)) {
		$(this).siblings("span").html("密码不能有汉字").css("color", "red");
	} else {
		$(this).siblings("span").html("密码格式正确").css("color", "green");
	}
}

// 重复密码校验
var reCheckPassword = function() {
	let password = $(this).val();
	let repassword = $('#passwordRegiste').val();
	let reg = /[^\u4e00-\u9fa5]+$/;


	if (password === repassword && password !== "") {
		$(this).siblings("span").html("重复密码正确").css("color", "green");
	} else if (password === '') {
		$(this).siblings("span").html("密码不能为空").css("color", "red");
	} else if (password.length < 6 || password.length > 10) {
		$(this).siblings("span").html("密码长度必须在6到10个字符之间").css("color", "red");
		$("#repassword").attr("disabled", false);
	} else {
		$(this).siblings("span").html("两次密码不相同").css("color", "red");

	}
}

// 日期校验
var dateCheck = function() {
	console.log($(this).val());
	if ($(this).val() == "") {
		$(this).siblings("span").html("请填写您的生日").css("color", "red");
	} else {
		$(this).siblings("span").html("填写正确").css("color", "green");
	}
}

$("#login #username").blur(checkUserName);
$("#regist #username").blur(checkUserName1);
$("#passwordLogin").blur(checkPassword);
$("#passwordRegiste").blur(checkPassword);
$("#repassword").blur(reCheckPassword);
$('#birthday').blur(dateCheck);

var spans = $("#registForm span");
function checkDatas () {
	let passColor = "green";
	for (var i = 0; i < spans.length; i++) {
		// console.log(spans[i].style.color);
		if (passColor!==spans[i].style.color) {
			passColor = "red";
		} 
	}
	if (passColor == "green") {
		return true;
	} else{
		return false;
	}
	
}



