/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ids.expresiones;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URLDecoder;

/**
 *
 * @author lovgam
 */
public class Ejemplo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String cadena="AV%20EDUARDO%20MOLINA%2C%23%206%2CVASCO%20DE%20Q%C3%BCIROGA%2C07440%2CGUSTAVO%20A%20MADERO%2CCIUDAD%20DE%20MEXICO";
        String cadenaDecodificada=URLDecoder.decode( cadena, "UTF-8" );
        String expOroginal="^[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚ_\\s\\(\\)\\%\\.\\-\\#\\´\\'\\/~]{1,250}\\,[a-zA-Z0-9_\\s\\(\\)\\#\\.\\-\\´\\'\\/~]{1,20}\\,[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚ_\\s\\(\\)\\#\\.\\-\\´\\'\\/~]{1,65}\\,(\\s+)?[0-9]+?\\s{0,5}\\,[a-zA-ZñÑáéíóúÁÉÍÓÚ_\\s~]{3,40}\\,[a-zA-ZñÑáéíóúÁÉÍÓÚ_\\s~]{2,20}$";
        //agrupamos con parentesis
        String exp="^([\\w\\W]{1,250})%2C([\\w\\W]{1,20})%2C([\\w\\W]{1,65})%2C([\\d]{0,5})%2C([\\w\\W]{3,40})%2C([\\w\\W]{2,20})";
        String exp1="^([\\w\\W]{1,250}),([\\w\\W]{1,20}),([\\w\\W]{1,65}),([\\d]{0,5}),([\\w\\W]{3,40}),([\\w\\W]{2,20})";
        /*
        evaluamos con cadena y exp
        */
        Pattern patron=Pattern.compile(exp);
        Matcher emparejador=patron.matcher(cadena);
        
       /*boolean respuesta=emparejador.find();
        if(respuesta){
            System.out.println("si coincide -> "+cadena);
            System.out.println("cadena decodificada: "+cadenaDecodificada);
        }else{
            System.out.println("no coincide -> "+cadena);
        }*/
        
        emparejador.find();
        String el=emparejador.group(1);
        String el1=emparejador.group(2);
        String el2=emparejador.group(3);
        String el3=emparejador.group(4);
        String el4=emparejador.group(5);
        String el5=emparejador.group(6);
        
        System.out.println("-> $1: "+el+" | $2: "+el1+" | $3: "+el2+" | $4: "+el3+" | $5: "+el4+" | $6: "+el5);
        
        System.out.println("------------------------------------------------");
        
        /*
        evaluamos con cadenaDecodificada y exp1
        */
        Pattern patron1=Pattern.compile(exp1);
        Matcher emparejador1=patron1.matcher(cadenaDecodificada);
        
        /*boolean respuesta1=emparejador1.find();
        if(respuesta1){
            System.out.println("si coincide [decodificada] -> "+cadenaDecodificada);
            //System.out.println("cadena decodificada: "+cadenaDecodificada);
        }else{
            System.out.println("no coincide [decodificada] -> "+cadenaDecodificada);
        }*/
        emparejador1.find();
        String e=emparejador1.group(1);
        String e1=emparejador1.group(2);
        String e2=emparejador1.group(3);
        String e3=emparejador1.group(4);
        String e4=emparejador1.group(5);
        String e5=emparejador1.group(6);
        
        System.out.println("-> $1: "+e+" | $2: "+e1+" | $3: "+e2+" | $4: "+e3+" | $5: "+e4+" | $6: "+e5);
        
    }
}
