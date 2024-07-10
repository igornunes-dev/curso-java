package iphones;

public class Iphone{

    public void ligar(){
        conferirBateria();
        System.out.println("Ligado");
    }
    public void conferirBateria(){
        System.out.println("Conferindo Bateria");
    }
    public void desligar(){
        System.out.println("Desligado");
    }

    private String musica;

    public void setReproduzirMusical(String musica){
        this.musica = musica;
        System.out.println("Musica Adicionada");
    }

    public void ReproduzirMusica() {
        System.out.println( "Musica que esta tocando é " + musica);
    }

    public void VerificarInternet(){
        System.out.println("Internet Verificada");
    }

    public void VerificarCreditos(){
        System.out.println("Creditos Verificados");
    }

    public void NavegarInternet(){
        VerificarInternet();
        System.out.println("Navegando na internet");
    }

    public void FazerChamada(){
        VerificarCreditos();
        System.out.println("Fazendo Ligação");
    }





}
