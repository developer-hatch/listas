/**
 * Created by alumno on 29/08/16.
 */
public class Persona implements SerVivo {
    String nombre;
    int edad;

    public Persona(String dami, int i) {
        this.nombre = dami;
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
