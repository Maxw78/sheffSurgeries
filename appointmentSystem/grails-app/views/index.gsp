<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Hallam Medical Practice</title>
</head>
<body>
<content tag="nav">


<div id="content" role="main">
    <section class="row colset-2-its">
        <h1 style="color:8B0000">Hallam Medical Practice</h1>
 	<p>Hello and welcome to the Sheffield Hallam Medical Practice Database page. You can use this web application to view things stored on the 		medical database using the navigation controller below. 
        </p><br>
	</div>

	<div class="container">
	<form>
	<br>
	<h4> Surgery Mangement </h4>
	<p>This button will let you view the Surgery details </p>
	<button type="button" class="btn btn-success">
	<g:link controller="Surgery" action="index">View Surgery</g:link>
	</button>
	<br>
	<br>

	
	<h4> Doctor Mangement </h4>
	<p> This button will let you view the Doctors details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Doctor" action="index">View Doctor</g:link>
	</button>
	<br>
	<br>

	
	<h4>Appointment Mangement</h4>
	<p> This button will let you view the Appointment details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Appointment" action="index">View Appointment</g:link>
	</button>
	<br>
	<br>
	
	
	<h4>Patient Mangement</h4>
	<p> This button will let you view the Patient details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Patient" action="index">View Patient</g:link>
	</button>
	<br>
	<br>

	<h4>Nurse Mangement</h4>
	<p> This button will let you view the Nurse details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Nurse" action="index">View Nurse</g:link>
	</button>
	<br>
	<br>
	
	<h4>Receptionist Mangement</h4>
	<p> This button will let you view the Receptionist details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Receptionist" action="index">View Receptionist</g:link>
	</button>
	<br>
	<br>
	
	<h4>Prescription Mangement</h4>
	<p> This button will let you view the Prescription details</p>
	<button type="button" class="btn btn-success">
	<g:link controller="Prescription" action="index">View Prescription</g:link>
	</button>
	</form>
	</div>

    </section>
</div>

</body>
</html>
