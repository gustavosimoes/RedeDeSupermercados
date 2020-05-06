package rededesupermercados;

public class Frios extends Produto implements Pesagem {

    private String tipo;
    private float gramas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Peso: " + this.getGramas());
        System.out.println("Preço: " + this.getPreco());

    }

}
