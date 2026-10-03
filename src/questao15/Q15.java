package questao15;

import java.util.HashMap;

public class Q15 {
    static void main() {

        HashMap<Integer, String> dias = new HashMap<>();

        dias.put(1, "Segunda-feira");
        dias.put(2, "Terça-feira");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta-feira");
        dias.put(5, "Sexta-feira");

        System.out.println("Antes: " + dias);

        dias.replace(3, "Quarta-feira");

        System.out.println("Depois: " +dias);

        dias.replace(6, "Sábado");

        System.out.println("A chave 6 passou a exisitir? :  " + dias.containsKey(6));
    }
}
