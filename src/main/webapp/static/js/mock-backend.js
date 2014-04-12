myAppDev = angular.module('make-a-wish-quarto-tematico-mock', ['make-a-wish-quarto-tematico', 'ngMockE2E']);
myAppDev.run(function($httpBackend) {
	phones = [{name: 'phone1'}, {name: 'phone2'}];

	// returns the current list of phones
	$httpBackend.whenGET('/phones').respond(phones);
	
	$httpBackend.whenGET('api/ranks').respond([
        { id: 123, nome: "Mesa Tal", rank: 1, delta: "up", url-imagem: "http://placehold.it/32x32" },
        { id: 124, nome: "Mesa Tal Dois", rank: 2, delta: "down", url-imagem: "http://placehold.it/32x32" },
        { id: 125, nome: "Mesa Do Canto", rank: 3, delta: "stay", url-imagem: "http://placehold.it/32x32" }
    ]);

	// adds a new phone to the phones array
	$httpBackend.whenPOST('/phones').respond(function(method, url, data) {
		phones.push(angular.fromJson(data));
	});
	$httpBackend.whenGET(/^\/?partials\//).passThrough();
	//...
});