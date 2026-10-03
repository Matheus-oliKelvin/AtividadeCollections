package questao12;

import java.util.HashMap;

public class Q12 {
    static void main() {

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Carlos", 40);


        int idadeJoao = pessoas.get("João");
        System.out.println("João tem " + idadeJoao + " anos");

        if (pessoas.containsKey("Ana")) {
            System.out.println("Ana tem " + pessoas.get("Ana") + " anos");
        } else {
            System.out.println("Ana não está cadastrada");
        }
    }
}
