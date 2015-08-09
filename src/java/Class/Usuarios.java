/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * @author Detonador
 *
 *
 * classe no modelo de java Bean
 */
public class Usuarios {

    private int nivel;
    private String senha = null;
    private String login = null;
    private String nome;

    /* metodo booleano para verificação de usuario e senha ... naõ necessario em uma aplicação com conexão com banco  */
    public boolean vrificarUsuario() {
        if (this.login != null && this.senha != null) {
            if (this.login.equals("junior") && this.senha.equals("red")) {
                return true;
            }
        }
        return false;

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
