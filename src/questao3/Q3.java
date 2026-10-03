package questao3;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    static void main() {
        List<String> frutas = new ArrayList<>();

        frutas.add("maça");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");


        int posicaoBanana = frutas.indexOf("banana");

        if ( posicaoBanana != -1){
            System.out.println("'banana' encontrada no índice: " + posicaoBanana);
        }
        else{
            System.out.println("'banana' não existe!");
        }

        int posicaoUva = frutas.indexOf("uva");

        if ( posicaoUva != -1){
            System.out.println("'uva' encontrada no índice: " + posicaoUva);
        }
        else{
            System.out.println("'uva' não existe!");
        }

    }
}
