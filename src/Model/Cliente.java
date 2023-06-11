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

    public Cliente(String cpf, String nome, String telefone, String dataDeNascimento, String sexo) {
        super(cpf, nome, telefone, dataDeNascimento, sexo);
    }

    public Cliente() {
    }
    

    

  

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    

    
    
    
    
}
