// primeiro item -> pacote (opcional)
package alura.basics.javaclassstructure;
// caso não exista a especificação do pacote, a classe estará no pacote raíz

// segundo item -> imports (opcionais)
import java.util.Date;
import java.io.*;

// terceiro item -> classes e interfaces (opcional)
interface Figura {
    // por padrão, métodos e variáveis são publicas e estáticas
    final int TAMANHO = 5;
    void autentica(String nome, String senha);
}

/**
 * Isso é um javadoc
 */
public class Pessoa {

    static int totalDePessoa = 0;
    String nome;
    Pessoa(String nome) {
        if (nome == null) {
            nome = "João";
            return; // métodos construtores não retornam valores
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    /*
     isso é um comentário com mais de uma linha
     */
}
