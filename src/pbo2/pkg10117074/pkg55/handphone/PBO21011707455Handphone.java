/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.pkg55.handphone;

/**
 *Nama  : Brigita Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   : 10117074
 *Deskripsi Program : Program ini berisi program yang menampilkan manufaktur
 *                    dari sebuah handphone
 */
public class PBO21011707455Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android adr = new Android("Samsung","Android","J5",3000000);
        adr.setKeyStore("234ibfd3840fo");
        adr.displayProduct();
        System.out.println("Android KeyStore : "+adr.getKeyStore());
        System.out.println("");
    
        BlackBerry bb = new BlackBerry("Balckberry","RIM","Curve",2000000);
        bb.setPinBB("BH167GT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
    
         WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        wp.setWpKeyStore("S415BN");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
    }
    
}
