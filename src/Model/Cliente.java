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
public class Cliente extends Pessoa{
    
    private boolean hospedado = false;
    private int id;
   

    

    public Cliente(String cpf, String nome, String telefone, String dataDeNascimento, String sexo, String observacao) {
        super(cpf, nome, telefone, dataDeNascimento, sexo, observacao);
    }

    public Cliente() {
    }


    

  

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    



    
    
    
    
}
