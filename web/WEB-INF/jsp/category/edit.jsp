<%@include file="../includes/header.jsp"%>
<h1> Edit Category</h1>
<form method="post">
    <label>  Category Name </label><input type="text" name="name"value="${category.name}"/><br>
    <label><input type="radio" name="status" value="1"<c:if test="${category.status}">checked="checked"</c:if>>Active</label>
    <label><input type="radio" name="status" value="0"<c:if test="${!category.status}">checked="checked"</c:if>>InActive</label><br>
    <input type="submit" value="Update"/><br>
    <a href="${SITE_URL}/category">Back</a>
</form>
</body>
</html>
