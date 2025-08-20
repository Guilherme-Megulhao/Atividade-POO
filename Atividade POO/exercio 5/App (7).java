public class App {
    public static void main(String[] args) throws Exception {
        ProjetoCarro carro1 = new ProjetoCarro("Toyota", "Corolla", 2020);
        ProjetoCarro carro2 = new ProjetoCarro("Honda", "Civic", 2022);


        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setAno(2023);

        System.out.println("Informações do Carro 1:");
        carro1.Informacoes();
        carro1.ligar();

        System.out.println();

        System.out.println("Informações do Carro 2:");
        carro2.Informacoes();
        carro2.ligar();
    }
}
