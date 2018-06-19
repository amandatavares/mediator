import java.util.ArrayList;
import java.util.List;

public class ChatMediadorImpl implements ChatMediador {
    /*A implementação real e oficial do Mediator. Teremos uma lista de usuários no grupo e faremos uma lógica para a comunicação dos usuários.*/
    private List<Usuario> usuarios;

    public ChatMediadorImpl(){
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMsg(String msg, Usuario usuario) {
        for (Usuario u : this.usuarios) {
            //mensagens não podem ser recebidas pelos usuarios que estão mandando elas!
            if (u != usuario) {
                u.receber(msg);
            }
        }
    }

}
