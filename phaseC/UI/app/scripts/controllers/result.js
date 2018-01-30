'use strict';
/**
 * @ngdoc function
 * @name uiApp.controller:resultctrl
 * @description
 * # Display result on the result page
 * Controller of the uiApp
 */

var data = {};
var url = 'http://localhost:8080/detect';
var app = angular.module('uiApp');
app.controller('resultctrl',function ($scope,$rootScope) {
  $scope.data = $rootScope.PostDataResponse;
});
