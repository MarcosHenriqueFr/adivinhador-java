package test.main.an.modelo;

import main.an.modelo.Memoria;
import org.junit.jupiter.api.Test;

public class MemoriaTeste {

    void testeNumeroAleatorio(){
        Memoria m = new Memoria(2);
        System.out.println(m.getAleatorio());
    }
}
