/**
 * Classe que contém cenários de teste para a classe Calculadora.
 *
 * Esta classe define vários cenários de teste para as operações de soma, subtração, multiplicação e divisão
 * fornecidas pela classe Calculadora.
 *
 * @author Mateus Maranhão
 * @version 1.0         
 * @since 21 de Setembro de 2023 
 */
package Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Cenário de testes de soma:

        // Teste 1: Soma de dois valores positivos
        int soma = calc.somar(5,5);
        System.out.println(soma);
        
        // Teste 2: Soma de dois valores positivos sendo um zero         
        soma = calc.somar(5,0);
        System.out.println(soma);

        // Teste 3: Soma de dois valores positivos ambos sendo zero 
        soma = calc.somar(0,0);
        System.out.println(soma);

        // Teste 4: Soma de dois valores positivos sendo um negativo
        soma = calc.somar(5,-1);
        System.out.println(soma);

        // Cenário de testes de subtração:

        // Teste 1: Subtração de dois valores positivos
        int subtracao = calc.subtrair(5,5);
        System.out.println(subtracao);
        
        // Teste 2: Subtração de dois valores positivos sendo um zero         
        subtracao = calc.subtrair(5,0);
        System.out.println(subtracao);

        // Teste 3: Subtração de dois valores positivos ambos sendo zero 
        subtracao = calc.subtrair(0,0);
        System.out.println(subtracao);

        // Teste 4: Subtração de dois valores positivos sendo um negativo
        subtracao = calc.subtrair(5,-1);
        System.out.println(subtracao);
        
        // Cenário de testes de multiplicação:

        // Teste 1: Multiplicação de dois valores positivos
        int multiplicacao = calc.multiplicar(5,5);
        System.out.println(multiplicacao);
        
        // Teste 2: Multiplicação de dois valores positivos sendo um zero         
        multiplicacao = calc.multiplicar(5,0);
        System.out.println(multiplicacao);

        // Teste 3: Multiplicação de dois valores positivos ambos sendo zero 
        multiplicacao = calc.multiplicar(0,0);
        System.out.println(multiplicacao);

        // Teste 4: Multiplicação de dois valores positivos sendo um negativo
        multiplicacao = calc.multiplicar(5,-1);
        System.out.println(multiplicacao);
        
        // Cenário de testes de divisão:

        // Teste 1: Divisão de dois valores positivos
        int divisao = calc.dividir(5,5);
        System.out.println(divisao);
        
        // Teste 2: Divisão de dois valores positivos sendo um zero         
        divisao = calc.dividir(5,0);
        System.out.println(divisao);

        // Teste 3: Divisão de dois valores positivos ambos sendo zero 
        divisao = calc.dividir(0,0);
        System.out.println(divisao);

        // Teste 4: Divisão de dois valores positivos sendo um negativo
        divisao = calc.dividir(5,-1);
        System.out.println(divisao);
    }
}