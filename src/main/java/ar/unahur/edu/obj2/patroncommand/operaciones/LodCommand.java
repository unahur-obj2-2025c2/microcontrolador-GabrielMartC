package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LodCommand extends Command{
    private Integer addr;

    public LodCommand(Integer addr){
        this.addr = addr;
    }

    @Override
    protected void doExecute(Programable micro) {
        // micro.setAddr(this.addr);
        
        micro.setAcumuladorA(micro.getAddr(addr));
    }

}
