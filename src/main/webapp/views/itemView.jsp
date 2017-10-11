<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <c:forEach var="item" items="${itemList}">
        <div class="col-md-4 category">
            <p>${item.name}</p>
        </div>
    </c:forEach>
</div>

