package alura.datatypes;

class Carros{
    Carro2 c1;
    Carro2 c2;
}

// CRIADO: construtor
// ACESSÍVEL: enquanto é referenciado direta ou indiretamente
// INACESSÍVEL: sem referências diretas ou indiretas
// GC - GARBAGE COLLECTOR: PODE eliminar os objetos a partir do momento em que eles se tornam inacessíveis
// NÃO TEM COMO SABER QUANDO O GC VAI RODAR
// -------------
// quantos objetos foram garbage coletados?
// não é possível dizer
public class ObjectLifecycle {

    public static void main(String... argumentos){
        Carros carros = new Carros(); // referência indireta

        Carro2 c; // nada é criado
        c = new Carro2(); // um objeto é criado e uma referência para o objeto é colocado na variável
        new Carro2(); // outro objeto é criado na memória
        carros.c1 = c;
        // enquanto a variável referencia o objeto, ele está acessível
        c.ano = 2014;
        c.modelo = "Ferrari";

        // a referência para o objeto acima é perdida e fica inacessível
        c = new Carro2();
        carros.c2 = c; // torna a referência de c indireta

        // elimina a referência e torna todos os objetos criados inacessíveis diretamente
        // o gc não pode eliminar o objeto pois a variável carros contém uma referência
        // indireta para o objeto criado anteriormente em c
        c = null;

        if (15 > 10) {
            Carro2 c2 = new Carro2();
            c2.ano = 2010;
        }
        // todas as três referencias se tornam inacessíveis

        Carro2 c3;
        for(int i=0;i<10;i++){
            c3 = new Carro2();
        }
        // c3 referencia o último carro criado dentro do for
    }
}
