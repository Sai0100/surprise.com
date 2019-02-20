/**
 * 
 */

(function(angular) {
	'use strict'
	angular.module('surprise').directive('helper', helper);
	helper.$inject = [ '$http', 'cons', '$cookies', '$dialog' ];
	function helper($http, cons, $cookies, $dialog) {
		return {
			templateUrl : "app/helper/helper.html",
			controller : function($scope) {
				$scope.jurny = {
					from : $cookies.get("from"),
					to : $cookies.get("to")
				}
				$scope.getHelperList = function() {
					$http.get(
							"http://localhost:9092/surprise/getHelperList/"
									+ $cookies.get("from") + "/"
									+ $cookies.get("to")).then(
							function(success) {
								$scope.helpers = success.data;
							}, function(fail) {
								$scope.helpers = false;
							});
				}
			},
			link : function(scope, elem, attr) {
				var dialogOptions = {
					templateUrl : 'app/helper/add-request.html'
				};
				scope.edit = function(item) {

					var itemToEdit = item;

					$dialog.dialog(angular.extend(dialogOptions, {
						resolve : {
							item : angular.copy(itemToEdit)
						}
					})).open().then(function(result) {
						if (result) {
							angular.copy(result, itemToEdit);
						}
						itemToEdit = undefined;
					});
				};
			}
		}
	}
})(angular);