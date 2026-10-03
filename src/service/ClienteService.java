package service;

import repository.IClienteRepository;

public class ClienteService {
    
    // Declaración de la dependencia como una abstracción (Interfaz)
    private final IClienteRepository clienteRepository;

    // Inyección de dependencias por constructor
    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void registrarCliente(Object cliente) {
        // Lógica de negocio
        clienteRepository.guardar(cliente);
    }
}