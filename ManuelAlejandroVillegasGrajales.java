package ExamenEntornos;

import java.util.Scanner;

public class ManuelAlejandroVillegasGrajales {
	static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	int proceso=0;
	
	do {
		ManuelAlejandroVillegasGrajales.menu();
		System.out.println("¿Que desea hacer?");
		proceso= sc.nextInt();
		switch (proceso) {
		case 1:
			System.out.println("El area del triangulo es: "+ ManuelAlejandroVillegasGrajales.areaTriagunlo());
			break;
		case 3:
			System.out.println("El area del rectangulo es: "+ ManuelAlejandroVillegasGrajales.areaRectangulo());
			break;

		default:
			break;
		}
	} while (proceso!=4);
}

public static void menu () {
	System.out.println("CALCULO DE AREAS");
	System.out.println("==============================");
	System.out.println("1. Calcular el area de un triangulo");
	System.out.println("2. Calcular el area de un trapecio");
	System.out.println("3. Calcular el area de un rectangulo");
	System.out.println("4. Salir");
}
public static double areaTriagunlo () {
	String base="",altura="";
	int valido=0;
	do {
	System.out.println("Intruzca la base: ");
	base = sc.next();
		if(base.matches("[0-9][0-9]?")&& Double.parseDouble(base) > 0)
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido");
	} while (valido!=1);
	do {
		System.out.println("Intruzca la altura: ");
		altura = sc.next();
			if(base.matches("[0-9][0-9]?")&& Double.parseDouble(altura) > 0)
				valido =1;
			else 
				System.out.println("el valor es negativo o no es valido");
		} while (valido!=1);
	return (Double.parseDouble(base) * Double.parseDouble(altura)/2.0);
}
public static double areaRectangulo () {
	String base="", altura="";
	int valido=0;
	do {
	System.out.println("Intruzca la base: ");
	base = sc.next();
		if(base.matches("[2-9]"))
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido, recuerda que debe estar comprendido entre 2 y 10");
	} while (valido!=1);
	do {
	System.out.println("Intruzca la base: ");
	altura = sc.next();
		if(base.matches("[2-9]"))
			valido =1;
		else 
			System.out.println("el valor es negativo o no es valido, recuerda que debe estar comprendido entre 2 y 10");
	} while (valido!=1);
return Double.parseDouble(base) * Double.parseDouble(altura);
}
public static double areaTrapecio () {
	return 0;
}
}
