package usuario;

import java.util.ArrayList;

public class Usuario {

    //private static String[] matriculas = new String[];
    protected static ArrayList<String> matriculas = new ArrayList<String>();
    private static int cont = 0;
    private String matricula;
    private String senha;
    private String nome;
    private String email;
    private String telefone;

    // Contrutor

    public Usuario(String matricula, String senha, String nome, String email, String telefone) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        matriculas.add(matricula);
        cont++;

    }



   // public static String[] getMatriculas(){
   //     return matriculas;
  //  }

    //Get's e Set's 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString (){
        return "mátricula: "+matricula+" - nome:"+nome;
    };
}
