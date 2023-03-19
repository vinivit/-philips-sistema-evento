package usuario;

import evento.Evento;

public class Inscricao implements Validacao {

    Usuario usuario;
    Evento evento;
    String matricula;

    public Inscricao(String matricula,Evento evento){
        if(autentica(matricula)){
            this.matricula = matricula;
            this.evento = evento;
        }
    }

    public boolean autentica(String matricula){

        for (String teste:usuario.matriculas)
            if(teste==matricula)
                return true;

        return false;
    }

    @Override
    public String toString(){
        if(this.matricula != null)
            return "o usuário da matricula "+ matricula +" se inscreveu no evento";
        else
            return "Usuario nao escrito no evento";
    }
}
