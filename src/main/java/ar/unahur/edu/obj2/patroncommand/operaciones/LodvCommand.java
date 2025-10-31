package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LodvCommand extends Command{
    private Integer value;

    public LodvCommand(Integer value) {
        this.value = value;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.setAcumuladorA(value);
    }

    
}
