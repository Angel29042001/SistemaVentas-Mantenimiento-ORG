package repository;

public class ClienteRepository implements IClienteRepository {
    
    @Override
    public void guardar(Object cliente) {
        // Lógica para guardar el cliente en la base de datos
        System.out.println("Guardando cliente en la base de datos...");
    }

    @Override
    public Object buscarPorId(Long id) {
        // Lógica para buscar el cliente por ID
        return null;
    }
}