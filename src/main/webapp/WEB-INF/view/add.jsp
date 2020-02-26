<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/index3.css" >
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js" ></script>
<script type="text/javascript">

	
</script>
</head>
<body>
<form:form id="form" action="add" method="post" enctype="multipart/form-date" modelAttribute="goods" >
	<table>
		<tr>
			<td>商品编号</td>
			<td>
				<form:input path="gid"/>
			</td>
		</tr>
		<tr>
			<td>商品名称</td>
			<td>
				<form:input path="gname"/>
			</td>
		</tr>
		<tr>
			<td>英文名称</td>
			<td>
				<form:input path="ename"/>
			</td>
		</tr>
		<tr>
			<td>商品品牌</td>
			<td>
				<form:select path="bid" >
					<option value="0" >请选择</option>
					<option value="1" >三星</option>
					<option value="2" >华为</option>
					<option value="3" >苹果</option>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>商品种类</td>
			<td>
				<form:select path="tid"  >
					<option value="0" >请选择</option>
					<option value="1" >电视</option>
					<option value="2" >电脑</option>
					<option value="3" >手机</option>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>尺寸</td>
			<td>
				<form:input path="gsize"/>
				
			</td>
		</tr>
		<tr>
			<td>单价(元)</td>
			<td>
				<form:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>数量</td>
			<td>
				<form:input path="num"/>
				<span id="s1" ></span>
			</td>
		</tr>
		<tr>
			<td>标签</td>
			<td>
				<form:input path="biao"/>
			</td>
		</tr>
		<tr>
			<td>图片</td>
			<td>
				<input type="file" name="myFile" >
			</td>
		</tr>	
		<tr>
			<td colspan="10" ><button onclick="tj()" >添加</button></td>
		</tr>	
		
	</table>
</form:form>
</body>
</html>