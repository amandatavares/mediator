public class UsuarioImpl extends Usuario{

    public UsuarioImpl(ChatMediador mediador, String nome){
        super(mediador, nome);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(this.nome + ": Enviando mensagem = " + msg);
        mediador.enviarMsg(msg, this);
    }
    @Override
    public void receber(String msg){
        System.out.println(this.nome + ": Mensagem recebida = " + msg);
    }
}
