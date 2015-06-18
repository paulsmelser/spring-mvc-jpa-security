<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="UndoLogic">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body ng-controller="LoaderController">
<h1>Hello World!</h1>
<p>This is the homepage!</p>

<div class="container" ui-view></div>

<script src="resources/lib/bootstrap/js/modernizr-2.6.2.min.js"></script>
<script src="resources/lib/bootstrap/js/jquery.min.js"></script>
<script src="resources/bower-lib/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="resources/lib/bootstrap/js/bootstrap-slider.js"></script>
<script src="resources/lib/bootstrap/js/touchscroll.js"></script>
<script	src="resources/bower-lib/angular/angular.js" type="text/javascript"></script>
<script	src="resources/bower-lib/angular-route/angular-route.js" type="text/javascript"></script>
<script	src="resources/bower-lib/angular-animate/angular-animate.min.js" type="text/javascript"></script>
<script	src="resources/bower-lib/angular-resource/angular-resource.min.js" type="text/javascript"></script>
<script	src="resources/bower-lib/angular-ui-router/release/angular-ui-router.min.js"	type="text/javascript"></script>
<script	src="resources/lib/custom/js/spin.js"	type="text/javascript"></script>

<script	src="resources/lib/bootstrap/js/loading-bar.min.js" type="text/javascript"></script>
<script src="resources/lib/bootstrap/js/modal.js" type="text/javascript"></script>
<script src="resources/lib/bootstrap/js/holder.js" type="text/javascript"></script>
<script	src="resources/lib/bootstrap/js/jquery.blueimp-gallery.min.js" type="text/javascript"></script>

<script	src="resources/app/services/angular-modal-service.min.js" type="text/javascript"></script>
<script	src="resources/app/services/ng-dialog.js" type="text/javascript"></script>
<script src="resources/app/providers/js-import-provider.js" type="text/javascript"></script>

<script src="resources/app/home-app.js" type="text/javascript"></script>
<script	src="resources/app/controllers/loader-controller.js"	type="text/javascript"></script>
<script	src="resources/app/controllers/home/home-controller.js"	type="text/javascript"></script>
<script	src="resources/lib/angular/js/xeditable.min.js"	type="text/javascript"></script>
</body>
</html>
