package questoes_classe_pessoa;

import java.util.HashMap;
import java.util.Map;

public class Q14 {
    static void main() {

        HashMap < String, Pessoa> pessoas = new HashMap<>();

        pessoas.put("111.111.111-11", new Pessoa("Ana", 28,"111.111.111-11"));
        pessoas.put("222.222.222-22", new Pessoa("Bruno", 19,"222.222.222-22"));
        pessoas.put("333.333.333-33",new Pessoa("Carla", 35,"333.333.333-33"));

        Pessoa pessoa = pessoas.get("222.222.222-22");

        for (Map.Entry<String, Pessoa> p : pessoas.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }
        System.out.println("----------------------------------------");

        System.out.println("Busca: " + pessoa);

        System.out.println("----------------------------------------");

        Pessoa novaPessoa = pessoas.put("222.222.222-22", new Pessoa("Bruna", 20,"222.222.222-22"));

        System.out.println("Put retornou: " + novaPessoa);

        System.out.println("----------------------------------------");

        int quantidadePessoas = pessoas.size();

        System.out.println("Tamanho do Map: " + quantidadePessoas);

        for (Map.Entry<String, Pessoa> p : pessoas.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }
    }
}
