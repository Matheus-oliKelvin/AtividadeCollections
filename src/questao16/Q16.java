package questao16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Q16 {
    static void main() {

        List<String> nomes = Arrays.asList("Ana", "Bruno", "Ana", "Carla", "Bruno", "Diego");
        List<String> semRepetidos = new ArrayList<>(new LinkedHashSet<>(nomes));

        System.out.println(semRepetidos);



    }
}
