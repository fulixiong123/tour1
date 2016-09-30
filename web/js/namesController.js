angular.module('myApp', []).controller('namesCtrl', function ($scope,$http) {
    console.info("myapp")
    $http.get("api/context/get/news")
        .success(function (response) {
            $scope.news = response;
            console.info(response)
        }).error(function () {
console.info("errpr")
    })
});