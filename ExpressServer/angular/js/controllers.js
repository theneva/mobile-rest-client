var app = angular.module('usersListApp', []);

app.controller('UsersController', function ($scope, $http) {
    $http.get('/users')
        .success(function (users) {
            $scope.users = users;
        });
});
