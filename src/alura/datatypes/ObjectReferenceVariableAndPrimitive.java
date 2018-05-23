package alura.datatypes;

class MeuObjeto {
    int valor;
}

public class ObjectReferenceVariableAndPrimitive {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // colocando o VALOR de a

        a = a + 20; // NÃO altera o valor de b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        MeuObjeto o1 = new MeuObjeto();
        o1.valor = 10;
        MeuObjeto o2 = o1; // cria uma nova referência para o mesmo objeto

        o1.valor = o1.valor + 15; // altera as duas variáveis (que apontam para o mesmo objeto)

        System.out.println("o1 = " + o1.valor);
        System.out.println("o2 = " + o2.valor);
    }
}
