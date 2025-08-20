public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("Heloísa", 20, "Feminino");
        Pessoa pessoa2 = new Pessoa("Guilherme", 18, "Masculino");

        
        pessoa1.Informacoes();
        pessoa1.lerLivro("Dom Casmurro");

        System.out.println();

        pessoa2.Informacoes();
        pessoa2.lerLivro("O Senhor dos Anéis");
    }
    
}
