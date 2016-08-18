/**
 * Created by damian on 18/08/16.
 */
public class ParOrdenado<A,B> {
    private A first;
    private B second;

    public ParOrdenado(A first, B second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0;
        int hashSecond = second != null ? second.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }
}
