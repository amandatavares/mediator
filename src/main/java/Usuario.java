public abstract class Usuario {
    /*
    * Usuários podem enviar e receber mensagens, então podemos criar uma interface ou classe abstrata de Usuários. Vamos criar uma classe abstrata.
    */
    protected ChatMediador mediador;
    protected String nome;

    public Usuario(ChatMediador mediador, String nome) {
        /*Usuario tem uma referência para o mediator; isso é necessário para os usuários diferentes se comunicarem */
        this.mediador = mediador;
        this.nome = nome;
    }
    public abstract void enviar(String msg);
    public abstract void receber(String msg);
}
