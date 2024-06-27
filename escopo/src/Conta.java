public class Conta {
    //Variavel da classe conta
    double saldo=10.0;

    public void sacar(double valor){
        //Variavel local do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //Disponível em toda classe
        System.out.println(saldo);
        //Somente o método sacar conhece esta variavel
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //Variaveis locais do método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1; x<=5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //x e ValorCalculado não estarão disponiveis aqui
        return valorMontante;
    }
}
