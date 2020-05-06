package rededesupermercados;

public abstract class Produto {

    protected float preco;
    protected String codigo;
    protected String validade;

    public float getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public abstract void infoProduto();

}
