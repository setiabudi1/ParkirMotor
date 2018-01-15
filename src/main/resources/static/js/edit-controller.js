parkirApp.controller('EditController', 
        function($scope, $http, $window) {
    
    $scope.parkir = {};

    $scope.init = function() {
        var param = $window.location.search.split("&");
        for(i=0; i<param.length; i++) {
            var data = param[i].split("=");
            console.log(data);
            switch(i) {
                case 0: $scope.parkir.id = data[1];
                case 1: $scope.parkir.nama = data[1];
                case 2: $scope.parkir.plat = data[1];
            }
        }
    }

    $scope.simpan = function() {
        $http.post("/api/tambah", $scope.parkir)
            .then(sukses, gagal);

        function sukses(response) {
            $window.location.href = "/";    
        };

        function gagal(response) {
            console.log(response);
        };
    }

    $scope.batal = function() {
        $window.location.href = "/";
    }

    $scope.init();

});