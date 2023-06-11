/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author muril
 */
public class Reserva {

    private Date dataDeEntrada;
    private Date dataDeSaida;
    private Cliente cliente;
    private Quarto quarto;
    private String observacao;

    public Reserva(String dataDeEntrada, String dataDeSaida, Cliente cliente, Quarto quarto) {
        try {
            this.dataDeEntrada = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeEntrada);
        } catch (ParseException e) {
            // Lidar com a exceção aqui
            e.printStackTrace(); // Imprime o rastreamento da exceção no console
            // Ou realizar outras ações, como exibir uma mensagem de erro para o usuário
        }
        try {
            this.dataDeSaida = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeSaida);
        } catch (ParseException e) {
            // Lidar com a exceção aqui
            e.printStackTrace(); // Imprime o rastreamento da exceção no console
            // Ou realizar outras ações, como exibir uma mensagem de erro para o usuário
        }
        this.cliente = cliente;
        this.quarto = quarto;
    }

    public Reserva(String dataDeEntrada, String dataDeSaida, Cliente cliente, Quarto quarto, String observacao) {
        try {
            this.dataDeEntrada = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeEntrada);
        } catch (ParseException e) {
            // Lidar com a exceção aqui
            e.printStackTrace(); // Imprime o rastreamento da exceção no console
            // Ou realizar outras ações, como exibir uma mensagem de erro para o usuário
        }
        try {
            this.dataDeSaida = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeSaida);
        } catch (ParseException e) {
            // Lidar com a exceção aqui
            e.printStackTrace(); // Imprime o rastreamento da exceção no console
            // Ou realizar outras ações, como exibir uma mensagem de erro para o usuário
        }
        this.cliente = cliente;
        this.quarto = quarto;
        this.observacao = observacao;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(Date dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getquarto() {
        return quarto;
    }

    public void setquarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
