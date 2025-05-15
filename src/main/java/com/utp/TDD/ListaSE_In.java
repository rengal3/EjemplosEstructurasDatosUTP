/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.TDD;

/**
 *
 * @author TOSHIBA
 */
public class ListaSE_In {
     //Declaración de atributos
   private NodoSE inicio;
   

   //Constructor sin parametros
   public ListaSE_In()
   {
    inicio=null;
    
   }
 
   //Metodo insertar
   public void insertarInicio(int dato){
       NodoSE i=new NodoSE(dato);
       i.setNext(null);
       if(inicio==null){
           inicio=i;           
           }else{
                i.setNext(this.inicio);
                this.inicio=i;
       }               
   }
   
    public void insertarFinal(int dato){
       NodoSE i=new NodoSE(dato);
       i.setNext(null);
       if(inicio==null){
           inicio=i;           
           }else{
                NodoSE auxiliar=this.inicio;
                while(auxiliar.getNext()!=null){
                    auxiliar=auxiliar.getNext();
                }
                auxiliar.setNext(i);                
       }               
   }
 
   //Metodo extraer dato
   public int eliminaInicio(){
       int dato=inicio.getDato();
       inicio=inicio.getNext();
       return dato;
   }
   
   public void eliminarEspecifico(int valorBuscado){
       NodoSE auxiliar=this.inicio;
       NodoSE anterior=null;
       
       while(auxiliar!=null){
           if(auxiliar.getDato()==valorBuscado){
               if(anterior!=null){
                   anterior.setNext(auxiliar.getNext());
               }else{
                   this.inicio=auxiliar.getNext();
               }
           }
           anterior=auxiliar;
           auxiliar=auxiliar.getNext();
       }
   }
   
 
    public int obtenInicio(){        
       return inicio.getDato();
   }
   //Metodo para comprobar que la lista no esta vacia
   public boolean estaVacia(){
       boolean colaVerifica=false;
       if(inicio==null){
           colaVerifica=true;
           System.out.println("La lista esta vacia");
       }
       else
       {
           System.out.println("La lista no esta vacia");
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
       System.out.println("Numero de datos en la lista: "+contador);
       return contador;
   }
   
   public void ordenar(){
       if(this.estaVacia()){
           return;
       }else{
           boolean cambiado=true;
           NodoSE actual=null;
           int aux;
           while(cambiado){
               actual=this.inicio;
               cambiado=false;
               while(actual.getNext()!=null){
                   if(actual.getDato()>actual.getNext().getDato()){
                       aux=actual.getNext().getDato();
                       actual.getNext().setDato(actual.getDato());
                       actual.setDato(aux);
                       cambiado=true;
                   }
                   actual=actual.getNext();
               }
           }
       }
           
                   
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
