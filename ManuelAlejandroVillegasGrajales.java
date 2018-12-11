package ExamenEntornos;

import java.util.Scanner;

public class ManuelAlejandroVillegasGrajales {
	static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	//declaramos la varialbe proceso la cual controlara las obciones del menu
	int proceso=0;
	do {
		//llamamos a la funcion menu de forma reiterativa hasta que proceso = 4
		ManuelAlejandroVillegasGrajales.menu();
		System.out.println("¿Que desea hacer?");
		proceso= sc.nextInt();
		//uso un switch para los diferentes casos del menu
		switch (proceso) {
		case 1:
			System.out.println("El area del triangulo es: "+ ManuelAlejandroVillegasGrajales.areaTriagunlo());
			break;
		case 3:
			System.out.println("El area del rectangulo es: "+ ManuelAlejandroVillegasGrajales.areaRectangulo());
			break;
		case 2:
			System.out.println("El area del trapecio es: "+ManuelAlejandroVillegasGrajales.areaTrapecio());
			break;
		default:
			break;
		}
	} while (proceso!=4);
}

public static void menu () {
	//metodo que nos genera el menu, se trata de un metodo estático y que no retorna nada.
	System.out.println("CALCULO DE AREAS");
	System.out.println("==============================");
	System.out.println("1. Calcular el area de un triangulo");
	System.out.println("2. Calcular el area de un trapecio");
	System.out.println("3. Calcular el area de un rectangulo");
	System.out.println("4. Salir");
}
public static double areaTriagunlo () {
	/*
	 * Método que nos calcula el area del triangulo, no necesita parametros y nos retorna un double.
	 * inicializamos tres variables base, altura de tipo string y valido de tipo int 
	 * Usare las variables como string para asi poder controlar mejor sus caracteristicas con los metodos que implementa la clase String
	 * Usare la variable valido para controlar los bucles que se producen en el metodo
	 * 
	 */
	String base="",altura="";
	int valido=0;
	do {
	System.out.println("Intruzca la base: ");
	/*
	 * aqui le hacemos el ingreso de datos tanto base como altua y vemos si cumple con las caracteristicas que se piden
	 * para la comprobacion uso el metodo matches para ver si es un numero comprendido entre 0-9 y asi descartar los caracteres no numericos
	 * posteriormente comprobamos si ese dato recogido es mayor que 0 como la variable "base" es de tipo String uso el metodo Double.parseDouble()
	 * para convertirlo en un double y poder comprobarlo, si estas dos condiciones se cumplen, el dato sera recogido si no es asi, 
	 * se  repetira el bucle hasta que el dato sea correcto. Cuando la condicion se cumple y el dato es recogido el valor de valido cambia a 1 y por
	 * y por tanto rompe el bucle.
	 */
	base = sc.next();
		if(base.matches("[0-9][0-9]?")&& Double.parseDouble(base) > 0)
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido");
	} while (valido!=1);
	//regresamos el valor de la variable "controladora" a 0
	valido =0;
	do {
		System.out.println("Intruzca la altura: ");
		altura = sc.next();
			if(altura.matches("[0-9][0-9]?")&& Double.parseDouble(altura) > 0)
				valido =1;
			else 
				System.out.println("el valor es negativo o no es valido");
		} while (valido!=1);
	return (Double.parseDouble(base) * Double.parseDouble(altura)/2.0);
}
public static double areaRectangulo () {
	/*
	 * El metodo area rectangulo funciona de forma similar al rectangulo, la unica diferencia con el anterior es que este solo acepta numero entre 2 a 10
	 * por lo cual el filtro es distinto, aun asi su funcionalidad es muy fimilar al anterior
	 */
	String base="", altura="";
	int valido=0;
	do {
	System.out.println("Intruzca la base: ");
	base = sc.next();
		if(base.matches("[2-9]"))
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido, recuerda que debe estar comprendido entre 2 y 9");
	} while (valido!=1);
	valido = 0;
	do {
	System.out.println("Intruzca la altura: ");
	altura = sc.next();
		if(altura.matches("[1-9]"))
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido, recuerda que debe estar comprendido entre 2 y 9");
	} while (valido!=1);
return Double.parseDouble(base) * Double.parseDouble(altura);
}
public static double areaTrapecio () {
	/*
	 * El metodo traprecio funciona de forma similar a la anterior solo que cambiando los filtros en la recepcion de datos
	 */
	String baseA ="", baseB="", altura="";
	int valido=0;
	do {
		System.out.println("Intruzca la altura: ");
		altura = sc.next();
			if(altura.matches("[0-9][0-9]?")&& Double.parseDouble(altura) > 0)
				valido =1;
			else 
				System.out.println("el valor es negativo o no es valido");
		} while (valido!=1);
	valido =0;
	do {
	do {
		System.out.println("Intruzca la base A: ");
		baseA = sc.next();
			if(baseA.matches("[0-9][0-9]?")&& Double.parseDouble(baseA) > 0)
				valido =1;
			else 
				System.out.println("el valor es negativo o no es valido");
		} while (valido!=1);
	valido =0;
	do {
		System.out.println("Intruzca la base B: ");
		baseB = sc.next();
			if(baseB.matches("[0-9][0-9]?")&& Double.parseDouble(baseB) > 0)
				valido =1;
			else 
				System.out.println("el valor es negativo o no es valido");
		} while (valido!=1);
	valido =0;
		if(Double.parseDouble(baseA)== Double.parseDouble(baseB))
			System.out.println("Ambas bases no pueden ser iguales, reinserte los datos");
	} while (Double.parseDouble(baseA)== Double.parseDouble(baseB));
	return ((Double.parseDouble(baseA)+Double.parseDouble(baseB))/2) * Double.parseDouble(altura);
}
}
