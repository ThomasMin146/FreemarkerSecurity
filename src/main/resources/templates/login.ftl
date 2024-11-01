<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <#-- Display any login error messages -->
    <#if error??>
    <div class="error">${error}</div>
</#if>

<form action="/login" method="post">

    <label for="username">Username</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>

    <button type="submit">Login</button>
</form>
</div>
</body>
</html>
