//注意：选项卡 依赖 element 模块，否则无法进行功能性操作
layui.use(['element', 'form','jquery','layer'], function() {
	var element = layui.element;
	var form = layui.form;
	var $ = layui.jquery;
	var layer = layui.layer;
	// 获取手机验证码按钮js效果
	$("#getcode").click(function(){
		
		// 设置定时器,显示倒计时,并让按钮不可点击
		var time = 60;
		var	tid = setInterval(function(){
			$("#getcode").attr("disabled", true);
			time = time -1;
			if(time==0){	
				$("#getcode").attr("disabled", false);
				$("#getcode").val("获取验证码");
				clearInterval(tid);	
			}else{
				$("#getcode").val("( "+time+"s ) "+"获取验证码");
			}
		},1000)
	})



});



