<%@ include file="includes.jsp" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Dark Login Form</title>
  <link rel="stylesheet" href="<c:url value="/static/css/login.css"/>" />

</head>
<body>
    
    <form:form method="post" action="../login/valid" 
               modelAttribute="formUser" id="formUser" cssClass="login">
     
    <p>
      <label for="login">Email:</label>
      <form:input path="username" id="login"/>
      <!--<input type="text" name="login" id="login" value="mijael@upc.com">-->
    </p>

    <p>
      <label for="password">Password:</label>
      <form:password path="password" id="password" />
      <!--<input type="password" name="password" id="password" value="123456">-->
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.html">Forgot your password?</a></p>
    </form:form>>
</body>
</html>