/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan44.hukumohm;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai bt = new Baterai();
        Baterai bt2 = new Baterai(3,12);
        System.out.println("Kuat Arus\t:" + bt2.getKuatArus() + " Ampere");
        System.out.println("Hambatan\t:" + bt2.getHambatan() + " Ohm");
        System.out.println("Hasil Tegangan\t:" + bt2.hitungTegangan() + " Volt");
    }
    
}
