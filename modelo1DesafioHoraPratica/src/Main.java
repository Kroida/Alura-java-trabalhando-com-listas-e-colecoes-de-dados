import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        var pessoa1 = new Pessoa("Luís", 20);
        var pessoa2 = new Pessoa("Isabely", 13);
        var pessoa3 = new Pessoa("Laura", 6);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println(listaPessoas.size());
        System.out.println(listaPessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}
