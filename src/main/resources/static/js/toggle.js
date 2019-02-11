(function(angular) {
	'use strict';
	angular.module('surprise').directive('slideToggle', slideToggle);
	slideToggle.$inject = [];
	function slideToggle() {
		return {
			restrict : 'A',
			scope : {
				isOpen : "=slideToggle" // 'data-slide-toggle' in our html
			},
			controller : function($scope) {
				$scope.box2 = false;
				
			},
			link : function(scope, element, attr) {
				var slideDuration = parseInt(attr.slideToggleDuration, 10) || 200;
				scope.$watch('isOpen', function(newIsOpenVal, oldIsOpenVal) {
					if (newIsOpenVal !== oldIsOpenVal) {
						element.stop().slideToggle(slideDuration);
					}
				});

			}
		};
	}
})(angular);
