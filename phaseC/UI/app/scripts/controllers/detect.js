'use strict';
/**
 * @ngdoc function
 * @name uiApp.controller:DetectCtrl
 * @description
 * # Getting data from the server to display and checking for errors
 * Controller of the uiApp
 */

var url = 'http://localhost:8080/detect';
var app = angular.module('uiApp');
app.controller('TestCtrl',function ($scope,$rootScope, $http,$location) {
  $scope.send = function () {
    // use $.param jQuery function to serialize data from JSON
    var data = '';
    var config = {
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
      }
    };

    $http.post(url, data, config)
      .then(function (success) {
        $rootScope.PostDataResponse = success.data;
        console.log('Inside the function ' + success.status );
        $location.url('/result');
      }, function (response) {
        if(response.status !== 200){
          alert('Error in Detection, Please re-upload');
        }
      });
  };
});
