/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chelsea
 */
public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    
      //tipe data bukan primitif
      //Byte, short, integer, long, float
      //double, character, boolean
      
      int primitfi = 30; //primitif
      Integer nonPrimitif = 30; //bukanprimitif
      
      //konversi dari primitif ke bukan primitif 
      int umur = 19;
      Integer umurNonPrimitif = umur;
      
      //konversi dari bukan primitif ke primitif
      Integer old = 10;
      short primitifShort = old.shortValue();
  }
}
