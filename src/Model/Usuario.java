/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author muril
 */
public class Usuario extends Pessoa {
     private String login;
     private String senha;

    public Usuario(String login, String senha, String cpf, String nome, String telefone, String dataDeNascimento, String sexo) {
        super(cpf, nome, telefone, dataDeNascimento, sexo);
        this.login = login;
        this.senha = senha;
    }

    

    public String getNomeUsuario() {
        return login;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.login = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
     
}
