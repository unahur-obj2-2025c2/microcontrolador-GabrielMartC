package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Microcontrolador implements Programable{
    private Integer acumA = 0;
    private Integer acumB = 0;
    private Integer programCounter = 0;
    private List<Integer> memoriaDatos = Arrays.asList(new Integer[1024]);


    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o-> o.execute(this));
    }

    @Override
    public void incProgramCounter() {
        programCounter++;
    }

    @Override
    public Integer getProgramCounter() {
        return this.programCounter;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        this.acumA = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return acumA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        this.acumB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return acumB;
    }

    @Override
    public void setAddr(Integer addr) {
        memoriaDatos.set(addr, acumA);
    }

    @Override
    public Integer getAddr(Integer addr) {
        return memoriaDatos.get(addr);
    }

    @Override
    public void reset() {
        acumA = 0;
        acumB = 0;
        programCounter = 0;
        memoriaDatos = Arrays.asList(new Integer[1024]);
    }




}
