(function(angular) {
	'use strict';
	angular.module('surprise').directive('home', home);
	home.$inject = [ '$location' ];
	function home($location) {
		return {
			templateUrl : 'app/home/home.html',
			controller : function($scope) {
				$scope.data = [ '23123', '23123', '2345677' ];
				$scope.gotoHelper = function() {
					$location.path('/helper');
				}
				$scope.gotoSender = function() {
					$location.path('/sender');
				}

			},
			link : function(scope, element, attr) {

			}
		}
	}
})(angular);