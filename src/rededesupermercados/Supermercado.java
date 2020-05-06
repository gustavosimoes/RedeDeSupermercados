package rededesupermercados;

import java.util.ArrayList;

public class Supermercado {

    private ArrayList<Produto> prateleira;
    private String nomeMercado;

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public Supermercado() {
        this.prateleira = new ArrayList<>();
    }

    public void addProduto(Produto p) {
        this.prateleira.add(p);
    }

    public void verProdutos() {
        System.out.println("::::: Produtos :::::");
        for (int i = 0; i < prateleira.size(); i++) {
            System.out.println("----------------------------");
            this.prateleira.get(i).infoProduto();
            

        }
    }

}
