package rededesupermercados;

public class Carnes extends Produto implements Pesagem {

    private String Tipo;
    private int nomeCarne;
    private float gramas;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNomeCarne() {
        return nomeCarne;
    }

    public void setNomeCarne(int nomeCarne) {
        this.nomeCarne = nomeCarne;
    }

    public float getGramas() {
        return gramas;
    }

    public void setGramas(float gramas) {
        this.gramas = gramas;
    }

    @Override
    public void precoPorKg(float preco) {
        this.preco = preco;
    }

    @Override
    public void infoProduto() {
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome da Carne: " + getNomeCarne() + "º");
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Peso: " + this.getGramas());
        System.out.println("Preço: " + this.getPreco());
    }

}
