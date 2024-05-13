package com.pasantias.modulo1.decorator;

public interface Componente {
    void operacion();
}
class ComponenteImpl implements Componente{

    @Override
    public void operacion() {
        System.out.println("Operacion creada");
    }
}

abstract class ComponenteNuevaFunImpl implements Componente{

    protected Componente componente;
    @Override
    public void operacion() {
        componente.operacion();
        nuevaFncionalidad();
    }
    public void nuevaFncionalidad(){
        System.out.println("Nueva operacion creada");
    }
}
