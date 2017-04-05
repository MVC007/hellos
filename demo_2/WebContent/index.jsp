<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer count = (Integer)application.getAttribute("count");
		if(count==null){
			count=1;
			//设置application的值
			application.setAttribute("count", count);
		}else{
			
			//获取原有的值
			count = (Integer)application.getAttribute("count");
			count++;
			application.setAttribute("count", count);
		}
	%>
	
		欢迎你,你是第<%=count %>几位访客
</body>
</html>