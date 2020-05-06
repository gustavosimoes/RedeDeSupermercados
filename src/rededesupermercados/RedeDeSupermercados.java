package rededesupermercados;

public class RedeDeSupermercados {

    public static void main(String[] args) {

        Supermercado doisirmaos = new Supermercado();

        Frios queijo = new Frios();

        queijo.setTipo("Queijo");
        queijo.setCodigo("AABBCC");
        queijo.setGramas(0.250f);
        queijo.precoPorKg(4.65f);
        queijo.setValidade("14 de Maio");

        doisirmaos.addProduto(queijo);

        Carnes linguica = new Carnes();

        linguica.setTipo("Linguiça");
        linguica.setCodigo("1AB2C3");
        linguica.setNomeCarne(1);
        linguica.setGramas(0.990f);
        linguica.precoPorKg(12.00f);
        linguica.setValidade("15 de Abril");

        doisirmaos.addProduto(linguica);

        Frutas maca = new Frutas();

        maca.setNome("Maçã");
        maca.setCodigo("AFSGD");
        maca.setQuantidade(2);
        maca.setValidade("13 de Março");
        maca.precoPorUnidade(1.50f);

        doisirmaos.addProduto(maca);

        Doces arrozdoce = new Doces();

        arrozdoce.setTemChocolate(false);
        arrozdoce.setCodigo("SSSSS");
        arrozdoce.setCalorias(550);
        arrozdoce.setValidade("16 de Setembro");
        arrozdoce.precoPorUnidade(3.50f);

        doisirmaos.addProduto(arrozdoce);

        doisirmaos.verProdutos();

    }

}
