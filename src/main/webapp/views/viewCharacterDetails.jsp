<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>AFK Journey</title>
    <link rel="stylesheet" href="../../stylesheets/characterdetails.css">
</head>
<body>
    <c:forEach var="characterSummary" items="${characterSummary}">
    <div class = "header">
        <h1>Hero Details</h1>
    </div>
    <div class = "container">
        <div class = "characterSummary">
            <div class = "characterImage">
                <img src="../../assets/${characterSummary.getName()}.png" alt="Character Image" width="500" height="600">
            </div>
            <div style ="text-align: center"><h2 style="font-size: 20px">${characterSummary.getName()}</h2></div>
            <div class = "typing">
                <div class = "characterClass">
                    <img src="../../assets/${characterSummary.getCharClass()}.png" alt="Class" width="50" height="50">
                </div>
                <div class = "characterFaction">
                    <img src="../../assets/${characterSummary.getFaction()}.png" alt="Faction" width="50" height="50">
                </div>
            </div>
        </div>
        <div class = "characterDetails">
            <div class="characterDetailNavBar">
                <div class = "characterSkill">
                    <button type="submit" id="charSkill">Character Skill</button>
                </div>
                <div class = "characterPassive">
                    <button type="submit" id="charPassive">Character Passive</button>
                </div>
                <div class = "characterWeapon">
                    <button type="submit" id="charWeapon">Character Weapon</button>
                </div>
                <div class = "characterReview">
                    <button type="submit" id="charReview">Character Review</button>
                </div>
            </div>
            <div class="selectionDetails">
                <div class="skillDetails">
                    <table>
                        <tr>
                            <th>Skill Name</th>
                            <th>Skill Description</th>
                            <th>Level Upgrade</th>
                        </tr>
                        <c:forEach var="characterSkills" items="${characterSkills}">
                            <tr>
                                <td>${characterSkills.getSkillName()}</td>
                                <td>${characterSkills.getSkillDescription()}</td>
                                <td>${characterSkills.getLevelUpgrade()}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="passiveDetails">
                        <c:forEach var="characterPassives" items="${characterPassives}">
                            <table>
                                <tr>
                                    <th>Hero Focus</th>
                                    <th>Level Upgrade</th>
                                </tr>
                                <tr>
                                    <td>${characterPassives.getHeroFocus()}</td>
                                    <td>${characterPassives.getLevelUpgrade()}</td>
                                </tr>
                            </table>
                            <table>
                                <tr>
                                    <th>Enhance Force</th>
                                </tr>
                                <tr>
                                    <td>${characterPassives.getEnhanceForce()}</td>
                                </tr>
                            </table>
                        </c:forEach>
                </div>
                <div class="weaponDetails">
                    <table>
                        <tr>
                            <th>Weapon Name</th>
                            <th>Weapon Description</th>
                            <th>Level Upgrade</th>
                        </tr>
                        <c:forEach var="characterWeapon" items="${characterWeapon}">
                            <tr>
                                <td>${characterWeapon.getWeaponName()}</td>
                                <td>${characterWeapon.getWeaponDescription()}</td>
                                <td>${characterWeapon.getWeaponLevel()}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="reviewDetails">
                    <table>
                        <tr>
                            <th>Unit Review</th>
                            <th>PVE Weapon Recommendation</th>
                            <th>PVP Weapon Recommendation</th>
                        </tr>
                        <c:forEach var="characterReview" items="${characterReview}">
                            <tr>
                                <td>${characterReview.getReview()}</td>
                                <td>${characterReview.getPveWeapon()}</td>
                                <td>${characterReview.getPvpWeapon()}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
    </c:forEach>
</body>
<script>
    const skillDetail = document.querySelector('.skillDetails');
    const passiveDetail = document.querySelector('.passiveDetails');
    const weaponDetail = document.querySelector('.weaponDetails');
    const reviewDetail = document.querySelector('.reviewDetails');

    const skillBtn = document.querySelector('#charSkill');
    const passiveBtn = document.querySelector('#charPassive');
    const weaponBtn = document.querySelector('#charWeapon');
    const reviewBtn = document.querySelector('#charReview');

    skillBtn.addEventListener('click', () => {
        skillDetail.style.display = 'flex';
        passiveDetail.style.display = 'none';
        weaponDetail.style.display = 'none';
        reviewDetail.style.display = 'none';
    })
    passiveBtn.addEventListener('click', () => {
        skillDetail.style.display = 'none';
        passiveDetail.style.display = 'flex';
        weaponDetail.style.display = 'none';
        reviewDetail.style.display = 'none';
    })
    weaponBtn.addEventListener('click', () => {
        skillDetail.style.display = 'none';
        passiveDetail.style.display = 'none';
        weaponDetail.style.display = 'flex';
        reviewDetail.style.display = 'none';
    })
    reviewBtn.addEventListener('click', () => {
        skillDetail.style.display = 'none';
        passiveDetail.style.display = 'none';
        weaponDetail.style.display = 'none';
        reviewDetail.style.display = 'flex';
    })
</script>
</html>
