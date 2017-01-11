<%@include file="../includes/header.jsp"%>
<div class="container">
    <h1 class="lead"> Edit Category</h1>

    <form>
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="${category.name}">
        </div>
        <div class="form-group">
            <label class="radio-inline"><input type="radio" name="status" <c:if test="${category.status}">checked="checked"</c:if>/>Active</label>
            <label class="radio-inline"><input type="radio" name="status" <c:if test="${!category.status}">checked="checked"</c:if>/>Inactive</label>
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
            <a href="${SITE_URL}/category">Back</a>
        </form>
        
</div>
</body>
</html>
