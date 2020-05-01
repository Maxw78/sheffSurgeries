<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
    <a class="navbar-brand">Hallam Medical Practice Database<asset:image src="logo.jpg" width="60" height="60" alt="Hallam GP Logo"/></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" aria-expanded="false" style="height: 0.8px;" id="navbarContent">
        <ul class="nav navbar-nav ml-auto">
            <g:pageProperty name="page.nav"/>
        </ul>
    </div>
</nav>

	<p style="text-align: center;"><asset:image src="doctorbanner.jpg" height="300" alt="Hallam GP Logo"/></p>

<g:layoutBody/>

	<style>
	position: fixed;
	left:0;
	bottom: 0;
	width: 100%;
	background-color:dimgrey;
	color:white;
	text-align:center;
	</style>

	<div class="footer">
	<footer>
		<p>&copy;Made By Maxwell Allen for Sheffield Hallam University</p>
	</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
