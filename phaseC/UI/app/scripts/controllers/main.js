'use strict';

/**
 * Upload multiple files from folder 1 to server
 * @name uiApp.controller:MainCtrl
 * @description
 * # handling multiple file uploads from folder1
 * Controller of the uiApp
 */
angular.module('uiApp')
  .controller('MainCtrl',[ '$scope', 'Upload', function ($scope, Upload) {

    // $scope.selectedFile1 = null;
    $scope.selectedFile2 = null;

    $scope.uploadFiles1 = function(files) {
      console.log('Selected files array from folder 1',  files);
      $scope.filesList = files;
      if (files && files.length) {
          console.log(files);
          for(var i=0; i<$scope.filesList.length; i++){
            console.log($scope.filesList[i]);
            var filename = $scope.filesList[i].name;
            var newfile = filename.split('.')[1];
            console.log(newfile);
            if(newfile!=='java'){
              alert('Please upload only JAVA files');
            }
            else if($scope.filesList[i].size === 0){
              alert('Empty file uploaded');
            }
            else{
           Upload.upload({
            url: 'http://localhost:8080/upload',
            data: {files:  $scope.filesList[i]}
          }).then(function (resp) {
            console.log('Success ' + resp);
          }, function (resp) {
            console.log('Error status: ' + resp.status);
          });
      }}
      }
    };

    /**
     * Upload multiple files from folder 1 to server
     * @name uiApp.controller:MainCtrl
     * @description
     * # handling multiple file uploads from folder2
     * Controller of the uiApp
     */
    $scope.uploadFiles2 = function(files) {
      console.log('Selected files array from solder 2',  files);
      $scope.filesList2 = files;
      if (files && files.length) {
        console.log(files);
        for(var i=0; i<$scope.filesList2.length; i++) {
          console.log($scope.filesList2[i].name);
          var filename = $scope.filesList2[i].name;
          var newfile = filename.split('.')[1];
          console.log(newfile);
          if(newfile!=='java'){
            alert('Please upload only JAVA files');
          }
          else if ($scope.filesList2[i].size === 0)
          {
            alert('Empty file uploaded');
          }
          else {
            Upload.upload({
              url: 'http://localhost:8080/upload2',
              data: {files: $scope.filesList2[i]}
            }).then(function (resp) {
              console.log('Success ' + resp);
            }, function (resp) {
              console.log('Error status: ' + resp.status);
            });
          }
        }
      }
    };

  }]);
