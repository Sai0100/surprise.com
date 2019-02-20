/**
 * 
 */

(function(angular) {
	'use strict'
	angular.module('surprise').directive('sender', sender);
	sender.$inject = [];
	function sender() {
		return {
			templateUrl : "app/sender/sender.html",
			link : function(scope, elem, attr) {

			}	
		}
	}
})(angular);