<%@include file="../includes/header.jsp"%>
<div class="container">
    <h1 class="lead">Categories</h1>
    <table class="table table-bordered">
        <tr>
            <thead>
            <th>Name</th>
            <th>Status</th>
            </thead>
            </tr>
            <c:forEach var="category" items="${categories}">
                <tr>
                    <td><a href="${SITE_URL}/category/edit/${category.id}"> ${category.name}</a></td>
                    <td>${category.status}</td>
                </tr>
            </c:forEach>
    </table>
</div>
</body>
</html>
