package Metodo_e_Classe;
//Classe caneta
public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float pontta;
    int carga;
    boolean tampada;

    //metodos
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println(" uma caneta " + this.cor);
        System.out.println("ponta: " + this.pontta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("erro! não pode rabiscar");
        } else {
            System.out.println("estou rabiscando");
        }
    }

    void tampar() {
        //'this' é o nome do objeto que chamou, ou seja, 'c1'
        // é usada para modificar o atributo dentra da classe
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
