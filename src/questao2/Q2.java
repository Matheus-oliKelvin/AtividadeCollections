package questao2;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    static void main() {
        List<Integer> listaNumeros= new ArrayList<>();

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        listaNumeros.add(50);

        listaNumeros.remove(Integer.valueOf(30));


        System.out.println(listaNumeros);

    }
}
