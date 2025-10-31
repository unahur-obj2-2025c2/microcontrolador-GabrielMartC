package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class SwapCommand extends Command{

    @Override
    protected void doExecute(Programable micro) {
        Integer aux = micro.getAcumuladorA();

        micro.setAcumuladorA(micro.getAcumuladorB());
        micro.setAcumuladorB(aux);
    }

}
