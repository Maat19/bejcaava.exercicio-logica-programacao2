package exercicioLogicaProgramacao2;
//Fa�a um algoritmo que calcule o reajuste de um sal�rio. 
//O usu�rio dever� informar o sal�rio e o percentual de reajuste para a realiza��o do c�lculo.

import java.util.Scanner;

public class exercicioLogicaProgramacao2 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		float salario;
		float reajuste;
		float total;
		
		System.out.print("Valor do s�lario:");
			salario = valor.nextFloat ();
			
		System.out.println("Valor do reajuste:");
			reajuste = valor.nextFloat ();
		
			total=((salario/100)*(reajuste))+(salario);
			
			System.out.println("Seu s�lario hoje �:" +total);
		
	}

}
