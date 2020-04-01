/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FUNCIONESYMETODOS;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Denis Federico Zelaya
 * denisfzelaya@gmail.com
 */
public class OBTENERFECHA {
    
    public static String fechaActual(){
    Date fecha = new Date();
    SimpleDateFormat formatoFecha =new SimpleDateFormat("dd/MM/yyyy");
    return formatoFecha.format(fecha);}
   
}

//PARA UTILIZARLA EN CUALQUIER JFRAME
//
//Llamar a la clase OBTENERFECHA
//OBTENERFECHA OF = OBTENERFECHA();
//
//Asignar fecha a un Label u otro
//LblFecha = String.valueof(OF.fechaActual);
//LISTO
