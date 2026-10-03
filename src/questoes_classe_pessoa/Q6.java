package questoes_classe_pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q6 {
    static void main() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana", 28,"111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19,"222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35,"333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22,"444.444.444-44"));

        System.out.println("por idade: ");

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        for (Pessoa p : pessoas){
            System.out.println(p);
        }


        System.out.print("por nome: ");

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for (Pessoa p : pessoas){
            System.out.print(p.getNome() + ", ");
        }


    }
}
