/**
 * Calculadora Terminal 2023
 *@autor Gabriel Rodrigues
 *@version 2.0.1
 *@since Release 03 da aplicação
 */

package br.com.kingsman;

import java.util.Objects;
import java.util.Scanner;

import static br.com.kingsman.Calc.*;
/**
 * Classe Principal
 * */
public class Main {

    /**
     * Metodo Principal
     * Recebe:
     */
    public static void main(String[] args) {
        /**
         * @param num1
        * @param num2
        * @param opc
        * @param conti* */
        Float num1 = 0.0f;
        Float num2 = 0.0f;
        String opc = " ";
        /**
         * Parâmetro para inserção de Dados
         * */
        Scanner reader = new Scanner(System.in);
        Boolean conti = true;
        do {


            /**
             * Operação Desejada
             * @param opc
             * @param num1
             * @param num2
             * */
            /**
             * Entrada da 1° Variável a ser calculada
             * @param num1
             * */
            try {
                System.out.println("Insira o Número Primário: ");
                num1 = reader.nextFloat();
                /**
                 * Entrada da 2° Variável a ser calculada
                 * @param num2
                 * */
                System.out.println("Insira o Número Secundário: ");
                num2 = reader.nextFloat();

                System.out.println("Insira a Operação Desejada:\n[ 1 ]Soma\n[ 2 ]Subtração\n[ 3 ]Multiplicação\n[ 4 ]Divisão\n[ S ]Sair");
                opc = reader.next();



            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
            /**
             * Estrutura de decisão IF, recebe:
             * @param opc
             */
            if (Objects.equals(opc, "1")) {
                /**
                 * "1" (SOMA)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                System.out.println("A soma de " + num1 + " e " + num2 + " é igual a :");
                System.out.println(soma(num1, num2));
            } else if (Objects.equals(opc, "2")) {
                /**
                 * "2" (SUBTRAÇÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                System.out.println("A subtração de " + num1 + " e " + num2 + " é igual a :");
                System.out.println(sub(num2, num1));
            } else if (Objects.equals(opc, "3")) {
                /**
                 * "3" (MULTIPLICAÇÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                System.out.println("O produto de " + num1 + " e " + num2 + " é igual a :");
                System.out.println(mult(num1, num2));
            } else if (Objects.equals(opc, "4")) {
                /**
                 * "4" (DIVISÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
            } else if (Objects.equals(opc, "4")) {
                /**
                 * "4" (RESTO DA DIVISÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                System.out.println("O produto  de " + num1 + " e " + num2 + " é igual a :");
                System.out.println(div(num2, num1));
                System.out.println("E resto: " + resDiv(num2, num1));
            } else if (Objects.equals(opc, "S") || Objects.equals(opc, "s")) {
                /**
                 * @param conti
                 * @return false*/
                conti = false;
                System.out.println("Saindo....");
            } else {
                /**
                 * @param conti
                 * @return false*/
                conti = false;
                System.out.println("Opção Inválida!!");
                System.out.println("Saindo....");
            }

        } while (conti);

    }
}



