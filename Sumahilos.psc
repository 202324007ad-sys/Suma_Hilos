Algoritmo Sumahilos
	Definir ng1, ng2 Como Entero;
	Definir suma_h1, suma_h2 Como Entero;
	
	ng1=Aleatorio(1,150);
	ng2=Aleatorio(1,150);
	
	Escribir "El numero generado para h1 es: ", ng1;
	Escribir  "El numero generado para h2 es: ", ng2;
	Escribir ""
	
	//Proceso de h1
	Si ng1>=1 y ng1<=100 Entonces
		Escribir "Proceso generado por h1";
		suma_h1 =0;
		i=1;
		Mientras i<=ng1 Hacer
			suma_h1= suma_h1+i;
			i=i+1;
		Fin Mientras
		Escribir "La suma de 1 hasta ", ng1, " es: ", suma_h1;
		
	SiNo
		Escribir "La suma no puede ser generada por h1, ya que " ng1,"  no esta en el rango (1-100)";
	FinSi
	
	Escribir ""
	//Proceso de h2
	si ng2>=100 y ng2<=150 Entonces
		Escribir "Proceso generado por h2";
		suma_h2=0;
		j=1;
		Mientras j<=ng2 Hacer
			suma_h2=suma_h2+j;
			j=j+1;
		Fin Mientras
		Escribir "La suma de 100 hasta ", ng2 " es: " suma_h2;
	SiNo
		Escribir "La suma no puede ser generada por h2 ya que ", ng2," no esta dentro del rango (100,150)";
	FinSi

FinAlgoritmo
