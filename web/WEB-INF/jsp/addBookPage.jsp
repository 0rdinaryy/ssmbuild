<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>
<h1>新增书籍页面</h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form class="form-horizontal" action="${pageContext.request.contextPath}/books/addBook" method="post">
        <div class="form-group">
            <label for="bookName" class="col-sm-2 control-label">书籍名称</label>
            <div class="col-sm-10">
                <input type="text" name="bookName" class="form-control" id="bookName" placeholder="书籍名称">
            </div>
        </div>
        <div class="form-group">
            <label for="bookCounts" class="col-sm-2 control-label">书籍数量</label>
            <div class="col-sm-10">
                <input type="text" name="bookCounts" class="form-control" id="bookCounts" placeholder="书籍数量">
            </div>
        </div>
        <div class="form-group">
            <label for="detail" class="col-sm-2 control-label">书籍详情</label>
            <div class="col-sm-10">
                <input type="text" name="detail" class="form-control" id="detail" placeholder="书籍详情">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">添加</button>
                <button type="reset" class="btn btn-default">重置</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
