/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan44.hukumohm;

/**
 *
 * @author 
 * Nama     : Reihan Wiyanda
 * Kelas    : IF-1
 * Nim      : 10119011
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai () {
        System.out.println("===Hukum Ohm===");
        System.out.println(
                "Kuat arus yang mengalir pada suatu kawat penghantar"
                        + "akan berbanding lurus dengan beda potensial"
                        + "pada ujung-ujung kawat penghantar tersebut"
                        + "asalkan suhu kawat dijaga konstan");
    }
    
    public Baterai (float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan () {
        return kuatArus * hambatan;
    }
    
}
