package supermercado;

public class Supermercado {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto("Arroz", 1, 3.99);
        carrinho.adicionarProduto("Filé de frango sassami", 2, 21.99);

        Cliente cliente = new Cliente("Joao Silva", "123.456.789-00", "joao@email.com");
        Pedido pedido = new Pedido(1, carrinho, cliente);

        CalculadoraDeCarrinho calculadora = new CalculadoraDeCarrinho();
        double total = calculadora.calcularTotal(carrinho);

        PedidoPrinter printer = new PedidoPrinter();
        printer.imprimir(pedido, total);
    }
}
