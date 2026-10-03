package questao11;

import java.util.HashMap;

public class Q11 {
    static void main() {
        HashMap<String, Integer> pessoas = new HashMap<>();

         pessoas.put("João",30);
         pessoas.put("Maria",25);
         pessoas.put("Pedro",41);


        pessoas.entrySet().forEach(c ->{
            System.out.println( c.getKey() + " tem  " + c.getValue() + " anos ");
        });
    }
}
