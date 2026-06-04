import models.Produto;
import models.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Produto maca = new Produto("Maçã", 2.50, 12);
        Produto pera = new Produto("Pera", 3, 20);
        Produto melancia = new Produto("Melancia", 30, 10);

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(maca);
        listaProduto.add(melancia);
        System.out.println("A lista possui " + listaProduto.size() + " produtos");
        System.out.println(listaProduto.get(0));

        ProdutoPerecivel uva = new ProdutoPerecivel("Uva", 15, 51, "23/06/2026");
        System.out.println(uva);
    }
}
