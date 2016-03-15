<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
</head>
<body>
	
PERSONAL DETAILS:<BR>

<form method="post" action="/edit">

<input name="id" type="text" value=""/><br>
<input name="name" type="text" value=""/><br>
<input name="gender" type="text" value=""/><br>



	<input type="submit" value="update"/>

</form>



<form action="update-professional.html" method="post">
	
PROFESSIONAL DETAILS:<BR>

<input hidden name="username" type="text" value="${professionalProfile.username}"/><br>
<input name="branch" type="text" value="${professionalProfile.branch}"/><br>
<input name="year" type="text" value="${professionalProfile.year}"/><br>
<input name="status" type="text" value="${professionalProfile.status}"/><br>
<input name="jobCategory" type="text" value="${professionalProfile.jobCategory}"/><br>
<input name="fieldOfInterest" type="text" value="${professionalProfile.fieldOfInterest}"/><br>
<input name="qualificationId" type="text" value="${professionalProfile.qualificationId}"/><br>
<input name="achievements" type="text" value="${professionalProfile.achievements}"/><br>
<input name="projects" type="text" value="${professionalProfile.projects}"/><br>
<input name="internships" type="text" value="${professionalProfile.internships}"/><br>
<input name="coCurricularActivities" type="text" value="${professionalProfile.coCurricularActivities}"/><br>
<input name="extraCurricularActivities" type="text" value="${professionalProfile.extraCurricularActivities}"/><br>
<input name="jobId" type="text" value="${professionalProfile.jobId}"/><br>


	<input type="submit" value="Update"/>

</form>

</body>
</html>