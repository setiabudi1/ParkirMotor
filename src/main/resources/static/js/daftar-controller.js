parkirApp.controller('DaftarController',
        function($scope, $http, $window) {

    $scope.daftarParkir = [];
    
    $scope.updateDaftar = function() {
        $http.get('/daftar-parkir').then(sukses, gagal);

        function sukses(response) {
            console.log(response.data);
            $scope.daftarParkir = response.data;
        };

        function gagal(response) {};
    };

    $scope.tambah = function() {
        $window.location.href = "/tambah-ui";
    }

    $scope.edit = function(parkir) {
        //console.log(parkir.id);
        //console.log(parkir.nama);
        //console.log(parkir.plat);
        $window.location.href = "edit-ui?id=" + parkir.id +
                "&nama=" + parkir.nama + 
                "&plat=" + parkir.plat;
    }

    $scope.hapus = function(parkir) {
        $http.delete('/api/hapus/' + parkir.id).then(sukses, gagal);

        function sukses(response) {
            $scope.updateDaftar();        
        }

        function gagal(response) {}
    }

    $scope.updateDaftar();

});