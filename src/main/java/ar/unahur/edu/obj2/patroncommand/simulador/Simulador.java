package ar.unahur.edu.obj2.patroncommand.simulador;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;
import ar.unahur.edu.obj2.patroncommand.operaciones.AddCommand;
import ar.unahur.edu.obj2.patroncommand.operaciones.LodCommand;
import ar.unahur.edu.obj2.patroncommand.operaciones.LodvCommand;
import ar.unahur.edu.obj2.patroncommand.operaciones.NopCommand;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;
import ar.unahur.edu.obj2.patroncommand.operaciones.StrCommand;
import ar.unahur.edu.obj2.patroncommand.operaciones.SwapCommand;


public class Simulador {

    private List<Operable> operaciones = new ArrayList<>();




    public void agregarOpNop(){
        operaciones.add(new NopCommand());
    }

    public void agregarOpAdd(){
        operaciones.add(new AddCommand());
    }

    public void agregarOpSwap(){
        operaciones.add(new SwapCommand());
    }

    public void agregarOpLod(Integer addr){
        operaciones.add(new LodCommand(addr));
    }

    public void agregarOpStr(Integer addr){
        operaciones.add(new StrCommand(addr));
    }

    public void agregarOpLodv(Integer val){
        operaciones.add(new LodvCommand(val));
    }

    public void vaciarLista(){
        operaciones.clear();
    }

    public void run(Programable micro){
        micro.run(operaciones);
    }
}
