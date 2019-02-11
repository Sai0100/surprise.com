(function(angular) {
	'use strict';
	angular.module('surprise').directive('home', home);
	home.$inject = [];
	function home() {
		return {
			templateUrl : 'app/home/home.html',
			controller : function($scope) {
				$scope.data = ['23123','23123','2345677'];
			},
			link : function(scope, element, attr) {
				
			}
		}
	}
})(angular);