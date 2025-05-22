/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.TDD;

/**
 *
 * @author TOSHIBA
 */
public class NodoDE {  
//Declaracion de atributos
   private int dato;
   private NodoDE next;
   private NodoDE previous;
 

   public NodoDE(int dato){
       this.dato=dato;
   }
 
   //Metodos getter and setters
   public int getDato(){
       return dato;
   }
   public void setDato(int dato) {
       this.dato = dato;
   }
   public NodoDE getNext(){
       return next;
   }
   public void setNext(NodoDE next) {
       this.next = next;
   }

    public NodoDE getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDE previous) {
        this.previous = previous;
    }
 

   @Override
   public String toString(){
       String s=" "+dato+" ";
   return s;
   }
}
