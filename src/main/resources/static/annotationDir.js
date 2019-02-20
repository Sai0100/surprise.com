(function(angular) {
	'use strict';
	angular.module('kp-annotation', []).directive('annotation', annotation);

	annotation.$inject = [ '$window', '$compile', 'annotation','$sce' ];
	function annotation($window, $compile, annotation, $sce) {
		return {
			templateUrl : 'annotation/annotation.html',
			scope : {
				text : '=',
			},
			link : function(scope, element, attr) {

				element.on('mouseup', function() {
					getSelectionHtml();

				});

				var getSelectionHtml = function() {
					var sel;
					var range;
					var node;

					if (window.getSelection) {
						sel = window.getSelection();
						if (sel.getRangeAt && sel.rangeCount) {
							range = window.getSelection().getRangeAt(0);

							var el = document.createElement("span");
							var annotationTxt = document.createTextNode(range);
							el.appendChild(annotationTxt);
							el.setAttribute("annotation-on-drag",'');
							el.setAttribute('style', 'background-color: #a8d1ff');
							el.setAttribute('ng-mouseover', 'alert(' + annotationTxt + ')');
							el.setAttribute('class' ,"ng-binding ng-isolate-scope");
							
							range.deleteContents();

							var frag = document.createDocumentFragment();
							var node;
							var lastNode;
							console.log(el);
							lastNode = frag.appendChild(el);
							range.insertNode(frag);
						}

					} else if (document.selection && document.selection.createRange) {
						range = document.selection.createRange();
						range.collapse(false);
						range.pasteHTML(html);
					}
				}

			}
		}
	}

})(window.angular);