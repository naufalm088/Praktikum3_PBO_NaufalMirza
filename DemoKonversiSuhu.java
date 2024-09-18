/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author Naufal Mirza Aldilla
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 konversiSuhu = new KonversiSuhu2();

        System.out.println("25 Celcius ke Fahrenheit: " + konversiSuhu.celciusToFahrenheit(25));
        System.out.println("25 Celcius ke Reamur: " + konversiSuhu.celciusToReamur(25));

        System.out.println("77 Fahrenheit ke Reamur: " + konversiSuhu.fahrenheitToReamur(77));
    }
    
}
