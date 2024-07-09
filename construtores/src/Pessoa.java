public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Metodo Construtor
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String newEndereco){
        this.endereco = newEndereco;
    }
}
