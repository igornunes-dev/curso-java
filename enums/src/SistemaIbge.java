public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiros e: EstadoBrasileiros.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiros eb = EstadoBrasileiros.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
