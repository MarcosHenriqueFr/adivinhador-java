package test.main.an.modelo;

import main.an.modelo.Memoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MemoriaTeste {

    @Test
    void testeNumeroAleatorio(){
        boolean foraDoNormal = false;
        Memoria m;
        for(int i = 0; i < 100; i++){
            m = new Memoria(2);
            if(m.getAleatorio() > 100 || m.getAleatorio() < 1){
                foraDoNormal = true;
            }
        }

        assertFalse(foraDoNormal);
    }

    @Test
    void chancesFacil(){
        Memoria m = new Memoria(1);
        assertEquals(10, m.getChances());
    }

    @Test
    void chancesMedio(){
        Memoria m = new Memoria(2);
        assertEquals(5, m.getChances());
    }

    @Test
    void chancesDificil(){
        Memoria m = new Memoria(3);
        assertEquals(3, m.getChances());
    }
}
