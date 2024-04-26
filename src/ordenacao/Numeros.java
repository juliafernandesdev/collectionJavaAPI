
package ordenacao;


public class Numeros implements Comparable<Numeros>{
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + '}';
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(numero,
                n.getNumero());
    }
    
    
    
}
