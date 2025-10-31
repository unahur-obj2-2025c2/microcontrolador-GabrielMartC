package ar.unahur.edu.obj2.patroncommand.simulador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class SimuladorTest {
    Microcontrolador micro = new Microcontrolador();
    Simulador simulador = new Simulador();

    @BeforeEach
    public void init(){
        micro.reset();
        simulador.vaciarLista();
    }

    @Test
    void PCAvanza3Posiciones(){
        simulador.agregarOpNop();
        simulador.agregarOpNop();
        simulador.agregarOpNop();

        simulador.run(micro);
        
        assertEquals(3, micro.getProgramCounter());
    }

    @Test
    void PCOpSuma17Y20_AcumAQuedaEn37AcumBQuedaEn0_PCQuedaEnPos4(){
        simulador.agregarOpLodv(20);
        simulador.agregarOpSwap();
        simulador.agregarOpLodv(17);
        simulador.agregarOpAdd();

        simulador.run(micro);
        
        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());

    }

        @Test
    void PCOpSuma2Y8Y5_AcumAQuedaEn15AcumBQuedaEn0(){
        simulador.agregarOpLodv(2);
        simulador.agregarOpStr(0);
        simulador.agregarOpLodv(8);
        simulador.agregarOpSwap();
        simulador.agregarOpLodv(5);
        simulador.agregarOpAdd();
        simulador.agregarOpSwap();
        simulador.agregarOpLod(0);
        simulador.agregarOpAdd();


        simulador.run(micro);
        
        assertEquals(15, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());

    }
}
