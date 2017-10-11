<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link href="<c:url value="/res/css/style.css" />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/res/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
</head>
<body>
<div id="menu">
    <div class="container">
        <ul>

            <a id="home" href="/index">
                <li>Home</li>
            </a>

            <c:forEach var="item" items="${categoryList}">
                <a href="#">
                    <li>${item.name}</li>
                </a>
            </c:forEach>

        </ul>
    </div>
</div>

<div class="container body">


    <div class="row">

        <c:forEach var="item" items="${categoryList}">

            <div class="col-md-4 category">
                <h4>${item.name}</h4>
                <p>${item.description}</p>
                <a class="next-ref" href="#">Далее</a>
            </div>

        </c:forEach>

    </div>


</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
        integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
        integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
        crossorigin="anonymous"></script>
</body>
</html>