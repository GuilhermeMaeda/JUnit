package Main;

import java.util.Scanner;

import junit.framework.TestCase;

public class Exemplo3 extends TestCase {
	//Jogo do verdadeiro ou falso. 
	static Scanner teclado = new Scanner (System.in);
	
	
	static int resposta;
	
	 public void test1() {
		    System.out.println("Jogo de verdadeiro ou falso \n Tecle 1 para verdadeiro e 2 para falso");
		    System.out.println("1- A Alemanha tem 55 milh�es de habitantes");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Voc� errou, estude mais e tente na pr�xima vez :D");
	        } else{
	        	System.out.println("Acert� miseravi - A Alemnaha tem 81 milh�es de habitantes");
	        }
		 }
	 
	 public void test2() {
		    System.out.println("2- J�piter � o maior planeta do sistema solar");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Acert� miseravi");
	        } else{
	        	System.out.println("Voc� errou, estude mais e tente na pr�xima vez :D");
	        }
			 }
	 
	 public void test3() {
		 System.out.println("3- Bill Gates � co-fundandor da Google");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Voc� errou, estude mais e tente na pr�xima vez :D");
	        } else{
	        	System.out.println("Acert� miseravi - Bill Gates � co-fundador da Microsoft");
	        }
	 }
	 
	 public void test4() {
		 System.out.println("4- O apelido para a Calif�rnia � Sunshine State");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Voc� errou, estude mais e tente na pr�xima vez :D");
	        } else{
	        	System.out.println("Acert� miseravi - O apelido para a Fl�rida � Sunshine State");
	        }
	 }
	 
	 public void test5() {
		 System.out.println("5- O S�o Paulo Futebol Clube � o �nico time brasileiro a conquistar 3 t�tulos mundiais");
			System.out.println("1- Verdadeiro");
			System.out.println("2- Falso");
			System.out.println("Digite sua aposta");
	        resposta = teclado.nextInt();
	        
	        if(resposta == 1){
	        	System.out.println("Acert� miseravi - O tricolor paulista � o melhor time do Brasil");
	        } else{
	        	System.out.println("Voc� errou, estude mais e tente na pr�xima vez :D");
	        	
	        }
	 }
  	
	 }