package questao1;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    static void main() {
         List <Integer> listaNumeros= new ArrayList<>();

         listaNumeros.add(10);
         listaNumeros.add(20);
         listaNumeros.add(30);
         listaNumeros.add(40);
         listaNumeros.add(50);

         for (int cont = 0; cont < listaNumeros.size(); cont++){
             System.out.println(listaNumeros.get(cont));
         }

        System.out.println("----------------------------------------");

         for ( Integer numero : listaNumeros){
             System.out.println(numero);
         }


    }
}
