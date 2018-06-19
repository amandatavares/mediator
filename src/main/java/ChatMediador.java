public interface ChatMediador {
    /*Primeiro, criamos uma interface mediadora ChatMediator que irá definir o "contrato" para mediadores concretos.*/
    void enviarMsg(String msg, Usuario usuario);
    void addUsuario(Usuario usuario);
}
