
package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 
public class OrdenacaoNumeros {
    private List<Numeros> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        numeros.add(new Numeros(numero));
    }
    
    public List<Numeros> ordenarAscendente(){
        List<Numeros> numerosAscendentes = new ArrayList<>(numeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }
    
    public List<Numeros> ordenarDescendente(){
        List<Numeros> numerosAscendentes = new ArrayList<>(numeros);
        numerosAscendentes.sort(Collections.reverseOrder());
        return numerosAscendentes;
    }
    
    
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        
        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);
        
        
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
   
    
    
    
}
