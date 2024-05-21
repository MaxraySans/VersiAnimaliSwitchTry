/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author matte
 */
public class VersiAnimali 
{
    public static void main(String[] args) 
    {
        String verso;
        Scanner tastiera = new Scanner(System.in);
        System.out.printf("Inserisci il nome del verso di un animale e io ti dirò di che animele si tratta:");
        verso = tastiera.nextLine();
        switch (verso)
        {
            case "abbaiare": System.out.printf("Si tratta di un cane");
            break;
            case "nitrire": System.out.printf("Si tratta di un cavallo");
            break;
            case "miagolare": System.out.printf("Si tratta di un gatto");
            break;
            case "gracchiare": System.out.printf("Si tratta di una rana");
            break;
        }
    }
}
