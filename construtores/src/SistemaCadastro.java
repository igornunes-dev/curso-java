public class SistemaCadastro {
    public static void main(String[] args){
        //criamos um objeto no sistema
        Pessoa pessoa = new Pessoa("123", "Igor");

        //definimos o endereço da pessoa
        pessoa.setEndereco("Rua das marias");

        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf() );
    }
}
