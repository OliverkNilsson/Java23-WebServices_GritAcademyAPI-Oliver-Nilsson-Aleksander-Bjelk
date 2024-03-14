<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HomE Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<h1>Demo JSP webpage showing rest endpoints</h1>
<p>${message}</p>
<form id="createStudent" action="/createStudentForm" method="POST">
    <label for="fName" >First name: </label>
    <input type="text" id="fName" name="fName" required>    <br>
    <label for="lName">Last name: </label>
    <input type="text" id="lName" name="lName" required>    <br>
    <label for="town">Town: </label>
    <input type="text" id="town" name="town" required>    <br>

    <br>
    <input class="btn" type="submit" value="CREATE_STUDENT"><br>

</form>
<br>
<hr>
<br>
<form action="removeStudentForm" method="POST">
    id <input type="text" name="id" required>
    <br>
    <br>
    <input class="btn" type="submit" value="REMOVE_STUDENT">
</form>
<br>
<hr>
<br>
<button class="btn" onclick=location.href='/students'>SHOW ALL STUDENTS</button>
<br>
<hr>
<br>
<button class="btn" onclick=location.href='/students/1/courses'>SHOW ALL COURSES FOR STUDENTS 1</button>

</body>
</html>