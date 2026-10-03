package questao5;

import java.util.LinkedList;
import java.util.List;

public class Q5 {
    static void main() {

        List<Integer> listaNumeros = new LinkedList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);

        listaNumeros.addFirst(0);
        listaNumeros.addLast(6);

        System.out.println(listaNumeros);

        System.out.println("Primeiro: "+ listaNumeros.getFirst() + " | Último: "+ listaNumeros.getLast());
    }
}
