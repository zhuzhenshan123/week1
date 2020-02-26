<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/index3.css" >
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js" ></script>
<script type="text/javascript">
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	function add(){
		location="toAdd";
	}
</script>
</head>
<body>
<form action="list" method="post">
	<input type="hidden" name="pageNum" >
	种类:<select name="tid"  >
			<option value="0" >请选择</option>
			<option value="1" >电视</option>
			<option value="2" >电脑</option>
			<option value="3" >手机</option>
		</select>
	品牌:<select name="bid" >
			<option value="0" >请选择</option>
			<option value="1" >三星</option>
			<option value="2" >华为</option>
			<option value="3" >苹果</option>
		</select>
	单价范围:<input type="text" name="p1" value="${con.p1 }" >到<input type="text" name="p2" value="${con.p2 }" >
	商品名称:<input type="text" name="gname" value="${con.gname }" >
	<button>搜索</button>
	<input type="button" value="添加" onclick="add()" >
</form>

<table>
	<tr>
		<td>编号</td>
		<td>商品名称</td>
		<td>英文名称</td>
		<td>商品品牌</td>
		<td>商品种类</td>
		<td>尺寸</td>
		<td>单价(元)</td>
		<td>数量</td>
		<td>标签</td>
		<td>图片</td>
	</tr>
	<c:forEach items="${page.list }" var="g" varStatus="count" >
		<tr>
			<td>${count.count+page.startRow-1 }</td>
			<td>${g.gname }</td>
			<td>${g.ename }</td>
			<td>
				<c:forEach items="${g.gbs }" var="b" >
					${b.brand }
				</c:forEach>
			</td>
			<td>
				<c:forEach items="${g.gts }" var="t" >
					${t.type }
				</c:forEach>
			</td>
			<td>${g.gsize }</td>
			<td>${g.price }</td>
			<td>${g.num }</td>
			<td>${g.biao }</td>
			<td><img alt="失败" src="file/${g.pic }"></td>
		</tr>
	</c:forEach>
	<tr  >
		<td colspan="10">
			<button onclick="fenye(1)" >首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})" >上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})" >下一页</button>
			<button onclick="fenye(${page.pages})" >尾页</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			当前${page.pageNum }/${page.pages }页，共${page.total }条数据
		</td>
	</tr>
</table>

</body>
</html>