package com.pasantias.modulo1.facade;

public class Facade {

    private SubsistemaA subsistemaA;
    private SubsistemaB subsistemaB;
    private SubsistemaC subsistemaC;

    public Facade() {
    }

    public Facade(SubsistemaA subsistemaA, SubsistemaB subsistemaB, SubsistemaC subsistemaC) {
        this.subsistemaA = subsistemaA;
        this.subsistemaB = subsistemaB;
        this.subsistemaC = subsistemaC;
    }

    public void operacionCompleja(){
        subsistemaA.operacionA();
        subsistemaB.operacionB();
        subsistemaC.operacionC();
    }

    public void operacionAB(){
        subsistemaA.operacionA();
        subsistemaB.operacionB();
    }
}
