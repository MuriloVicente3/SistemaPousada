/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author muril
 */
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private Date dataDeNascimento;
    private String sexo;
    private String observacao;

    public Pessoa(String cpf, String nome, String telefone, String dataDeNascimento, String sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        try {
            this.dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeNascimento);
        } catch (ParseException e) {
            // Lidar com a exceção aqui
            e.printStackTrace(); // Imprime o rastreamento da exceção no console
            // Ou realizar outras ações, como exibir uma mensagem de erro para o usuário
        }
        this.sexo = sexo;
        
    }

    public Pessoa() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    

    
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
}
