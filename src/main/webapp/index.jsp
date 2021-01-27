<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload" />
    <input name="name">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
