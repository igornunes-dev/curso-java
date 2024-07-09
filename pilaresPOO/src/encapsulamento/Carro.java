package encapsulamento;

import heranca.Veiculo;

public class Carro  extends Veiculo {

    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("encapsulamento.Carro ligado");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("Conferindo cambio P");
    }
}
