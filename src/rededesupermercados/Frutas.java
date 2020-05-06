package rededesupermercados;

public class Frutas extends Produto implements Pesagem,Unidade{

    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void precoPorKg(float preco) {
        this.preco = preco;
    }
    
    @Override
    public void precoPorUnidade(float preco) {
        this.preco = preco;
    }


    @Override
    public void infoProduto() {

        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Validade: " + this.getValidade());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Preço: " + this.getPreco());

    }

}
