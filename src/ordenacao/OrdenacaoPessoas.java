
package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura,
                new ComparatorPorAltura());
        return pessoaPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        
        ordenacaoPessoa.adicionarPessoa("nome 1",
                20,
                1.75);
        ordenacaoPessoa.adicionarPessoa("nome 2",
                24,
                1.60);
        ordenacaoPessoa.adicionarPessoa("nome 3",
                15,
                1.85);
        ordenacaoPessoa.adicionarPessoa("nome 1",
                19,
                1.55);
        
        
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        
    }
}
