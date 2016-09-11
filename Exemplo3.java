package Main;

import java.util.Scanner;

import junit.framework.TestCase;

public class Exemplo3 extends TestCase {
	//Jogo do verdadeiro ou falso. 
	static Scanner teclado = new Scanner (System.in);
	
	
	static int resposta;
	
	 public void test1() {
		    System.out.println("Jogo de verdadeiro ou falso \n Tecle 1 para verdadeiro e 2 para falso");
		    System.out.println("1- A Alemanha tem 55 milhões de habitantes");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Você errou, estude mais e tente na próxima vez :D");
	        } else{
	        	System.out.println("Acertô miseravi - A Alemnaha tem 81 milhões de habitantes");
	        }
		 }
	 
	 public void test2() {
		    System.out.println("2- Júpiter é o maior planeta do sistema solar");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Acertô miseravi");
	        } else{
	        	System.out.println("Você errou, estude mais e tente na próxima vez :D");
	        }
			 }
	 
	 public void test3() {
		 System.out.println("3- Bill Gates é co-fundandor da Google");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Você errou, estude mais e tente na próxima vez :D");
	        } else{
	        	System.out.println("Acertô miseravi - Bill Gates é co-fundador da Microsoft");
	        }
	 }
	 
	 public void test4() {
		 System.out.println("4- O apelido para a Califórnia é Sunshine State");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Você errou, estude mais e tente na próxima vez :D");
	        } else{
	        	System.out.println("Acertô miseravi - O apelido para a Flórida é Sunshine State");
	        }
	 }
	 
	 public void test5() {
		 System.out.println("5- O São Paulo Futebol Clube é o único time brasileiro a conquistar 3 títulos mundiais");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Acertô miseravi - O tricolor paulista é o melhor time do Brasil");
	        } else{
	        	System.out.println("Você errou, estude mais e tente na próxima vez :D");
	        	
	        }
	 }
  	
	 }