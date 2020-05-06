package rededesupermercados;

public class Doces extends Produto implements Unidade {

    private boolean temChocolate;
    private double calorias;

    public boolean isTemChocolate() {
        return temChocolate;
    }

    public void setTemChocolate(boolean temChocolate) {
        this.temChocolate = temChocolate;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public void precoPorUnidade(float preco) {
        this.preco = preco;
    }

    @Override
    public void infoProduto() {
        System.out.println("Tem chocolate? " + this.isTemChocolate());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Preço: " + this.getPreco());
    }

}
