/**
 * 
 */

(function(angular) {
	'use strict'
	angular.module('surprise').directive('sender', sender);
	sender.$inject = [ '$cookies', '$http' ];
	function sender($cookies, $http) {
		return {
			templateUrl : "app/sender/sender.html",
			controller : function($scope) {
				$scope.jurny = {
					from : $cookies.get("from"),
					to : $cookies.get("to")
				}

				$scope.getGiftList = function() {
					$http.get("http://localhost:9092/surprise/getGiftList")
							.then(function(success) {
								$scope.gifts = success.data;
							}, function(fail) {
								$scope.gifts = false;
							});
				}
			},
			link : function(scope, elem, attr) {

			}
		}
	}
})(angular);