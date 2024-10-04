package Metodo_e_Classe;
//Classe caneta
public class Caneta {

    //Atributos
    public String modelo;
    public String cor;

    //'private' so pode ser mechido pela propria classe
    private float ponta;

    /*'protected' so pode ser mechido pela propria classe
    e pelas suas sub-classes(herança)
     */
    protected int carga;
    protected boolean tampada;

    //metodos
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println(" uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    protected void rabiscar(){
        if (this.tampada == true) {
            System.out.println("erro! não pode rabiscar");
        } else {
            System.out.println("estou rabiscando ");
        }
    }

    protected void tampar() {
        //'this' é o nome do objeto que chamou, ou seja, 'c1'
        // é usada para modificar o atributo dentra da classe
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
