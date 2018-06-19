public class ChatClient {
    public static void main(String[] args) {
        ChatMediador mediador = new ChatMediadorImpl();
        Usuario user1 = new UsuarioImpl(mediador, "Amanda");
        Usuario user2 = new UsuarioImpl(mediador, "Deilson");
        Usuario user3 = new UsuarioImpl(mediador, "Junior");
        Usuario user4 = new UsuarioImpl(mediador, "Walmick");
        Usuario user5 = new UsuarioImpl(mediador, "Arnaldo");
        mediador.addUsuario(user1);
        mediador.addUsuario(user2);
        mediador.addUsuario(user3);
        mediador.addUsuario(user4);
        mediador.addUsuario(user5);

        user1.enviar("Oi, pessoas!");
    }
}
