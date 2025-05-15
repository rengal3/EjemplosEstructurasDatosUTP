/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.TDD;

/**
 *
 * @author TOSHIBA
 */
public class ListaSE_InFin {
     //Declaración de atributos
   private NodoSE inicio;
   private NodoSE termino;

   //Constructor sin parametros
   public ListaSE_InFin()
   {
    inicio=null;
    termino=null;
   }
 
   //Metodo insertar
   public void insertar(int dato){
       NodoSE i=new NodoSE(dato);
       i.setNext(null);
       if(inicio==null & termino==null){
           inicio=i;
           termino=i;
           }
       termino.setNext(i);
       termino=termino.getNext();
        
   }
 
   //Metodo extraer dato
   public int pool(){
       int dato=inicio.getDato();
       inicio=inicio.getNext();
       return dato;
   }
 
    public int peek(){        
       return inicio.getDato();
   }
   //Metodo para comprobar que la cola no esta vacia
   public boolean estaVacia(){
       boolean colaVerifica=false;
       if(inicio==null & termino==null){
           colaVerifica=true;
           System.out.println("La cola esta vacia");
       }
       else
       {
           System.out.println("La cola no esta vacia");
           colaVerifica=false;
       }
       return colaVerifica;
   }
 
   //Metodo para contar los elementos de la cola
   public int contar(){
       int contador=0;
       NodoSE c=this.inicio;
       while(c!=null){
           contador++;
           c=c.getNext();
       }
       System.out.println("Numero de datos en la cola: "+contador);
       return contador;
   }
 
//Metodo toString
   @Override
    public String toString(){
       NodoSE c=this.inicio;
       String s="";
       while(c!=null){
           s=s+c.toString();
           c=c.getNext();
       }
       return s;
   }

}
