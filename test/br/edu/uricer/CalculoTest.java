
package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoTest {
    
    //Homem abaixo do peso
    @Test
    public void testHomemAbaixoDoPeso() {        
        Calculo calculo = new Calculo("M", 1.90, 50);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem no peso ideal
    @Test
    public void testHomemNoPesoIdeal() {        
        Calculo calculo = new Calculo("M", 1.70, 70);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem acima do peso
    @Test
    public void testHomemAcimaDoPeso() {        
        Calculo calculo = new Calculo("M", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    
    //Mulher abaixo do peso
    @Test
    public void testMulherAbaixoDoPeso() {        
        Calculo calculo = new Calculo("F", 1.90, 40);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Mulher no peso ideal
    @Test
    public void testMulherPesoideal() {        
        Calculo calculo = new Calculo("F", 1.70, 65);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    //Mulher acima do peso
    @Test
    public void testMulherAcimaDoPeso() {        
        Calculo calculo = new Calculo("F", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
}
