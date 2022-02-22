/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chelsea
 */
public class Array {
    public static void main(String[] args) {
  
        //cara membuat array
        //cara1
        String[] name;
        name = new String[10];
        name[0] = "Chelsy";
        name[1] = "Jelita";
        name[2] = "Chinta";
        
        //cara2
        int[] umur = new int[]{
        2,4,9,10,30
        };
        System.out.println(umur[5]);
        
        //cara3
        String[] mahasiswa = {        
        "Chelsy", "Jelita", "Chinta"       
        };
        
        System.out.println(mahasiswa[1]); //mengambil
        var result   = mahasiswa[0] = "Chelsy"; //mengubah
        System.out.println(result);
        System.out.println(mahasiswa.length); //mengambil panjang array
        
        //array dalam array
        String[][] data = {
        {
            "Chelsy", "Jelita", "Chinta"
        },
        {
            "Jeon", "Jungkook", "Jekey"
        }
       
        };  
        //cara mengambil data
        //cara1
        String[] hasil = data[0];
        System.out.println(hasil[1]);
        
        //cara2
        System.out.println(data[1][1]);
    }
}
