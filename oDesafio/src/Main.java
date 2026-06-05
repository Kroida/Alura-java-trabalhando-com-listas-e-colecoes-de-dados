import models.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        ArrayList<Compra> listaCompras = new ArrayList<>();
        ArrayList<Compra> comprasRealizadas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Compra pera = new Compra("Pera pra comer", 2.50);
        Compra banana = new Compra("Banana pra comer", 1.75);
        Compra palmatoria = new Compra("Palmatoria pra bater", 20);
        Compra telefone = new Compra("Telefone para telefonar", 599.99);

        listaCompras.add(pera);
        listaCompras.add(banana);
        listaCompras.add(palmatoria);
        listaCompras.add(telefone);

        System.out.println("Qual o seu limite do cartão?");
        double saldoDisponivel = scanner.nextDouble();

        boolean caso = true;
        boolean primeiraVez = true;
        while(caso && saldoDisponivel > 0) {
            int resposta = 1;

            if (!primeiraVez) {
                System.out.println("Saldo disponível: " + saldoDisponivel + "\n" + "Deseja continuar? Sim(1) Não(0)");
                resposta = scanner.nextInt();
            }

            switch (resposta) {
                case 0:
                    caso = false;
                    break;
                case 1:
                    primeiraVez = false;

                    for (int i = 0; i < listaCompras.size(); i++) {
                        System.out.println("Produto nmr " + (i + 1) + "\n" + listaCompras.get(i) + "\n");
                    }

                    System.out.println("Digite o número do item que deseja:");
                    int produtoDesejado = scanner.nextInt() - 1;

                    if (listaCompras.get(produtoDesejado).getValor() > saldoDisponivel) {
                        System.out.println(listaCompras.get(produtoDesejado).getValor());
                        System.out.println("Saldo indisponível!");
                        break;
                    } else {
                        if (saldoDisponivel - listaCompras.get(produtoDesejado).getValor() <= 0) {
                            System.out.println("Saldo indisponível!");
                            break;
                        } else {
                            saldoDisponivel -= listaCompras.get(produtoDesejado).getValor();
                        }
                        System.out.println("Produto comprado!");
                        comprasRealizadas.add(listaCompras.get(produtoDesejado));
                        listaCompras.remove(produtoDesejado);
                        break;
                    }
                default:
                    System.out.println("Comando inválido!");
            }
        }

        if (comprasRealizadas.size() > 0) {
            System.out.println("------ Compras realizadas ------");
            Collections.sort(listaCompras);
            for (Compra compra : comprasRealizadas) {
                System.out.println(compra + "\n");
            }
        }
    }
}
