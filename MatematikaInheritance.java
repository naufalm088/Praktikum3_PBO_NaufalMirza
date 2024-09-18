/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */

public class MatematikaInheritance {
    public static void main(String[] args) {

        matematika2 matematika = new matematika2();

        matematika.setNilai(10);
        System.out.println("Nilai: " + matematika.getNilai());

        System.out.println("Pertambahan: " + matematika.pertambahan(10, 5));
        System.out.println("Pengurangan: " + matematika.pengurangan(10, 5));

        matematika.setModulus(10, 3);
        System.out.println("Modulus: " + matematika.getModulus());
    }
}
