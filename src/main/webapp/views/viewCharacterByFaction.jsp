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
    <h1>Hero List By Faction</h1>
    <img src="../../assets/${faction}.png" alt="Faction" width="50" height="50">
</div>
<div class="characterList">
    <c:forEach var="characterByFaction" items="${characterByFaction}">
        <div class="characterBox">
            <a href="/characters/characterDetails/${characterByFaction.getCid()}">
                <img src="../../assets/${characterByFaction.getName()}.png" alt="Character Image" width="200" height="300">
            <h2>${characterByFaction.getName()}</h2></a>
        </div>
    </c:forEach>
</div>
</body>
</html>
