package ar.unahur.edu.obj2.patroncommand.operaciones;
import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public abstract class Command implements Operable{
    //aca va a estar historial
    
    @Override
    public void execute(Programable micro){

        this.doExecute(micro);
        micro.incProgramCounter();
    }

    protected abstract void doExecute(Programable micro);

}
