/**
 * 
 */

(function(angular) {
	'use strict'
	angular.module('surprise').directive('helper', helper);
	helper.$inject = [];
	function helper() {
		return {
			templateUrl : "app/helper/helper.html",
			scope : {
				
			},
			link : function(scope, elem, attr) {

			}
		}
	}
})(angular);