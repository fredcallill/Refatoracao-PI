package supermercado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testCriacaoCliente() {
        
        String nome = "João Silva";
        String cpf = "123.456.789-00";
        String email = "joao.silva@email.com";

        
        Cliente cliente = new Cliente(nome, cpf, email);

        assertEquals(nome, cliente.getNome(), "O nome deve ser igual ao informado");
        assertEquals(cpf, cliente.getCpf(), "O CPF deve ser igual ao informado");
        assertEquals(email, cliente.getEmail(), "O email deve ser igual ao informado");
    }
}
