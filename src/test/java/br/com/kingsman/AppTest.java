package br.com.kingsman;

import java.io.IOException;
import br.com.kingsman.BanTest.*;

public class AppTest {

    public static void main(String args[]) throws IOException {

        String path = "F:\\Lucy2.0.1\\src\\test\\java\\br\\com\\kingsman\\Teste.txt";

        BanTest.escritor(path);
        BanTest.leitor(path);
    }

}