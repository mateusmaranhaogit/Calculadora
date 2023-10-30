/**
 * Classe que representa uma calculadora simples.
 *
 * Esta classe fornece métodos para realizar operações matemáticas básicas, 
 * incluindo soma, subtração, multiplicação e divisão.
 *
 * @author Mateus Maranhão
 * @version 1.0         
 * @since 21 de Setembro de 2023 
 */
package Calculadora;

public class Calculadora {
    
    /**
     * Realiza a operação de soma entre dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return A soma dos dois números.
     */
    public int somar(int a, int b){
        return a + b;//Função de somar
    }
    
    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número do qual será subtraído.
     * @param b O número que será subtraído.
     * @return A diferença entre os dois números.
     */
    public int subtrair(int a, int b){
        return a - b;//Função de subtrair
    }
    
    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O produto dos dois números.
     */
    public int multiplicar(int a, int b){
        return a * b;//Função de multiplicar
    }
    
    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O número que será dividido.
     * @param b O número pelo qual será dividido (não pode ser zero).
     * @return O resultado da divisão.
     */
    public int dividir(int a, int b){
        return a / b;//Função de dividir
    }
}