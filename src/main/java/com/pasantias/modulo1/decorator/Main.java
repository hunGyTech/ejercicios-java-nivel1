package com.pasantias.modulo1.decorator;

public class Main {

    public static void main(String[] argumentos){
        Componente componente = new ComponenteImpl() {
            @Override
            public void operacion() {
            }
        };

        Componente componenteConNuevaFuncionalidad = new ComponenteNuevaFunImpl() {
            @Override
            public void nuevaFncionalidad() {
                super.nuevaFncionalidad();
            }
        };
    }
}
