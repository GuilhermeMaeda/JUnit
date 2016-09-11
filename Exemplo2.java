package Main;

import static org.junit.Assert.*;

import java.util.Scanner;

import junit.framework.TestCase;
import org.junit.Test;

public class Exemplo2 extends TestCase {
	 
	static Scanner teclado = new Scanner (System.in);
	
	static String nome;
	static int idade;
	static int age;
	static float peso;
	static float altura;
	static float imc;
	
	
	
	 public static void test1() {
		    System.out.println("Cálculo do IMC ");
			System.out.println("Qual é seu nome");
			nome = teclado.next();
		 }
	 
	 public static void test2() {
			System.out.println("Informe o ano de seu nascimento - Ex 1996");
			idade = teclado.nextInt();
	 }
	 
	 public static void test3() { 
		 age = 2016 - idade;
		 System.out.println( nome +" você tem " + age + " anos de idade");
	 }
	 
	 public static void test4() {
		 System.out.println("Vamos calcular seu IMC");
		 System.out.println("Informe a sua altura - Ex: 1,70");
			altura = teclado.nextFloat();
			
			System.out.println("Informe o seu peso em Kg - Ex: 65");
			peso = teclado.nextFloat();
			
			 imc = (peso / (altura*altura));
			
			if(imc <=16.00){
				System.out.println("Seu IMC é "+ imc +"Kg/m²");
				System.out.println("Você está muito abaixo do peso ideal -  situação muito grave");
			} else if (imc >=16.00 && imc <= 16.99){
				System.out.println("Seu IMC é " + imc + "Kg/m²");
				System.out.println("Você está abaixo do peso ideal - situação grave");
			} else if (imc >= 17.00 && imc <= 18.49){
				System.out.println("Seu IMC é " + imc + "Kg/m²");
				System.out.println("Você está um pouco abaixo do peso ideal");
			}  else if(imc >= 18.50 && imc <= 24.99){
					System.out.println("Seu IMC é "+ imc +"Kg/m²");
					System.out.println("Você está no peso ideal, parabéns!");
				} else if (imc >= 25.00 && imc <= 29.99){
					System.out.println("Seu IMC é "+ imc +"Kg/m²");
					System.out.println("Você está com sobrepeso do ideal, comece a dieta");
				} else if (imc >= 30.00 && imc <= 34.99){
					System.out.println("Seu IMC é "+ imc +"Kg/m²");
					System.out.println("Você está com obesidade de nível I - Cuidado!");
				} else if (imc >= 35.00 && imc <= 39.99){
					System.out.println("Seu IMC é "+ imc +"Kg/m²");
					System.out.println("Você está com obesidade de nível II - Perigo!");
				} else if (imc >= 40.00){
					System.out.println("Seu IMC é "+ imc +"Kg/m²");
					System.out.println("Você está com obesidade de nível III - Obesidade mórbida!");
				}
	  }
	 public static void test5() {	
		 final int media = 75;
		  int anoMorte = idade + media;
		  System.out.println("De acordo com as estatísticas, a expectativa de vida dos Brasileiros em 2016 é de 75 anos \n"
		  		+ "Você já viveu " + age +" anos, então de acordo com o estudo você morrerá em " + anoMorte);
			 }
	 }

