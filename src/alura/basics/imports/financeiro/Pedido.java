package alura.basics.imports.financeiro;

//import alura.basics.imports.Pessoa;

// não é possível importar classes do pacote padrão
import alura.basics.imports.*; // wildcard => importa tudo o que está em um determinado pacote
import static alura.basics.imports.util.Util.*; // => importa tudo que tem na classe util, tornando os dois imports abaixo inúteis
// import static alura.basics.imports.util.Util.TAMANHO; // import static que importa a referência da variável
// import static alura.basics.imports.util.Util.maior; // import static que importa somente o método

import java.util.*; // => não importa subpacotes, importa classes, interfaces e tipos
import java.sql.Date; // o import especifico é o usado, caso tenha o import de wildcard

// no caso de dois wildcards o java também se perde na declaração da classe
// import java.util.*;
// import java.sql.*;

// import java.util.Date;
// import java.sql.Date; => não é possível importar duas classes de diferentes pacotes com o mesmo nome

public class Pedido {
    // alura.basics.imports.Pessoa cliente; => fully qualified name (pacote.classe)
    //alura.basics.imports.Endereco endereco;
    Endereco endereco;
    Pessoa cliente;
    Date dataDeCriacao; //sql
    java.util.Date dataAcesso; //java.util

    public void calculaTudo() {
        int t = TAMANHO;
        maior(3, 10);
    }
}
