package br.edu.impacta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void testar() {
        System.out.println("Testando Collections");
        String[] names = new String[] { "Emilio", "Murta", "Resende" };
        System.out.println(Arrays.toString(names));

        List<String> nameList = new ArrayList<String>();
        nameList.add("Emilio");
        nameList.add("Murta");
        nameList.add("Resende");
        System.out.println(nameList);

        List<String> nameListInline = new ArrayList<String>() {{
            add("Emilio");
            add("Murta");
            add("Resende");
        }};
        System.out.println(nameListInline);

        List<String> nameListFancy = List.of("Emilio", "Murta", "Resende");
        System.out.println(nameListFancy);

        Map<String, String> basicMap = new LinkedHashMap<String, String>();
        basicMap.put("chave", "valor");
        System.out.println(basicMap);

        Map<String, String> basicMapInline = new LinkedHashMap<>() {{ 
            put("chaveInline", "valorInline");
        }};
        System.out.println(basicMapInline);

        Map<String, String> basicMapFancy = Map.of("chaveFancy", "valorFancy", "chaveFancyDois", "valorFancyDois");
        System.out.println(basicMapFancy);

        List<Map<String, String>> complexRecord = new LinkedList<>() {{
            add(new LinkedHashMap<>() {{
                put("Chave", "Valor");
            }});
        }};
        System.out.println(complexRecord);

        List<Map<String, String>> complexFancyRecord = List.of(Map.of("chave", "valor"));
        System.out.println(complexFancyRecord);
    }
}
