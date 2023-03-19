import usuario.Usuario;
import campi.Campi;
import endereco.Endereco;
import evento.Evento;
import usuario.Inscricao;
public class Main {
    public static void main(String[] args) {

        Usuario usuario1;
        usuario1 = new Usuario("123","abcd=1234","Vinicius","vinicius@email.com","13 1234 5678");
        System.out.println(usuario1);

        Campi campi1 = new Campi("Campi",new Endereco("Um", "222","Jardim","Itanhaém","São Paulo","Brasil"));
        System.out.println(campi1);

        Evento evento1 = new Evento("Java ","26/02/2023 ","10:50 ","26/02/2023 ",new Endereco("Um", "222","Jardim","Itanhaém","São Paulo","Brasil "),"Professores ","testando ");
        System.out.println(evento1);

        Evento evento2 = new Evento("Python ","26/02/2023 ","10:50 ","26/02/2023 ",campi1.getEndereco(),"Professores ","testando ");
        System.out.println(evento2);


        Inscricao inscricao1 = new Inscricao("1235",evento1);
        System.out.println(inscricao1);
    }
}