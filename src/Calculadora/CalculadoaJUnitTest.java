package Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoaJUnitTest {
    @Test
    //Teste soma
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(10,20);
        System.out.println(soma);
        Assert.assertEquals(30, soma); //Resultado esperado
        Assert.assertEquals(20, soma); //Resultado NÃO esperado
    }
    @Test
    //Teste subtração
    public void subtracaoDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrair(20,10);
        System.out.println(subtracao);
        Assert.assertEquals(10, subtracao); //Resultado esperado
        Assert.assertEquals(20, subtracao); //Resultado NÃO esperado
    }   
    @Test
    //Teste divisão
    public void divisaoDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.dividir(20,10);
        System.out.println(divisao);
        Assert.assertEquals(2, divisao); //Resultado esperado
        Assert.assertEquals(1, divisao); //Resultado NÃO esperado

    }     
    @Test
    //Teste multiplicação
    public void multiplicacaoDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(20,10);
        System.out.println(multiplicacao);
        Assert.assertEquals(200, multiplicacao); //Resultado esperado
        Assert.assertEquals(100, multiplicacao); //Resultado NÃO esperado

    }     
}
