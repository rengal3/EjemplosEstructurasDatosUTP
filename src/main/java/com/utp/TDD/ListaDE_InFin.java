/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.TDD;

/**
 *
 * @author TOSHIBA
 */
public class ListaDE_InFin {
     //Declaración de atributos
   private NodoDE inicio;
   private NodoDE termino;

   //Constructor sin parametros
   public ListaDE_InFin()
   {
    inicio=null;
    termino=null;
   }
 
   //Metodo insertar
   public void insertarFinal(int dato){
       NodoDE i=new NodoDE(dato);
       i.setNext(null);
       i.setPrevious(null);
       if(inicio==null & termino==null){
           inicio=i;
           termino=i;
           }else{
            i.setPrevious(termino);
            termino.setNext(i);
            termino=termino.getNext();
       }
       
        
   }
   
   public void insertarInicio(int dato){
       NodoDE i=new NodoDE(dato);
       i.setNext(null);
       i.setPrevious(null);
       if(inicio==null & termino==null){
           inicio=i;
           termino=i;
           }else{
            i.setNext(inicio);
            inicio.setPrevious(i);
            inicio=inicio.getPrevious(); 
       }
             
        
   }
 
   public void eliminarEspecifico(int valorBuscado){
       NodoDE auxiliar=this.inicio;       
       
       while(auxiliar!=null){
           if(auxiliar.getDato()==valorBuscado){
               if(auxiliar.getNext()==null){
                   auxiliar.getPrevious().setNext(null);
                   this.termino=auxiliar.getPrevious();
               }else if(auxiliar.getPrevious()==null){
                   auxiliar.getNext().setPrevious(null);
                   this.inicio=auxiliar.getNext();                                      
               }else{
                   auxiliar.getPrevious().setNext(auxiliar.getNext());
                   auxiliar.getNext().setPrevious(auxiliar.getPrevious());
               }
           }           
           auxiliar=auxiliar.getNext();
       }
   }
   
    public void ordenar(){
       if(this.estaVacia()){
           return;
       }else{
           boolean cambiado=true;
           NodoDE actual=null;
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

   //Metodo extraer dato
   public int eliminaPrimero(){
       int dato=inicio.getDato();
       inicio.getNext().setPrevious(null);
       inicio=inicio.getNext();
       return dato;
   }
 
    public int obtenerPrimero(){        
       return inicio.getDato();
   }
    
     //Metodo extraer dato
   public int eliminaUltimo(){
       int dato=termino.getDato();
       termino.getPrevious().setNext(null);
       termino=termino.getPrevious();
       return dato;
   }
 
    public int obtenerUltimo(){        
       return this.termino.getDato();
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
       NodoDE c=this.inicio;
       while(c!=null){
           contador++;
           c=c.getNext();
       }
       System.out.println("Numero de datos en la cola: "+contador);
       return contador;
   }
   
   public String recorreReversa(){
       NodoDE c=this.termino;
       String s="";
       while(c!=null){
           s=s+c.toString();
           c=c.getPrevious();
       }
       return s;
   }
 
//Metodo toString
   @Override
    public String toString(){
       NodoDE c=this.inicio;
       String s="";
       while(c!=null){
           s=s+c.toString();
           c=c.getNext();
       }
       return s;
   }

}
