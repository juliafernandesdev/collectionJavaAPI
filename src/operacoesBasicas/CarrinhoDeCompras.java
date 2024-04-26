package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item (nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        List <Item> itemParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for (Item i : itemList) {
               if (i.getNome().equalsIgnoreCase(nome)){
                   itemParaRemover.add(i);
               }
           }
           itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("O carrinho já está vazio!");
        }
    }
    
    public double calcularValorTotal(){
        double valorCarrinho = 0.0;
        if(!itemList.isEmpty()){
            for (Item item : itemList){
                double valorCompra = item.getPreco() * item.getQuantidade();
                valorCarrinho += valorCompra;
            } 
            return valorCarrinho; 
        } else {
            throw new RuntimeException("O carrinho está vazio!");
        }
   }
        
    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        carrinhoDeCompras.adicionarItem("Calça jeans",
                120.00,
                2);
        carrinhoDeCompras.adicionarItem("Bermuda",
                69.90,
                2);
        carrinhoDeCompras.adicionarItem("Sapato",
                89.90,
                1);
        
        
        System.out.println("Você está comprando:");
        carrinhoDeCompras.exibirItens();
        
       
        System.out.println("O valor total de suas compras é: R$ " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.removerItem("Bermuda");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Você removeu um item.");
        System.out.println("Carrinho atualizado:");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total de suas compras é: R$ " + carrinhoDeCompras.calcularValorTotal());
        
        
    }
}
