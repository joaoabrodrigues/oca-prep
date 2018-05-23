package alura.datatypes;

class Carro2 {
    String modelo;
    int ano;

    Carro2(){
        ano = 2014;
    }

    void reseta(){
        this.ano = 2014; // this opcional
    }

    public String getDadosDeImpressao(){
        return modelo + "::" + ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

public class ObjectFields {

    public static void main(String args[]) {
        Carro2 a = new Carro2();
        a.modelo = "Palio";
        a.setModelo("Uno");
        a.ano = 1990;
        System.out.println(a.getDadosDeImpressao());
        System.out.println(a.ano);
        System.out.println(a.modelo.length());
    }
}
