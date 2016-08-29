import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alumno on 29/08/16.
 */
public class SerVivoTest {
    @Test
    public void personaEsSerVivo(){
        SerVivo profe = new Persona("Dami", 25);

        profe.cumplirAños();

        Assert.assertEquals(26, profe.edad());
    }

    @Test
    public void perroEsSerVivo(){
        SerVivo choco = new Perro("Choco", 3);

        choco.cumplirAños();

        Assert.assertEquals(4, choco.edad);
    }
/*
    @Test
    public void todosCumplimosAnios(){
        SerVivo choco = new Perro("Choco", 3);
        SerVivo profe = new Persona("Dami", 25);

        List<?> seresss = new ArrayList();

        List<Integer> edades = new ArrayList<Integer>();
        edades.add(4);
        edades.add(25);
        List<Integer> edadesCalculades = new ArrayList<Integer>();


        Assert.assertEquals(edades, edadesCalculades);
    }*/
}
