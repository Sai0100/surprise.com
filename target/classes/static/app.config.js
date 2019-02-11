/**
 * 
 */
(function(angular) {
	'use strict';
	angular.module('surprise').config(config);
	config.$inject = [ "$stateProvider", "$urlRouterProvider",
			"$locationProvider" ];
	function config($stateProvider, $urlRouterProvider, $locationProvider) {

		$stateProvider.state('home', {
			url : '/home',
			template : '<div home></div>',
			
		}).state('helper', {
			url : '/helper',
			template : '<div helper></div>',
			
		});

		$urlRouterProvider.otherwise('/home');
	}
})(window.angular);