
package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){ 
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
          
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
    public static void main(String[] args) {
       ListaTarefas listaTarefas = new ListaTarefas();
       
        System.out.println("O n�mero total de elementos na lista � " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O n�mero total de elementos na lista � " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O n�mero total de elementos na lista � " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.obterDescricoesTarefas();
    }
}
