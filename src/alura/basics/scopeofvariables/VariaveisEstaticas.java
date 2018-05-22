package alura.basics.scopeofvariables;

class Pessoa {
    static int id = 1;
    // int id; -> não pode usar o mesmo nome para variáveis no mesmo escopo, independentemente dde serem estáticas ou não
    static void metodo() {
        int id = 30; // -> é póssível ter variáveis com o mesmo nome mas em escopos diferentes
        System.out.println(id);
    }
}

public class VariaveisEstaticas {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id);
        System.out.println(Pessoa.id);

        Pessoa.metodo();
    }
}
