package logicos;

public class OperadorLogico {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (6 > 5)){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras");
        }

        System.out.println("fim");

    }
}
