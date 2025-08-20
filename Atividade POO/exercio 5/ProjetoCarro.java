public class ProjetoCarro {
    private String marca;
    private String modelo;
    private int ano;

    public ProjetoCarro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Informacoes() {
        System.out.println("Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado!");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
