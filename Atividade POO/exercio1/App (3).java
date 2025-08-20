public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Harry Potter e a pedra filosofal", "J.K. Rowling", 54.90);
        Livro livro2 = new Livro("O pequeno Príncipe", "Antoine de Saint-Exupéry", 39.90);


        livro2.setTitulo("A arte da Guerra");
        livro2.setAutor("Sun Tzu");
        livro2.setPreco(60.50);

        System.out.println("Informações do Livro 1:");
        livro1.Informacoes();

        System.out.println("\nInformações do Livro 2:");
        livro2.Informacoes();
    }
}
