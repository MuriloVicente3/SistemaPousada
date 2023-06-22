/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Model.Cliente;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author muril
 */
public class JDBCCliente {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();
    
    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (cpf, nome, telefone, dataDeNascimento, sexo, observacao) VALUES (?,?,?,?,?,?)";
        conn = new Conexao().conexaoBD();
        
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, cliente.getCpf());
                pstm.setString(2, cliente.getNome());
                pstm.setString(3, cliente.getTelefone());
                pstm.setString(4, cliente.getDataDeNascimento());
                pstm.setString(5, cliente.getSexo());
                pstm.setString(6, cliente.getObservacao());
                
                pstm.execute();
                pstm.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "JDBCCliente Cadastrar" + e);
            }
    }
    
    public ArrayList <Cliente> PesquisarCliente(){
        String sql = "SELECT * FROM cliente";
        conn = new Conexao().conexaoBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDataDeNascimento(rs.getString("dataDeNascimento"));
                cliente.setSexo((String) rs.getObject("sexo"));
                cliente.setObservacao(rs.getString("observacao"));
                cliente.setHospedado(rs.getBoolean("hospedado"));
                
                lista.add(cliente);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JDBCCliente pesquisar: " + erro);
        }
        return lista;
}
    public void alterarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET cpf = ?, nome = ?, telefone = ?, dataDeNascimento = ?, sexo = ?, observacao=? WHERE id = ?";
        conn = new Conexao().conexaoBD();
        
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, cliente.getCpf());
                pstm.setString(2, cliente.getNome());
                pstm.setString(3, cliente.getTelefone());
                pstm.setString(4, cliente.getDataDeNascimento());
                pstm.setString(5, cliente.getSexo());
                pstm.setString(6, cliente.getObservacao());
                pstm.setInt(7, cliente.getId());
                
                pstm.execute();
                pstm.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "JDBCCliente Alterar" + e);
            }
    }
    public void excluirCliente(Cliente cliente){
        String sql = "DELETE FROM cliente WHERE id = ?";
        conn = new Conexao().conexaoBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, cliente.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "JDBCCliente Excluir" + e);
        }
        
    }
    
}
