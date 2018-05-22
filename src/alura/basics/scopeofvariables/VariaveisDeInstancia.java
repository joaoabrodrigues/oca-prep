package alura.basics.scopeofvariables;

public class VariaveisDeInstancia {

    String nome = "João"; // variável de instância / variável de objeto
    String nomeCompleto = nome + " Rodrigues";

    public VariaveisDeInstancia(){
        System.out.println(nome);
    }

    public void printNome(){
        System.out.println(nome);
    }

    public void printNomeCompleto(){
        System.out.println(nomeCompleto);
    }

    public static void main(String[] args) {
        VariaveisDeInstancia t = new VariaveisDeInstancia();
        t.printNome();
        t.printNomeCompleto();

        t.nome = "Baguncinha";
        System.out.println(t.nome);
    }
}
