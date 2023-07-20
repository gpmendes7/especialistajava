import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;
import com.algaworks.crm.Filtro;

import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };

//        Filtro<Cliente> filtro = (Cliente cliente) -> {
//            boolean resultado = cliente.getIdade() > 40;
//            return resultado;
//        };

//        List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> {
//            boolean resultado = cliente.getIdade() > 40;
//            return resultado;
//        });

//        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        List<Cliente> clientes = cadastroCliente.getClientes();

//        clientes.sort(new Comparator<Cliente>() {
//            @Override
//            public int compare(Cliente o1, Cliente o2) {
//                return Integer.compare(o1.getIdade(), o2.getIdade());
//            }
//        });

        clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade()));

        for(Cliente cliente: clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }
}