package arquivo_3;

public class Lista {
    private String nome;
    private int idade;
    Lista(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    Lista(){
        this.nome = "";
        this.idade = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
 
    }
    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade;
    }
    
}
