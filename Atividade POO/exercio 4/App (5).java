public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta1 = new ContaBancaria("Guilherme", "77777-7");
        ContaBancaria conta2 = new ContaBancaria("Caliel", "64829-9");

        System.out.println("Conta 1:");
        conta1.deposito(10000);
        conta1.sacar(500);
        conta1.Saldovalor();

        System.out.println();

        System.out.println("Conta 2:");
        conta2.deposito(500);
        conta2.sacar(600);
        conta2.Saldovalor();








    }
}
