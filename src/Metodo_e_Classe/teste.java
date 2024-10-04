package Metodo_e_Classe;

public class teste {
    public static void main(String[] args) {
        //Instanciar a classe
       Caneta c1 = new Caneta(); // 'c1' é Objeto
       c1.cor = "azul";
       c1.pontta = 0.5f;
       c1.destampar();

       c1.status();
       c1.rabiscar();
    }
}
