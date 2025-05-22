/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utp.ejemplostdd;

import com.utp.TDD.ListaDE_InFin;
import com.utp.TDD.ListaSE_In;
import com.utp.TDD.ListaSE_InFin;

/**
 *
 * @author TOSHIBA
 */
public class EjemplosTDD { 
    
    public static void probarListaEnlazadaInicioFin(){
        //Probando Lista Enlazada Simple con nodo de inicio y fin
        ListaSE_InFin lista=new ListaSE_InFin();
        lista.insertar(46);
        lista.insertar(12);
        lista.insertar(87);
        lista.insertar(125);
        lista.insertar(30);
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.peek());
        lista.pool();
        lista.estaVacia();
        lista.contar();
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.peek());
        
    }
    
    public static void probandoListaEnlazadaInicio(){
        ListaSE_In lista=new ListaSE_In();
        lista.insertarInicio(46);
        lista.insertarInicio(12);
        lista.insertarInicio(87);
        lista.insertarInicio(125);
        lista.insertarInicio(30);
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.obtenInicio());
        lista.insertarFinal(-25);
        lista.insertarFinal(-10);
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.obtenInicio());
        lista.eliminarEspecifico(87);
        System.out.println(lista.toString());
        lista.eliminarEspecifico(30);
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.obtenInicio());
        lista.ordenar();
        System.out.println(lista.toString());
        System.out.println("Primer valor: "+lista.obtenInicio());
    }
    
    public static void probandoListaDobleEnlazadaInicioTermino(){
        ListaDE_InFin lista=new ListaDE_InFin();
        lista.insertarInicio(46);
        lista.insertarInicio(12);
        lista.insertarInicio(87);
        lista.insertarInicio(125);
        lista.insertarInicio(30);
        System.out.println(lista.toString());
        System.out.println(lista.recorreReversa());
        System.out.println("Primer valor: "+lista.obtenerPrimero());
        lista.insertarFinal(-25);
        lista.insertarFinal(-10);
        System.out.println(lista.toString());
        System.out.println(lista.recorreReversa());
        System.out.println("Primer valor: "+lista.obtenerPrimero());
        lista.eliminarEspecifico(87);
        System.out.println(lista.toString());
        System.out.println(lista.recorreReversa());
        lista.eliminarEspecifico(30);
        System.out.println(lista.toString());
        System.out.println(lista.recorreReversa());
        System.out.println("Primer valor: "+lista.obtenerPrimero());
        lista.ordenar();
        System.out.println(lista.toString());
        System.out.println(lista.recorreReversa());
        System.out.println("Primer valor: "+lista.obtenerPrimero());

    }
    public static void main(String[] args) 
    {
        probandoListaDobleEnlazadaInicioTermino();
        
            
    }
    

}

