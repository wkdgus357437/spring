<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- *** ${name } 성적 ***<br>
총점 : ${tot }<br>
평균 : ${avg } --%>

<h3>***${sungJukDTO.name }성적***</h3>
<h4>
총점 : ${ sungJukDTO.tot}<br>
평균 : ${ sungJukDTO.avg}

</h4>
</body>
</html>