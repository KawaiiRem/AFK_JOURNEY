<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>AFK Journey</title>
    <style>
        table,
        th,
        td{
            border: 1px solid black;
        }
    </style>
    <link rel="stylesheet" href="../../stylesheets/list.css">
</head>
<body>
<div class="header">
    <h1>Hero List By Class</h1>
    <img src="../../assets/${charClass}.png" alt="Class" width="50" height="50">
</div>
<div class="characterList">
    <c:forEach var="characterByClass" items="${characterByClass}">
        <div class="characterBox">
            <a href="/characters/characterDetails/${characterByClass.getCid()}"><img src="../../assets/${characterByClass.getName()}.png" alt="Character Image" width="200" height="300">
            <h2>${characterByClass.getName()}</h2></a>
        </div>
    </c:forEach>
</div>
</body>
</html>
