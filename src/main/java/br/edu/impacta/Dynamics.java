package br.edu.impacta;

import java.util.ArrayList;
import java.util.Map;

public class Dynamics {
    public static void testar() {
        System.out.println("VARiables...");
        var nome = "emilio";
        var number = 10;
        var floatNumber = 10.0f;
        var doublePrecision = 10.00;
        var list = new ArrayList<String>();
        var listMap = new ArrayList<Map<String,String>>();

        for (var map : listMap) {
            System.out.println(map);
        }

        var obj = new Object() {
            public String name = "Emilio";
            public String getName() {
                return this.name;
            }
        };
        System.out.println(obj.getName());
        obj.name = "new value!";
        System.out.println(obj.getName());
    }
}
