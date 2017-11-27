<%@ page language="java"  pageEncoding="UTF-8" %>

${message}

<!--rest风格put 更新用户id为1的用户数据 -->
<form action="/SpringMvc/mvc/users/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="testRest PUT"/>
</form>

<!-- rest风格delete 表示删除用户id为1的用户数据-->
<form action="/SpringMvc/mvc/users/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="testRest DELETE"/>
</form>
<!-- rest风格get 查询用户id为1的用户数据-->
<form action="/SpringMvc/mvc/users/1" method="get">
    <input type="submit" value="testRest get"/>
</form>
<!-- rest风格get 新增一条用户数据-->
<form action="/SpringMvc/mvc/users" method="post">
	<input type="input" name="userName" value="张三"/>
	<input type="input" name="userId" value="1"/>
	<input type="input" name="userAge" value="23"/>
    <input type="submit" name="submit" value="testRest post"/>
</form>