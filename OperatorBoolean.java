/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chelsea
 */
public class OperatorBoolean {
 public static void main(String[] args) {
  int angka1 = 90;
  int angka2 = 20;
  boolean lulusUts = angka1 > 75;
  boolean lulusUas = angka2 > 75;
  boolean lulus = lulusUts && lulusUas;
  System.out.println(lulus);
     
  boolean lulusUts1 = angka1 > 75;
  boolean lulusUas1 = angka2 > 75;
  boolean lulus1 = lulusUts1 || lulusUas1;
  System.out.println(lulus1);
          
 }
}
