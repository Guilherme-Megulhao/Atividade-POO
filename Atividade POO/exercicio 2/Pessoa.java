public class Pessoa {

    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void Informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }

    public void lerLivro(String titulo) {
        System.out.println(nome + " está lendo o livro: " + titulo);
    }
}
