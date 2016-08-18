import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by damian on 17/08/16.
 */
public class BorrarElementoTest {
    @Test
    public void borrarElemento() {
        MiLista lista = new MiLista(Arrays.asList(2, 3, 5, 6));

        Assert.assertTrue(lista.existe(3));

        lista.borrar(3);

        Assert.assertFalse(lista.existeNumero(3));

    }

    @Test
    public void borrarTodosElemento() {
        MiLista lista = new MiLista(Arrays.asList("casa", "hola", "casa"));

        Assert.assertTrue(lista.existe("casa"));

        lista.borrarTodos("casa");

        Assert.assertFalse(lista.existe("casa"));

    }
}
