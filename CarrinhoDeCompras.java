package supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double precoUnitario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva");
        }
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço unitário deve ser positivo");
        }
        produtos.add(new Produto(nome, quantidade, precoUnitario));
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}

