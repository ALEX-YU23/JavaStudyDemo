/**
 * 登录界面js文件
 */

$(function(){
	
	$(':button').click(function(){
		$('#login').fadeOut();
		$('#register').fadeIn();
	})
	
	
	
	$("#usercode").blur(function(){
	  //发送ajax请求 验证用户名是否可用
	  let username = $(this).val();
	/*  $.ajax({
	  	
	  	url:'/javaweb20210705/checkUserServlet',
	  	data:{"username":username},
	  	dataType:'json',
	  	type:'post',
	  	async:false, //是否开启异步的请求  true是开启异步  不写默认也是true
	  	success:function(data){
	  	   $(".msg-account").html(data.msg)
	  	},
	  	error:function(){
	  	
	  	}
	  })*/
	  
	 /* $.get('/javaweb20210705/checkUserServlet',{"username":username},function(data){
	  	   $(".msg-account").html(data.msg)},'json')*/

 	$.post('/javaweb20210705/checkUserServlet',{"username":username},function(data){
	  	   $(".msg-account").html(data.msg)},'json')
	})
	
	//验证密码的合法性
	$("#pwd").blur(function(){
	
	  //获取密码框的内容
	   let pwd = $(this).val();
	   //使用正则表达式 编写密码的格式
	   let reg = /[a-zA-Z0-9]{6,12}/;
	   
	   if(reg.test(pwd)){
	    	$(".msg-password").html("密码格式正确").css("color","green");
	    	 $("#register-btn").prop("disabled",false);
	   }else{
	       $(".msg-password").html("密码格式不正确").css("color","red");
	       $("#register-btn").prop("disabled",true);
	   }
	})
	

})