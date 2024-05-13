package com.pasantias.modulo1;

public class TextComparator {
    public static void main(String[] args) {
        System.out.println(compararTexto("hola", "hola")); // son iguales
        System.out.println(compararTexto("hola", "chau")); // son distintos
        System.out.println(compararTexto("hola", "holamundo")); // estan contenidos al principio
        System.out.println(compararTexto("mundo", "holamundo")); // estan contenidos al final
        System.out.println(compararTexto("ola", "holamundo")); // estan contenidos en el medio
        System.out.println(compararTexto("adiosmundocruel", "holamundolindo")); // el maximo texto en comun es mundo
        System.out.println(compararTexto("bienvenidobotmakermatias", "esteesunmensajeparamatias")); // el maximo texto en comun es matias
        System.out.println(compararTexto("entrebienvenidobotmakermatias", "bienvenidoaterceraentrevista")); // el maximo texto en comun es bienvenido
        System.out.println(compararTexto("ejemploparabotmaker", "resultadodebotmakertarea")); // el maximo texto en comun es botmaker
    }

    public static String compararTexto(String texto1, String texto2) {

        if (texto1.equals(texto2)) {
            return "son iguales";
        }

        if (texto2.startsWith(texto1)) {
            return "estan contenidos al principio";
        } else if (texto2.endsWith(texto1)) {
            return "estan contenidos al final";
        } else if (texto2.contains(texto1)) {
            return "estan contenidos en el medio";
        }

        String maxCommonSubstring = "";

        for (int i = 0; i < texto1.length(); i++) {
            for (int j = i + 1; j <= texto1.length(); j++) {
                String substring = texto1.substring(i, j);
                if (texto2.contains(substring) && substring.length() > maxCommonSubstring.length()) {
                    maxCommonSubstring = substring;
                }
            }
        }

        return "el máximo texto en común es " + maxCommonSubstring;
    }
}
