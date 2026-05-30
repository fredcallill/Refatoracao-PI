package supermercado;

public class CalculadoraDeCarrinho {

    public double calcularTotal(CarrinhoDeCompras carrinho) {
        return carrinho.getProdutos().stream()
                .mapToDouble(produto -> produto.getQuantidade() * produto.getPrecoUnitario())
                .sum();
    }
}
