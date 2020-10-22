package exercicioLogicaProgramacao2;
//Faça um algoritmo que calcule o reajuste de um salário. 
//O usuário deverá informar o salário e o percentual de reajuste para a realização do cálculo.

import java.util.Scanner;

public class exercicioLogicaProgramacao2 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		float salario;
		float reajuste;
		float total;
		
		System.out.print("Valor do sálario:");
			salario = valor.nextFloat ();
			
		System.out.println("Valor do reajuste:");
			reajuste = valor.nextFloat ();
		
			total=((salario/100)*(reajuste))+(salario);
			
			System.out.println("Seu sálario hoje é:" +total);
		
	}

}
