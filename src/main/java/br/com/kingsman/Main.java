/**Calculadora Terminal 2023
 *@autor Gabriel Rodrigues
 *@version 2.0.1
 *@since Release 03 da aplicação
 */

package br.com.kingsman;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /**
         *Parâmetro para inserção de Dados
         * */
        Scanner reader = new Scanner(System.in);
        Boolean conti = true;
        do {


            /**
             *
             *Operação Desejada
             *@param opc
             *@param num1
             *@param num2
             * */
            /**
             *Entrada da 1° Variável a ser calculada
             * @param num1
             * */
            System.out.println("Insira o Número Primário: ");
            Float num1 = reader.nextFloat();
            /**Entrada da 2° Variável a ser calculada
             * @param num2
             * */
            System.out.println("Insira o Número Secundário: ");
            Float num2 = reader.nextFloat();

            System.out.println("Insira a Operação Desejada:\n[ 1 ]Soma\n[ 2 ]Subtração\n[ 3 ]Multiplicação\n[ 4 ]Divisão\n[ S ]Sair");
            String opc = reader.next();

            /**Estrutura de decisão Switch, recebe:
             * @param opc
             */
            switch (opc) {

                /**Caso "1" (SOMA)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                case "1":
                    System.out.println("A soma de " + num1 + " e " + num2 + " é igual a :");
                    System.out.println(soma(num1, num2));
                    break;

                /**Caso "2" (SUBTRAÇÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */

                case "2":
                    System.out.println("A subtração de " + num1 + " e " + num2 + " é igual a :");
                    System.out.println(sub(num2, num1));
                    break;

                /**Caso "3" (MULTIPLICAÇÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                case "3":
                    System.out.println("O produto de " + num1 + " e " + num2 + " é igual a :");
                    System.out.println(mult(num1, num2));
                    break;

                /**Caso "4" (DIVISÃO)
                 * @param num1
                 * @param num2
                 * @return Float
                 */
                case "4":
                    System.out.println("O produto  de " + num1 + " e " + num2 + " é igual a :");
                    System.out.println(div(num2, num1));
                    System.out.println("E resto: " + resDiv(num2, num1));
                    break;

                /**Caso "S" Termina a Aplicação
                 * @param conti*/
                case "S":
                    conti = false;
                    break;

                /**Caso "s" Termina a Aplicação
                 * @param conti*/
                case "s":
                    conti = false;
                    break;
                default: System.out.println("Opção Inválida!!");
            }

        }while (conti);
    }


    /**
     *Funções de Calculos;
     * */

    /**
     * Função Soma
     *@param n1
     *@param n2
     *@return n1+n2
     * */
    public static Float soma(Float n1, Float n2) {
        return n1 + n2;
    }
    /**Função Subtração
     *@param n1
     *@param n2
     *@return n2-n1
     * */
    public static Float sub(Float n1, Float n2) {
        return n2 - n1;
    }
    /**
     * Função Multiplicação
     *@param n1
     *@param n2
     *@return n1*n2
     * */
    public static Float mult(Float n1, Float n2) {
        return n1 * n2;
    }
    /**
     * Função Divisão
     *@param n1
     *@param n2
     *@return n1/n2
     * */
    public static Float div(Float n1, Float n2) {
        return n1 / n2;
    }
    /**
     * Função Resto da Divisão
     *@param n1
     *@param n2
     *@return n1/n2 e o "resto da divisão"
     * */
    public static Float resDiv(Float n1, Float n2) {
        return n1 % n2;
    }
}
