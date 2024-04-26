package pequisa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }  
    
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livroPorAnos.add(l);
                }
            }
        }
        
        return livroPorAnos;
    }
    
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
    
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1",
                "Autor1",
              2020);
        catalogoLivros.adicionarLivro("Livro 1",
                "Autor2",
              2021);
        catalogoLivros.adicionarLivro("Livro 2",
                "Autor2",
              2022);
        catalogoLivros.adicionarLivro("Livro 3",
                "Autor3",
              2023);
        catalogoLivros.adicionarLivro("Livro 4",
                "Autor4",
              2024);
        
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020,
                2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
