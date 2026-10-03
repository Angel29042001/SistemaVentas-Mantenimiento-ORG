package repository;


public interface IClienteRepository {
    void guardar(Object cliente); // O puedes usar tu entidad Cliente específica
    Object buscarPorId(Long id);
}
