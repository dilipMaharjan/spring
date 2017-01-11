<%@include file="../includes/header.jsp"%>
<h1>Categories</h1>
<table>
    <t>
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
</body>
</html>
