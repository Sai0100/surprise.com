(function(angular) {
	'use strict';
	angular.module('surprise').directive('home', home);
	home.$inject = [ '$location', 'cons', '$cookies' ];
	function home($location, cons, $cookies ) {
		return {
			templateUrl : 'app/home/home.html',
			link : function(scope, element, attr) {
				scope.gotoHelper = function(from, to) {
					$cookies.put("from", from);
					$cookies.put("to", to);
					$location.path('/helper');
				}
				scope.gotoSender = function(from, to) {
					$cookies.put("from", from);
					$cookies.put("to", to);
					$location.path('/sender');
				}
				
			}
		}
	}
})(angular);