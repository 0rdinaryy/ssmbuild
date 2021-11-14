<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>

<h3>查询所有书籍</h3>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表————显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-9 column">
                <%--toAddBook--%>
                <button type="button" class="btn btn-primary" onclick="toAddPage()">新增书籍</button>
            </div>
            <div class="col-md-3 column">
                <form class="form-inline" action="${pageContext.request.contextPath}/books/Books" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" id="queryBook" name="queryName" value="${name}" placeholder="请输入所查询的书籍名称">
                    </div>
                    <button type="submit" class="btn btn-default">查询</button>
                </form>
            </div>
        </div>

    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
           <table class="table table-hover table-striped">
               <thead>
                   <tr>
                       <th>书籍编号</th>
                       <th>书籍名字</th>
                       <th>书籍数量</th>
                       <th>书籍详情</th>
                   </tr>
               </thead>
               <tbody>
                   <c:forEach var="books" items="${lists}">
                       <tr>
                           <td>${books.bookID}</td>
                           <td>${books.bookName}</td>
                           <td>${books.bookCounts}</td>
                           <td>${books.detail}</td>
                           <td>
<%--                               <button type="button" class="btn btn-info" onclick="toUpdatePage()">修改</button>--%>
                                <a href="${pageContext.request.contextPath}/books/updateBookPage/${books.bookID}">修改</a>
                               &nbsp; | &nbsp;
<%--                               <button type="button" class="btn btn-danger" onclick="deleteBook()">删除</button>--%>
                                <a href="${pageContext.request.contextPath}/books/deleteBook/${books.bookID}">删除</a>
                           </td>
                       </tr>
                   </c:forEach>
               </tbody>
           </table>
        </div>
    </div>
</div>

</body>
</html>
<script type="text/javascript">
    function toAddPage() {
        window.location.href = "${pageContext.request.contextPath}/books/addBookPage"
    }
    function toUpdatePage() {
        window.location.href = "${pageContext.request.contextPath}/books/updateBookPage/${books.bookID}"
    }
    function deleteBook() {
        window.location.href = "${pageContext.request.contextPath}/books/deleteBook"
    }
</script>
