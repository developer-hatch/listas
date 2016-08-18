import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by damian on 17/08/16.
 */
public class BuscarElementoEnListaTest {

    @Test
    public void existeNumero(){

        MiLista lista = new MiLista(Arrays.asList(2,3,5,6));

        Assert.assertTrue(lista.existeNumero(3));
        Assert.assertTrue(lista.existeNumero(2));
        Assert.assertTrue(lista.existeNumero(5));
        Assert.assertTrue(lista.existeNumero(6));
        Assert.assertFalse(lista.existeNumero(8));

    }

    @Test
    public void existeString(){

        MiLista lista = new MiLista(Arrays.asList("hola", "3", "casa" ,"adios"));

        Assert.assertTrue(lista.existeString("hola"));
        Assert.assertTrue(lista.existeString("3"));
        Assert.assertTrue(lista.existeString("casa"));
        Assert.assertTrue(lista.existeString("adios"));
        Assert.assertFalse(lista.existeString("no existo en esta lista"));

    }

    @Test
    public void existeString(){

        Persona p1 = new Persona("Juan Perez" , 35444586);
        Persona p2 = new Persona("Juan Perez" , 38458999);

        MiLista lista = new MiLista(Arrays.asList(p1,p2));

        Assert.assertTrue(lista.existeString("hola"));
        Assert.assertTrue(lista.existeString("3"));
        Assert.assertTrue(lista.existeString("casa"));
        Assert.assertTrue(lista.existeString("adios"));
        Assert.assertFalse(lista.existeString("no existo en esta lista"));

    }

}
