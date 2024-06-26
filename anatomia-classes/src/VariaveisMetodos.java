public class VariaveisMetodos {
    public static void main(String[] args) {

        final String nome = "Igor";

        int idade = 18;

        String primeiroNome = "Igor";
        String segundoNome = "Nunes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Seu nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
