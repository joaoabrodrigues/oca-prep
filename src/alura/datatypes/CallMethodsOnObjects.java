package alura.datatypes;

class Pessoa {
    String nome;
    int idade;
    public String getNome(){
        return nome;
    }
    public void setDados(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

class Calculadora {
    public int some(int... numeros){//varargs precisa ser o último e único na declaração dos argumentos
        int soma = 0;
        for(int n : numeros) {
            soma += n;
        }
        return soma;
    }
}

public class CallMethodsOnObjects {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setDados("João", 24); // é obrigatório enviar todos os parâmetros

        String nome = p.getNome(); // não é necessário usar o retorno

        System.out.println(nome);
        System.out.println(p.getNome());

        System.out.println();

        calcula();
    }

    private static void calcula(){
        Calculadora c = new Calculadora();
        System.out.println(c.some(5));
        System.out.println(c.some(5,23,5));
        System.out.println(c.some(5,4,1,2,3,4,6));
        System.out.println(c.some(5,4,1,24,12,42,41,14));
        System.out.println(c.some(1,1,23,1,3,13,13,1,3));
        System.out.println(c.some());

    }
}
