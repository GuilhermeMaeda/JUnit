package Main;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class Exemplo1 extends TestCase {
	 
	public void testSoma() {
		 // Testando se 10+10=20:
		 assertEquals("Soma", 20, 10 + 10);
	 }
	
	
	public void testSubtrai() {
		 // Testando se 2-2=0:
		 assertEquals("Subtrai", 0, 2 - 2);
	 }
	
	public void testMultiplica() {
		 // Testando se 2*2=4:
		 assertEquals("Multiplica", 4, 2 * 2);
	 }
	
	public void testDivide() {
		 // Testando se 20/2=10:
		 assertEquals("Divide", 10, 20/2);
	 }
	
	public void testPotencia() {
		 // Testando se 2^3=8:
		 assertEquals("Potencia", 8, 2*2*2);
	 }
	
}