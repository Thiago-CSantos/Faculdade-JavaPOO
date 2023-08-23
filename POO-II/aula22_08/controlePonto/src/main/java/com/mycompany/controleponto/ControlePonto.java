package com.mycompany.controleponto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {

    public void registrarEntrada(Funcionario g) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        Date agora = new Date();
        
        System.out.println("ENTRADA: "+ g.getCodigo());
        System.out.println("DATA"+ sdf.format(agora));
    }

    public void registrarSaida(Funcionario g){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        Date agora = new Date();
        
        System.out.println("SAÍDA: "+ g.getCodigo());
        System.out.println("DATA"+ sdf.format(agora));
    } 
    
    
    
}
