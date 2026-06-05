import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        // 1
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 10; i > 0; i--) {
            lista.add(i);
        }

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        // 2, 3
        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        Titulo titulo1 = new Titulo("Peaky blinders");
        Titulo titulo2 = new Titulo("Eu quero minha irmã de volta");
        Titulo titulo3 = new Titulo("Solitude");
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        listaTitulo.add(titulo3);
        System.out.println(listaTitulo);
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);

        // 4
        List<Integer> listaList = new ArrayList<>();
        List<Integer> listaLinked = new LinkedList<>();

        for (int i = 10; i > 0; i--) {
            listaList.add(i);
            listaLinked.add(i);
        }
        System.out.println(listaList);
        System.out.println(listaLinked);

        // 5
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemente a");
        listaPolimorfica.add("Elemente b");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento a");
        listaPolimorfica.add("Elemento b");
        System.out.println(listaPolimorfica);
    }
}
