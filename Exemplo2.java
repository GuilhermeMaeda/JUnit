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
		    System.out.println("C�lculo do IMC ");
			System.out.println("Qual � seu nome");
			nome = teclado.next();
		 }
	 
	 public static void test2() {
			System.out.println("Informe o ano de seu nascimento - Ex 1996");
			idade = teclado.nextInt();
	 }
	 
	 public static void test3() { 
		 age = 2016 - idade;
		 System.out.println( nome +" voc� tem " + age + " anos de idade");
	 }
	 
	 public static void test4() {
		 System.out.println("Vamos calcular seu IMC");
		 System.out.println("Informe a sua altura - Ex: 1,70");
			altura = teclado.nextFloat();
			
			System.out.println("Informe o seu peso em Kg - Ex: 65");
			peso = teclado.nextFloat();
			
			 imc = (peso / (altura*altura));
			
			if(imc <=16.00){
				System.out.println("Seu IMC � "+ imc +"Kg/m�");
				System.out.println("Voc� est� muito abaixo do peso ideal -  situa��o muito grave");
			} else if (imc >=16.00 && imc <= 16.99){
				System.out.println("Seu IMC � " + imc + "Kg/m�");
				System.out.println("Voc� est� abaixo do peso ideal - situa��o grave");
			} else if (imc >= 17.00 && imc <= 18.49){
				System.out.println("Seu IMC � " + imc + "Kg/m�");
				System.out.println("Voc� est� um pouco abaixo do peso ideal");
			}  else if(imc >= 18.50 && imc <= 24.99){
					System.out.println("Seu IMC � "+ imc +"Kg/m�");
					System.out.println("Voc� est� no peso ideal, parab�ns!");
				} else if (imc >= 25.00 && imc <= 29.99){
					System.out.println("Seu IMC � "+ imc +"Kg/m�");
					System.out.println("Voc� est� com sobrepeso do ideal, comece a dieta");
				} else if (imc >= 30.00 && imc <= 34.99){
					System.out.println("Seu IMC � "+ imc +"Kg/m�");
					System.out.println("Voc� est� com obesidade de n�vel I - Cuidado!");
				} else if (imc >= 35.00 && imc <= 39.99){
					System.out.println("Seu IMC � "+ imc +"Kg/m�");
					System.out.println("Voc� est� com obesidade de n�vel II - Perigo!");
				} else if (imc >= 40.00){
					System.out.println("Seu IMC � "+ imc +"Kg/m�");
					System.out.println("Voc� est� com obesidade de n�vel III - Obesidade m�rbida!");
				}
	  }
	 public static void test5() {	
		 final int media = 75;
		  int anoMorte = idade + media;
		  System.out.println("De acordo com as estat�sticas, a expectativa de vida dos Brasileiros em 2016 � de 75 anos \n"
		  		+ "Voc� j� viveu " + age +" anos, ent�o de acordo com o estudo voc� morrer� em " + anoMorte);
			 }
	 }

