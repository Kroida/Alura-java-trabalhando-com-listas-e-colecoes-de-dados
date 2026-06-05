import animais.Animal;
import animais.Cachorro;
import banco.ContaBancaria;
import formas.Circulo;
import formas.Forma;
import formas.Quadrado;
import produtos.Produto;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        // 1
        String[] lista = {"Asi", "Mingau", "bob"};

        for (String sla : lista) {
            System.out.println(sla);
        }

        // 2, 3
        Cachorro cachorro = new Cachorro("berimbau");
        var casting = cachorro instanceof Animal
                ? (Animal) cachorro
                : null;
        System.out.println(casting.getNome());

        // 4
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto caneta = new Produto("Caneta", 1);
        Produto caderno = new Produto("Caderno", 35.99);
        Produto estojo = new Produto("Estojo", 12.45);
        listaProdutos.add(caderno);
        listaProdutos.add(caneta);
        listaProdutos.add(caneta);
        listaProdutos.add(estojo);

        for (Produto produto : listaProdutos) {
            double qtdProduto = listaProdutos.stream()
                    .filter(p -> p.getNome().equals(produto.getNome()))
                    .count();
            double precoMedio = produto.getPreco() / qtdProduto;
            System.out.println("Preço médio de " + produto.getNome() + ": " + precoMedio);
        }

        // 5
        ArrayList<Forma> listaFormas = new ArrayList<>();
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(8);
        listaFormas.add(quadrado);
        listaFormas.add(circulo);

        for (Forma forma : listaFormas) {
            forma.calcularArea();
        }

        // 6
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        ContaBancaria pedro = new ContaBancaria(9952, 50);
        ContaBancaria marcia = new ContaBancaria(101, 200.50);
        ContaBancaria anabelle = new ContaBancaria(171, 12.50);
        listaContas.add(pedro);
        listaContas.add(marcia);
        listaContas.add(anabelle);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
