public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caliel",0474656 , 10.0, 8.5);
        Aluno aluno2 = new Aluno("Guilherme", 0417777, 6.0, 7.5);

        aluno2.Av2 = 7.0;

        System.out.println("=== Dados do Aluno 1 ===");
        aluno1.Dados();
        aluno1.Aprovacao();

        System.out.println("\n=== Dados do Aluno 2 ===");
        aluno2.Dados();
        aluno2.Aprovacao();
    }
}
