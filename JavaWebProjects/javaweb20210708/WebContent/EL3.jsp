<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL表达式中运算符</title>
</head>
<body>
	----------数学运算符------------<br>
	1+2=${1+2}<br>
	1-2=${1-2}<br>
	1*2=${1*2}<br>
	1/2=${1 / 2}<br>
	3%4=${3 mod 4}<br>
	--------------关系运算符----------------<br>
	1==2:${1==2}<br>
	1>2:${1>2}<br>
	1<2:${1<2}<br>
	1!=2:${1!=2}<br>
	1<=2:${1<=2}<br>
	1>=2:${1>=2}<br>
  --------------逻辑运算符----------------<br>
	true&&false :${true&&false }<br>
	true||false :${true||false }<br>
	!false :${!false }<br>
	--------------判空运算符----------------<br>
	str==null：${empty str}
	str==""：${empty ""}

</body>
</html>