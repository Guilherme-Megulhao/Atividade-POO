public class Aluno {
    String nome;
    int matricula;
    double Av1;
    double Av2;

    public Aluno(String nome, int matricula, double Av1, double Av2) {
        this.nome = nome;
        this.matricula = matricula;
        this.Av1 = Av1;
        this.Av2 = Av2;
    }

    // Método para mostrar os dados do aluno
    public void Dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + Av1);
        System.out.println("Nota AV2: " + Av2);
        System.out.println("Média: " + Media());
    }

    // Método para calcular a média
    public double Media() {
        return (Av1 + Av2) / 2;
    }

    // Método para verificar se está aprovado (média >= 7.0)
    public void Aprovacao() {
        double media = Media();
        if (media >= 7.0) {
            System.out.println("Status: Aprovado ✅");
        } else {
            System.out.println("Status: Reprovado ❌");
        }
    }
}
