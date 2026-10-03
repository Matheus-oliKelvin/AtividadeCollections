package questao4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4 {
    static void main() {
        List<Integer> listaNumeros= new ArrayList<>();

        listaNumeros.add(42);
        listaNumeros.add(7);
        listaNumeros.add(19);
        listaNumeros.add(3);
        listaNumeros.add(25);

        Collections.sort(listaNumeros);

        System.out.println("Cresente: " + listaNumeros);

        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("Decrescente: " + listaNumeros);
    }
}
