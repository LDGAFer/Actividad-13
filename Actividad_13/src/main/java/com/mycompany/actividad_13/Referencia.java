/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Order {
    List <String> ordenamiento (List nombres);
}

class Acomodo {
    static List <String> ord(List nombres){
        Collections.sort(nombres);
        return nombres;
    }
}

/**
 *
 * @author USER
 */
public class Referencia {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Fernando");
        nombres.add("Montse");
        nombres.add("Bety");
        nombres.add("Carolina");
        nombres.add("Melisa");
        nombres.add("Geraedo");
        nombres.add("Oscar");
        nombres.add("David");
        nombres.add("Carlos");
        nombres.add("Lucy");

        Order clasificar = Acomodo::ord;

        clasificar.ordenamiento(nombres);
        System.out.println("\nOrden alfabético con método de referencia: ");
        for (String elemento : nombres) {
            System.out.println(elemento);

        }
    }
}