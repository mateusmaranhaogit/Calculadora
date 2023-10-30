/**
 * Classe de teste unitário para a classe Calculadora.
 * 
 * Esta classe contém uma série de testes unitários para verificar o funcionamento correto
 * das operações de soma, subtração, multiplicação e divisão da classe Calculadora.
 *
 * @author Mateus Maranhão
 * @version 1.0         
 * @since 21 de Setembro de 2023 
 */

package Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoaJUnitTest {
    //Teste de soma
    @Test
    //Teste 1: Soma de dois valores positivos
    public void somaNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(5,4);
        Assert.assertEquals(10, soma); //Resultado esperado
        Assert.assertNotEquals(20, soma); //Resultado NÃO esperado
    }
    @Test
    //Teste 2: Soma de dois valores positivos sendo um zero 
    public void somaUmZero(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(5,0);
        Assert.assertEquals(5, soma); //Resultado esperado
        Assert.assertNotEquals(10, soma); //Resultado NÃO esperado
    }
    @Test
    //Teste 3: Soma de dois valores positivos ambos sendo zero 
    public void somaDoisZeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(0,0);
        Assert.assertEquals(0, soma); //Resultado esperado
        Assert.assertNotEquals(5, soma); //Resultado NÃO esperado
    }
    @Test
    //Teste 4: Soma de dois valores sendo um negativo
    public void somaUmNegativo(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(5,-1);
        Assert.assertEquals(4, soma); //Resultado esperado
        Assert.assertNotEquals(5, soma); //Resultado NÃO esperado
    }
    //Teste de subtração
    @Test
    //Teste 1: Subtração de dois valores positivos
    public void subtracaoNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrair(5,4);
        Assert.assertEquals(0, subtracao); //Resultado esperado
        Assert.assertNotEquals(1, subtracao); //Resultado NÃO esperado
    }   
    @Test
    //Teste 2: Subtração de dois valores positivos sendo um zero  
    public void subtracaoUmZero(){
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrair(5,0);
        Assert.assertEquals(5, subtracao); //Resultado esperado
        Assert.assertNotEquals(1, subtracao); //Resultado NÃO esperado
    } 
    @Test
     //Teste 3: Subtração de dois valores positivos ambos sendo zero 
    public void subtracaoDoisZeros(){
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrair(0,0);
        Assert.assertEquals(0, subtracao); //Resultado esperado
        Assert.assertNotEquals(1, subtracao); //Resultado NÃO esperado
    } 
    @Test
     //Teste 4: Subtração de dois valores positivos sendo um negativo 
    public void subtracaoUmNegativo(){
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrair(5,-1);
        Assert.assertEquals(6, subtracao); //Resultado esperado
        Assert.assertNotEquals(1, subtracao); //Resultado NÃO esperado
    }
    //Teste de divisão 
    @Test
    //Teste 1: Divisão de dois valores positivos
    public void divisaoNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.dividir(4,2);
        Assert.assertEquals(2, divisao); //Resultado esperado
        Assert.assertNotEquals(1, divisao); //Resultado NÃO esperado
    }    
    //Teste 2: Divisão de dois valores positivos sendo um zero 
    @Test
    public void divisaoUmZero() throws Exception{
        Calculadora calculadora = new Calculadora();
        Assert.assertThrows(ArithmeticException.class, () -> calculadora.dividir(4, 0));
    }   
    //Teste 3: Divisão de dois valores positivos ambos sendo zero 
    @Test
    public void divisaoDoisZero() throws Exception{
        Calculadora calculadora = new Calculadora();
        Assert.assertThrows(ArithmeticException.class, () -> calculadora.dividir(0, 0));
    }  
    //Teste 4: Divisão de dois valores positivos sendo um negativo
    @Test
    public void divisaoUmNegativo() throws Exception{
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.dividir(4,-4);
        Assert.assertEquals(-1, divisao); //Resultado esperado
    } 
    //Teste de multiplicação
    @Test
    //Teste 1: Multiplicação de dois valores positivos
    public void multiplicacaoNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(5,4);
        Assert.assertEquals(20, multiplicacao); //Resultado esperado
        Assert.assertNotEquals(100, multiplicacao); //Resultado NÃO esperado
    } 
    @Test    
    //Teste 2: Multiplicação de dois valores positivos sendo um zero  
    public void multiplicacaoUmZero(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(5,0);
        Assert.assertEquals(0, multiplicacao); //Resultado esperado
        Assert.assertNotEquals(50, multiplicacao); //Resultado NÃO esperado
    }   
    @Test
    //Teste 3: Multiplicação de dois valores positivos ambos sendo zero   
    public void multiplicacaoDoisZeros(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(0,0);
        Assert.assertEquals(0, multiplicacao); //Resultado esperado
        Assert.assertNotEquals(10, multiplicacao); //Resultado NÃO esperado
    }  
    @Test
    //Teste 4: Multiplicação de dois valores positivos sendo um negativo  
    public void multiplicacaoUmNegativo(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(5,-1);
        Assert.assertEquals(-5, multiplicacao); //Resultado esperado
        Assert.assertNotEquals(1, multiplicacao); //Resultado NÃO esperado
    }  
}
