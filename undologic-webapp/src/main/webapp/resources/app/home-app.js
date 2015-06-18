var app = angular.module('UndoLogic', ['ui.router', 'ngResource', 'angularModalService', 'ngDialog', 'xeditable'])
.config([ '$stateProvider', '$urlRouterProvider', '$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {
	
	$stateProvider
		.state('index', {
		url: '',
		templateUrl: 'resources/app/views/home/index.html',
	})
	.state('main', {
			url: '/main',
			templateUrl: 'resources/app/views/home/main.html',
		});
}]);