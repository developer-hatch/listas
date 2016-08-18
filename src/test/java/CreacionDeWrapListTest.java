import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 18/08/16.
 */
public class CreacionDeWrapListTest {
    @Test
    public void crearMiListaDeNumeros(){
        List<Integer> lista = Arrays.asList(2, 3, 5, 6);
        MiLista listaDeNumeros = new MiLista(lista);

        Assert.assertArrayEquals(listaDeNumeros.lista, lista);

    }

    @Test
    public void crearMiListaDeNumeros(){
        List<String> lista = Arrays.asList("casa", "hola", "Chau");
        MiLista listaDeNumeros = new MiLista(lista);

        Assert.assertArrayEquals(listaDeNumeros.lista, lista);
    }
}
