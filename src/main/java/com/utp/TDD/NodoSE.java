/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.TDD;

/**
 *
 * @author TOSHIBA
 */
public class NodoSE {  
//Declaracion de atributos
   private int dato;
   private NodoSE next;
 

   public NodoSE(int dato){
       this.dato=dato;
   }
 
   //Metodos getter and setters
   public int getDato(){
       return dato;
   }
   public void setDato(int dato) {
       this.dato = dato;
   }
   public NodoSE getNext(){
       return next;
   }
   public void setNext(NodoSE next) {
       this.next = next;
   }
 

   @Override
   public String toString(){
       String s=" "+dato+" ";
   return s;
   }
}
