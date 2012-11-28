<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ユーザー管理サイト</title>
<style>
forme {
 border: solid 1px #999;
 padding: 0 10px;
 }
</style>

<ul>
<c:forEach var="e" items="${f:errors()}">
 <li>${f:h(e)}</li>
</c:forEach>
</ul>

<form action="create">
 <p>新しいユーザーの名前を入力してください。</p>
 <p>名前: <input type="text" name="name"></p>
 <p>メアド: <input type="text" name="email"></p>
 <p><input type="submit" value="登録する"></p>
</form>
</ul>
</head>
</html>
