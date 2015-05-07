'use strict';

/**
 * @ngdoc function
 * @name uiWebApp.controller:UserCtrl
 * @description
 * # UserCtrl
 * Controller of the uiWebApp
 */
angular.module('uiWebApp')
  .controller('UserCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
