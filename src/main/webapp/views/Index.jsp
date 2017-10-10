<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link href="<c:url value="/css/style.css" />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
</head>
<body>
<div id="menu">
    <div class="container">
        <ul>
            <a id="home" href="/index">
                <li>Home</li>
            </a>
            <a href="#">
                <li>Холодильники</li>
            </a>
            <a href="#">
                <li>Стиралки</li>
            </a>
            <a href="#">
                <li>Пылесосы</li>
            </a>
            <a href="#">
                <li>Микроволновки</li>
            </a>
            <a href="#">
                <li>Утюги</li>
            </a>
            <a href="#">
                <li>Пароварки</li>
            </a>
            <a href="#">
                <li>Чайники</li>
            </a>
        </ul>
    </div>
</div>

<div class="container body">
    <div class="row">
        <div class="col-md-4 category">
            <h4>Холодильники</h4>
            <p>Устройство, поддерживающее низкую температуру в теплоизолированной камере. Применяется обычно для
                хранения пищи</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
        <div class="col-md-4 category">
            <h4>Стиралки</h4>
            <p>Установка для стирки текстильных изделий (одежды, нижнего и постельного белья, сумок и других вещей)</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
        <div class="col-md-4 category">
            <h4>Пылесосы</h4>
            <p>Машина для уборки пыли и загрязнений с поверхностей за счёт всасывания потоком воздуха.</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 category">
            <h4>Микроволновки</h4>
            <p>Электроприбор, использующий явление разогрева водосодержащих веществ электромагнитным излучением
                дециметрового диапазона</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
        <div class="col-md-4 category">
            <h4>Утюги</h4>
            <p>Элемент бытовой техники для разглаживания складок и заминов на одежде</p>.
            <a class="next-ref" href="#">Далее</a>
        </div>
        <div class="col-md-4 category">
            <h4>Пароварки</h4>
            <p>Кухонная утварь, приспособление для приготовления пищи на пару.</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 category">
            <h4>Чайники</h4>
            <p>Небольшой закрытый сосуд с носиком, крышкой и ручкой для подогревания и кипячения воды</p>
            <a class="next-ref" href="#">Далее</a>
        </div>
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