/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author muril
 */
public class Teste {
    public static void main(String args[]) {
 
        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = dateFormat.format(dataAtual);
        String strDate = null;

        System.out.println("Date em String formatada: " + dataFormatada);
        
        
    }
}
