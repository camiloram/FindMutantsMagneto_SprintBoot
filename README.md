
Desafíos:
Nota: La documentacion fucional se encuentra detallada en el PDF - Camilo Andres Ramirez - Examen MercadoLibre.pdf

Nivel 1:
Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por
Magneto.

•	Se desarrollo una aplicación en lenguaje JAVA inicialmente un proyecto WEB Maven, pero al tener inconvenientes con el despliegue en la nube se genero un proyecto JAVA SpringBoot. FindMutantsMagneto_SprintBoot.

Repo: https://github.com/camiloram/FindMutantsMagneto_SprintBoot

Nivel 2:
Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
Amazon AWS, etc), crear el servicio “/mutant/” en donde se pueda detectar si un humano es
mutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el
siguiente formato:
POST → /mutant/
{
“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un
403-Forbidden

•	La operación solicitada (“/mutant”) se encuentra desplegada en GCP (Google Cloud Platform) en la ruta:

https://magnetofindmutants.rj.r.appspot.com/magnetoFind/mutant

y para comprobar su funcionalidad testeamos el método con postman, usando el JSON de ejemplo el cual sugiere que la secuencia de ADN es de un mutante.

{
	"dna":[
		"ATGCGA",
		"CAGTGC",
		"TTATGT",
		"AGAAGG",
		"CCCCTA",
		"TCACTG"]
}

testeamos el método con postman, usando el JSON de ejemplo modificado para que la secuencia de ADN sea de un humano.

{
	"dna":[
		"ATGCGA",
		"CAGTGC",
		"TTATGT",
		"AGAATG",
		"CCCTTA",
		"TCACTG"]
}
	
La documentación y el proyecto para importar en postman se encuentra en los siguientes enlaces:

https://documenter.getpostman.com/view/8107506/UUy4ckQ7
https://github.com/camiloram/FindMutantsMagneto_SprintBoot/tree/master/Postman

La operación se desarrollo de manera dinámica para que reciba una matiz de diferente tamaño Ej 4x4, 6x6, 10x10 por mencionar algunos tamaños, y se implementaron validaciones para que el tamaño de las filas y las columnas correspondan al mismo tamaño.

{
	"dna":[
		"ATGTGCCGA",
		"CAGCACTGC",
		"CCCGAATTA",
		"TTACCTTGT",
		"ATGCGATGC",
		"TCACTGAGT",
		"AGAATGCCT",
		"CCTTTATAT",
		"TCACTGTGC"]
}
 
Nivel 3:
Anexar una base de datos, la cual guarde los ADN’s verificados con la API.
Solo 1 registro por ADN.

•	La base de datos solicitada se encuentra en GCP (Google Cloud Platform) es una BD MySql con las siguientes especificaciones para la conexion:


 

Se registraron los 3 escenarios anteriormente descritos. 1 registro X ADN

 


Exponer un servicio extra “/stats” que devuelva un Json con las estadísticas de las
verificaciones de ADN: {“count_mutant_dna”:40, “count_human_dna”:100: “ratio”:0.4}


•	La operación solicitada (“/stats”) se encuentra desplegada en GCP (Google Cloud Platform) en la ruta:

https://magnetofindmutants.rj.r.appspot.com/magnetoFind/stats

y para comprobar su funcionalidad testeamos en el navegador al ser método GET

 

O el método con postman.

 

Tener en cuenta que la API puede recibir fluctuaciones agresivas de tráfico (Entre 100 y 1
millón de peticiones por segundo).
Test-Automáticos, Code coverage > 80%.

Entregar:

● (OK) Código Fuente (Para Nivel 2 y 3: En repositorio github).
● (OK) Instrucciones de cómo ejecutar el programa o la API. (Para Nivel 2 y 3: En README de
github).
● (OK) URL de la API (Nivel 2 y 3).
