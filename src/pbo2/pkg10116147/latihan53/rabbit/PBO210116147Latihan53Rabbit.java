/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan53.rabbit;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menampilkan deskripsi kelinci.
 */
public class PBO210116147Latihan53Rabbit {
    public static void main(String[] args){
        Rabbit datRabbit = new Rabbit("Peter","grey",false,"grass", 4);
        
        System.out.println("Hello, his name is " + datRabbit.getName());
        System.out.println(datRabbit.getName() + " is Vegetarian? " + datRabbit.isVegetarian());
        System.out.println(datRabbit.getName() + " eats " + datRabbit.getEats());
        System.out.println(datRabbit.getName() + " has " + datRabbit.getNoOfLegs() + " legs");
        System.out.println(datRabbit.getName() + " color is " + datRabbit.getColor());
    }
}
