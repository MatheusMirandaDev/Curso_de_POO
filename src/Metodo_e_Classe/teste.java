package Metodo_e_Classe;

public class teste {
    public static void main(String[] args) {
        //Instanciar a classe
       Caneta c1 = new Caneta(); // 'c1' é Objeto

        c1.modelo = "bic cristal";
        c1.cor = "azul";
        c1.ponta = 0.5; // vai dar erro pois ponta so pode ser alterado na classe caneta
        c1.carga = 80;
        c1.tampada = false;

        c1.status();
        c1.rabiscar();
    }
}
