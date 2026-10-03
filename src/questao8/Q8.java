package questao8;

import java.util.HashSet;
import java.util.Iterator;

public class Q8 {
    static void main() {
            HashSet<String> cidades = new HashSet<>();

            cidades.add("Recife");
            cidades.add("Natal");
            cidades.add("Salvador");
            cidades.add("Fortaleza");
            cidades.add("São Luís");


            for (String cidade : cidades) {
                System.out.println(cidade);
            }


            Iterator<String> cidadesIterator = cidades.iterator();

            while (cidadesIterator.hasNext()) {
                String cidade = cidadesIterator.next();

                if (cidade.startsWith("S")) {
                    cidadesIterator.remove();
                }
            }

            System.out.println("Restantes: " + cidades);
    }
}
