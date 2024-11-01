<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<#if currentRoles?seq_contains("ROLE_USER")>
    <p>Welcome, Administrator!</p>
<#else>
    <p>Welcome, ${username}!</p>
</#if>

</body>
</html>