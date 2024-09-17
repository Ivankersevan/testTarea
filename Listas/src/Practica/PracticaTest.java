package Practica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Llenar el arrayList: ");
		
		//Inicializamos
		List <String> lista = new ArrayList <String>();
		
		//Entrada de datos:
		String elem = "";
		while(!((elem.equalsIgnoreCase("parar")))){
			System.out.println("Para finalizar escriba 'parar'");
			elem = in.next();
			if(!(elem.equals("parar"))) lista.add(elem);
		}
		
		in.close();
		
		System.out.println("1) Impresion implementado foreach loop:");
		for(String s : lista){
			System.out.println(s);
		}
		
		System.out.println("2) Impresion implementando for loop with index:");
		for(int i = 0;i<lista.size();i++){
			System.out.println(lista.get(i));
		}
		
		System.out.println("3) Impresion implementando iterator <tipo>:");
		for(Iterator<String> iter = lista.iterator();iter.hasNext();){
			System.out.println(iter.next());
		}
		
		System.out.println("\n\nExtra:");
		int i = 2147483638; //(2³¹-¹⁰)
		float f = (float)i;
		
		System.out.println(i);
		System.out.println(f);
		System.out.println((int)f);
		System.out.println((int)Float.parseFloat(String.valueOf(i)));
		
	}

}
