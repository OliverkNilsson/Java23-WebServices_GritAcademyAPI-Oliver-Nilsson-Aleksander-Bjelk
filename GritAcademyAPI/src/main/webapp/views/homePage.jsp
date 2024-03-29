<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<h1>Add, delete students and courses</h1>



<div class="container">
    <div class="students" >
<form id="createStudent" action="/createStudentForm" method="POST">
    <label for="fname" >First name: </label>
    <input type="text" id="fname" name="fname" required>    <br>
    <label for="lname">Last name: </label>
    <input type="text" id="lname" name="lname" required>    <br>
    <label for="town">Town: </label>
    <input type="text" id="town" name="town" required>    <br>

    <br>
    <input class="btn" type="submit" value="CREATE STUDENT"><br>

</form>
<br>

<br>
<form action="/removeStudentForm" method="POST">
    student id: <input type="text" name="id" required>
    <br>
    <br>
    <input class="btn" type="submit" value="REMOVE STUDENT">
</form>
<br>

<br>
<button class="btn" onclick=location.href='/students'>SHOW ALL STUDENTS</button>
<br>
<br>



</div>
<div class="courses">
<form id="createCourse" action="/createCourseForm" method="POST">
    <label for="name" >Course name: </label>
    <input type="text" id="name" name="name" required>    <br>
    <label for="description">Description: </label>
    <input type="text" id="description" name="description" required>    <br>
    <br>
    <input class="btn" type="submit" value="CREATE COURSE"><br>

</form>
<br>


<br>
<form action="removeCourseForm" method="POST">
   course id: <input type="text" name="id" required>
    <br>
    <br>
    <input class="btn" type="submit" value="REMOVE COURSE">
</form>
    <br>

    <br>
    <button class="btn" onclick=location.href='/courses'>SHOW ALL COURSES</button>
    <br>

    <br>
</div>
</div>



    <div class="buttonSC">
        <form id="associateStudentCourse" action="/associateStudentCourse" method="POST">
            <label for="students_id" >Student id: </label>
            <input type="text" id="students_id" name="students_id" required>    <br>
            <label for="courses_id">Course id: </label>
            <input type="text" id="courses_id" name="courses_id" required>    <br>
            <br>
            <input class="btn" type="submit" value="CREATE ASSOCIATION"><br>

        </form>

        <form id="removeAssociateStudentCourse" action="/removeAssociationStudentCourse" method="POST">
            StudentsCourses id: <input type="text" name="id" required>
            <br>
            <br>
            <input class="btn" type="submit" value="REMOVE ASSOCIATION">

        </form>
<button class="btn"  onclick=location.href='/studentsCourses'>SHOW ALL COURSES FOR STUDENTS</button>
    </div>


</body>
</html>