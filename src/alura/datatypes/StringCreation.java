package alura.datatypes;

public class StringCreation {
    public static void main(String[] args) {
        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'J', 'a', 'v', 'a'};
        String nome1 = new String(nome);

        StringBuilder sb = new StringBuilder("Java");
        String sb1 = new String(sb);

        String nomeNull = null;
        // nomeNull.length(); NPE

        String nomeDaProva = "Certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNull; // nomeNull = null

        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo); // quando concatenar uma variável null, printa "null"

        System.out.println();

        System.out.println("Certificação " + 1500);
        System.out.println(1500 + " Certificação"); // 1500 Certificação
        System.out.println(15 + 00 + " Certificação"); // 15 Certificação
        System.out.println(15 + (0 + (0 + " Certificação"))); // 1500 Certificação
        System.out.println(1 + 500 + " Certificação"); // 501 Certificação
        System.out.println(1 + (500 + " Certificação")); // 1500 Certificação

        System.out.println();

        String s = "caelum";
        s.toUpperCase(); // cria um novo objeto e retorna a referência para esse novo objeto criado
        System.out.println(s); // string é imutável

        s = s.toUpperCase(); // atribui a nova referência
        System.out.println(s); // mostra a string alterada

        System.out.println(s.charAt(0)); // pega o primeiro char da string
        System.out.println(s.charAt(3)); // pega o quarto char da string
        // System.out.println(s.charAt(-1)); // StringIndexOutOfBounds
        // System.out.println(s.charAt(10000)); // StringIndexOutOfBounds
        System.out.println(s.length()); // tamanho da string
        System.out.println(s.isEmpty()); // retorna se a string tá vazia ou não
        System.out.println("".isEmpty()); // true
        System.out.println("   ".isEmpty()); // false
        System.out.println("  ".trim().isEmpty()); // true

        System.out.println("          joao       ");
        System.out.println("          joao ".trim());

        System.out.println(s.replace('A', 'E'));
        System.out.println(s.replace("CAE", "ALU"));

        System.out.println(s.substring(1, 3)); // NÃO INCLUI A POSIÇÃO FINAL

        System.out.println("Java".equalsIgnoreCase("java")); // true
        System.out.println("Java".equals("java"));// false

        System.out.println("Certificação".compareTo("Arnaldo"));
        System.out.println("Arnaldo".compareTo("Certificação"));
        System.out.println("Jorge".compareTo("jorge"));
        System.out.println("Jorge".compareToIgnoreCase("Jorge"));

        System.out.println();

        String text = "Eu vou fazer a prova de certificação Java";
        System.out.println(text.indexOf("Eu")); // posição 0
        System.out.println(text.indexOf("a")); // posição 8
        System.out.println(text.indexOf("a", 9)); // posição 13
        System.out.println(text.lastIndexOf("a")); // posição 40
        System.out.println(text.indexOf("Ue")); // posição -1
        System.out.println(text.startsWith("Você"));
        System.out.println(text.startsWith("Eu"));
        System.out.println(text.endsWith("Java"));
        System.out.println(text.endsWith("C#"));
    }
}
