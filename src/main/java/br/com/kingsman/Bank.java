package br.com.kingsman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Bank {
    /**
     * Classe de leitura e escrita de arquivos;
     * @param path
     * @throws IOException
     */
public static String cont;
    public static void leitor(String path) throws IOException {
        /**
         * Metodos de leitura de arquivos;
         * @param path
         */

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            cont = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        /**
         * Metodos de gravação de arquivos;
         * @param path
         */
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        //String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        cont = in.nextLine();
        buffWrite.append(cont + "\n");
        buffWrite.close();
    }
}
