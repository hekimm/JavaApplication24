/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kmBasinaHarcananYakit ,toplamYol ,litreBasiFiyat,tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Araç kilometre başına kaç litre yakıyor:");
        
        kmBasinaHarcananYakit = scanner.nextDouble();
        
        System.out.println("Araç toplam kaç km yol yaptı : ");
        
        toplamYol = scanner.nextDouble();
        litreBasiFiyat = 44.90;
        tutar = kmBasinaHarcananYakit*toplamYol*litreBasiFiyat;
        
        System.out.println("Toplam ödemeniz gereken tutar: " + tutar + " TL" );

    }
    
}
