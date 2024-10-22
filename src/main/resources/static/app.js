var app = angular.module('shopstoreApp', []);

app.controller('WelcomeController', function($scope, $http) {
    $http.get("http://localhost:8080/") //Set it to the home page
    .then(function(response) {
        // Assign the response data to the welcomeMessage scope variable
        $scope.welcomeMessage = response.data;
    }, function(error) {
        // Handle any error that occurs while making the request
        $scope.errorMessage = "Error: Could not load welcome message.";
    });
});

