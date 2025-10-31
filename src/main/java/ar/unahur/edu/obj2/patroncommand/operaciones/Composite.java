package ar.unahur.edu.obj2.patroncommand.operaciones;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Composite extends Command{

    private List<Operable> operaciones = new ArrayList<>();


    public Composite(List<Operable> operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    protected void doExecute(Programable micro) {
        micro.run(operaciones);
    }


    

}
