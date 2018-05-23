package alura.datatypes;

class Motor {

}
class Carro {
    int ano;
    char primeiraLetra;
    boolean usado;
    Motor motor;
    String marca;
}

public class DataTypes {

    public static void main(String[] args) {
        // VARIÁVEL LOCAL NÃO TEM VALOR, OBRIGATORIAMENTE DEVE SER INICIALIZADA
        int idadee = 15;
        System.out.println(idadee);

        Carro carro = new Carro();
        // POR PADRÃO, VARIÁVEIS MEMBRO TEM VALOR PADRÃO
        // números: 0
        // char: 0
        // boolean: false
        // referência/objetos: null
        System.out.println(carro.ano); // 0
        System.out.println(carro.primeiraLetra); // 0
        System.out.println(carro.usado); // false
        System.out.println(carro.motor); // null
        System.out.println(carro.marca); // null

        int[] valores = new int[10]; // AO CRIAR UM NOVO ARRAY, TODOS OS VALORES DO ARRAY TERÃO O VALOR PADRÃO DOS TIPOS DE DADOS
        System.out.println(valores[0]);

        // byte
        // short
        // char
        // int
        // long

        // double  +/- infinito
        // float +/- 0
        // ^ NaN

        int x = 15; // => literal sempre será int
        double v = 10.2; // => literal sempre será double

        long l = 10L; // => convertendo literal
        float f = 12.3f; // => convertendo literal

        int octal = 0_7_6_1; // octal (0-8)
        int hexa = 0xa_5_9_D; // hex (0-9/A-F) => pode ter X maiúsculo
        int bin = 0b0_1110_1010; // binary => pode ter B maiúsculo

        //notação científica em double
        double d2 = 3.1e2; // 3.1 * 100 => pode ter E maiúsculo
        float f2 = 3.1e3F; // convert para float

        long l2 = 123_123_123____123_123_123L; // não pode ter _ no começo ou no final do número
        // long l3 12312313_L; não compila
        // long l4 _123123123L; não compila
        int i2 = 1__23__123__1_2__________________3;

        char a = 'A';
        char a2 = 65; // A
        char b = 66; // B
        char c = 67; // C
        char unicode = '\u03A9'; // ômega em unicode

        boolean bonitão123 = true;
        boolean $ricão3$  = false;
        boolean bonito_E_RicO = false;
        // camel case
        int idade;
        int Idade;
        int IDADE;

        /*
         não podemos utilizar como nomes de variáveis palavras chaves do java. ec:
         private
         public
         void
         try
         catch
         finally
         if
         do
         while
         for
         import
         implements
         null
         new
         static
         short
         char
         break
         ...
         tem 53
         */

    }
}
