package br.com.kingsman;
/**
 *Funções de Calculos
 * @version 1.1
 * @since Release 01 da classe
 * Na classe Calc;
 * Cada Função Recebe dois valores e checa se é um float e se é diferente de zero e execulta a operação.
 * Calculadora Terminal 2023
 */
public class Calc {



    public static Float soma(Float n1, Float n2) {
        /**
         * Função Soma
         * @param n1
         * @param n2
         * @param n1t
         * @param n2t
         * @return n1+n2
         * */
        String n1t = n1.getClass().getSimpleName();
        String n2t = n2.getClass().getSimpleName();
        if (n1 == 0.0f){
            throw new RuntimeException("Digite Um Número Diferente de ZERO!");
        }else if(n1t != "Float" && n2t  != "Float" ){
            throw new RuntimeException("Digite um número no Formato: x,xxxx ou x!");
        }else{return n1 + n2;}

    }

    public static Float sub(Float n1, Float n2) {
        /**Função Subtração
         * @param n1
         * @param n2
         * @param n1t
         * @param n2t
         * @return n2-n1
         * */
        String n1t = n1.getClass().getSimpleName();
        String n2t = n2.getClass().getSimpleName();
        if (n1 == 0.0f){throw new RuntimeException("Digite Um Número Diferente de ZERO!");
        }else if(n1t != "Float" && n2t  != "Float" ){
            throw new RuntimeException("Digite um número no Formato: x,xxxx ou x!");
        }else{return n2 - n1;}
    }

    public static Float mult(Float n1, Float n2) {
        /**
         * Função Multiplicação
         * @param n1
         * @param n2
         * @param n1t
         * @param n2t
         * @return n1*n2
         * */
        String n1t = n1.getClass().getSimpleName();
        String n2t = n2.getClass().getSimpleName();
        if (n1 == 0.0f){throw new RuntimeException("Digite Um Número Diferente de ZERO!");
        }else if(n1t != "Float" && n2t  != "Float" ){
            throw new RuntimeException("Digite um número no Formato: x,xxxx ou x!");
        }else{return n1 * n2;}
    }

    public static Float div(Float n1, Float n2) {
        /**
         * Função Divisão
         * @param n1
         * @param n2
         * @param n1t
         * @param n2t
         * @return n1/n2
         * */
        String n1t = n1.getClass().getSimpleName();
        String n2t = n2.getClass().getSimpleName();
        if (n1 == 0.0f){
            throw new RuntimeException("Digite Um Número Diferente de ZERO!");
        }else if(n1t != "Float" && n2t  != "Float" ){
            throw new RuntimeException("Digite um número no Formato: x,xxxx ou x!");
        }else{return n1 / n2;}
    }

    public static Float resDiv(Float n1, Float n2) {
        /**
         * Função Resto da Divisão
         * @param n1
         * @param n2
         * @param n1t
         * @param n2t
         * @return n1%n2
         * */
        String n1t = n1.getClass().getSimpleName();
        String n2t = n2.getClass().getSimpleName();
        if (n1 == 0.0f){
            throw new RuntimeException("Digite Um Número Diferente de ZERO!");
        }else if(n1t != "Float" && n2t  != "Float" ){
            throw new RuntimeException("Digite um número no Formato: x,xxxx ou x!");
        }else{return n1 % n2;}
    }
}

