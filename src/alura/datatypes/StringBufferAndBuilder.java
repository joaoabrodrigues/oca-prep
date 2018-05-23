package alura.datatypes;
// StringBuffer => versão mais antiga e não sincroniza a referência entre threads
// StringBuilder => versão a partir do 1.5
public class StringBufferAndBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("Caelum");

        sb.append(" - ");
        sb.append("Ensino e Inovação");

        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder(50);//capacity inicial de 50
        System.out.println(sb2); // empty

        StringBuilder sb3 = new StringBuilder(sb);
        sb3.append(" e Alura e Casa do Código");
        sb3.append('x');
        sb3.append(sb);
        sb3.append(new Carro());

        System.out.println(sb3);

        System.out.println();

        StringBuilder sb4 = new StringBuilder("Caelum - Inovação");
        sb4.insert(9, "Ensino e ");
        System.out.println(sb4);

        System.out.println();

        sb4.delete(6, 15);
        System.out.println(sb4);

        System.out.println();

        System.out.println(new StringBuffer("João").reverse());

        System.out.println();

        StringBuilder sb5 = new StringBuilder("Caelum - Ensino e Inovação");
        sb5.substring(6, 15);
        sb5.subSequence(6, 15);
        System.out.println(sb5); // substring e subSequence não alteram StringBuilder

        System.out.println();

        StringBuilder sbb = new StringBuilder("teste ");

        // char[], CharSequence = valores a serem appendados
        sbb.append(new char[]{'a', 'b', 'c'}, 0, 3); // abc
        sbb.append(new char[]{'a', 'b', 'c'}, 0, 2); // ab
        sbb.append(new char[]{'a', 'b', 'c'}, 0, 1); // a
        // offset = primeira posição do array para dar append
        // len = tamanho do array que vai ser appendado
        sbb.append("abc", 0, 3); // abc
        sbb.append("abc", 0, 2); // ab
        sbb.append("abc", 0, 1); // a
        sbb.append("abc", 1, 3); // bc
        sbb.append("abc", 1, 2); // b
        sbb.append("abc", 1, 1); //
        sbb.append("abc", 2, 3); // c
        sbb.append("abc", 2, 2); //
        sbb.append("abc", 3, 3); //
        // start = primeira posição do CharSequence para dar append
        // end = tamanho do charsequence que vai ser appendado
        System.out.println(sbb);
    }
}
