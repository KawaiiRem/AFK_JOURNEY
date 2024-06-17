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
            <h1>Hero List</h1>
            <div class="searchBar">
                <h3>Search by Class</h3>
                <div class="classBar">
                    <a href="/characters/selectCharacterByClass/Tank"><img src="../../assets/Tank.png" alt="Class" width="50" height="50"></a>
                    <a href="/characters/selectCharacterByClass/Mage"><img src="../../assets/Mage.png" alt="Class" width="50" height="50"></a>
                    <a href="/characters/selectCharacterByClass/Support"><img src="../../assets/Support.png" alt="Class" width="50" height="50"></a>
                    <a href="/characters/selectCharacterByClass/Marksman"><img src="../../assets/Marksman.png" alt="Class" width="50" height="50"></a>
                    <a href="/characters/selectCharacterByClass/Warrior"><img src="../../assets/Warrior.png" alt="Class" width="50" height="50"></a>
                    <a href="/characters/selectCharacterByClass/Rouge"><img src="../../assets/Rogue.png" alt="Class" width="50" height="50"></a>
                </div>
                <h3>Search by Faction</h3>
                <div class="factionBar">
                    <a href="/characters/selectCharacterByFaction/Celestial"><img src="../../assets/Celestial.png" alt="Class" width="60" height="60"></a>
                    <a href="/characters/selectCharacterByFaction/Hypogean"><img src="../../assets/Hypogean.png" alt="Class" width="60" height="60"></a>
                    <a href="/characters/selectCharacterByFaction/Lightbearer"><img src="../../assets/Lightbearer.png" alt="Class" width="60" height="60"></a>
                    <a href="/characters/selectCharacterByFaction/Mauler"><img src="../../assets/Mauler.png" alt="Class" width="60" height="60"></a>
                    <a href="/characters/selectCharacterByFaction/Wilder"><img src="../../assets/Wilder.png" alt="Class" width="60" height="60"></a>
                    <a href="/characters/selectCharacterByFaction/Graveborn"><img src="../../assets/Graveborn.png" alt="Class" width="60" height="60"></a>
                </div>
            </div>
        </div>
        <div class="characterList">
            <c:forEach var="characterSummary" items="${characterSummaries}">
                <div class="characterBox">
                    <a href="/characters/characterDetails/${characterSummary.getCid()}">
                        <img src="../../assets/${characterSummary.getName()}.png" alt="Character Image" width="200" height="300">
                        <h2>${characterSummary.getName()}</h2>
                    </a>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
