package alura.basics.scopeofvariables;

public class VariaveisLocais {

    String nome = "VARIÁVEL DE INSTÂNCIA";

    public static void m1() {
        int x = 10;
        // int x = 20; -> variável local não pode ter o mesmo nome de uma outra variável local

        if (x >= 10) { // inicio do bloco
            int y = 50;
            System.out.println(y);
        }// fim do bloco

        // System.out.println(y); -> o y não existe aqui
        System.out.println(x);
    }

    public static void m2() {
        for(int i = 0, j = 0; i <= 10; i++) j++; // o escopo do for, nesse caso, acaba aqui

        // System.out.println(i); -> fora do escopo, não compila
        // System.out.println(j); -> fora do escopo, não compila
    }

    public static void m3(String nome) { // a variável só existe no bloco dentro do método m3
        System.out.println(nome);
    }

    public VariaveisLocais(String nome) {
        System.out.println(nome);
    }

    public static void main(String[] args){
        // String[] args = null; -> args também é uma variável local, não posso usar o mesmo nome
        m1();
        m2();
        m3("João");
    }
}

class B {
    int B;
    B() { } // construtor não tem declaração de retorno e deve ser o mesmo nome da classe
    void B(){} // método tem declaração de retorno
}
