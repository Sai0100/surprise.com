(function(angular) {
	'use strict';
	angular.module('surprise').directive('autoCompleteF', autoComplete);
	autoComplete.$inject = [ '$filter', '$http','cons' ];
	function autoComplete($filter, $http,cons) {
		return {
			restrict : 'A',
			template : "<div><button></button></div>",
			controller : function($scope) {
				// var vm = this;
				// vm.client ={COMPANY_ID:'', COMPANY_DESC:''};
				$scope.dataSource = cons.journey;
				
				/*$http.get("http://localhost:9092/surprise/getFrom/Hyd").then(
						function(success) {
							$scope.dataSource = success.data;
						}, function(fail) {
							$scope.dataSource = false;
				});*/
				$scope.setClientData = function(item) {
					$scope.selected = item;
				}

			},
			link : function(scope, elem, attrs) {
				elem.autocompleteF({
					source : function(request, response) {
						var params = request.term;
						var data = scope.dataSource;
						if (data) {
							var result = $filter('filter')(data, {
								fromJ : params
							});
							angular.forEach(result, function(item) {
								item['value'] = item['fromJ'];
							});
						}
						response(result);
					},
					minLength : 1,
					select : function(event, ui) {
						scope.$apply(function() {
							console.log(ui)
							scope.setClientData(ui.item);
						});
					}
				});
			}
		}
	}
})(angular);