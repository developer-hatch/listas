/**
 * Created by alumno on 29/08/16.
 */
public class Perro implements SerVivo {
    String nombre;
    int edad;

    public Perro(String choco, int i) {
        this.nombre = choco;
        this.edad = i;
    }

    public int edad() {
        return this.edad;
    }

    public void cumplirAños() {
        this.edad = this.edad + 1;
    }

    public void todosCumplimosAnios() {
        this.edad = this.edad + 1;
    }
}
