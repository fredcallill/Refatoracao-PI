package supermercado;

public class PedidoPrinter {

    public void imprimir(Pedido pedido, double total) {
        Cliente cliente = pedido.getCliente();

        System.out.println("Numero do pedido: " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + cliente.getNome()
                + " | CPF: " + cliente.getCpf()
                + " | Email: " + cliente.getEmail());
        System.out.println("Total do pedido: R$ " + total);
    }
}
