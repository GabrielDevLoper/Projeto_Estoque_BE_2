package projetoestoquebe;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sistema {
    ArrayList<Produto> produtos = new ArrayList();
    Produto p = new Produto();
    
    Scanner teclado = new Scanner(System.in);
    
    private int condWhile;// Variável para a condição while.
    private int id = 1;
    
    public void CadastrarProduto(){
        do{
            p = new Produto();
            p.setId(id++);
            System.out.print("\n\nDescrição: ");
            p.setDescricao(new Scanner(System.in).nextLine().toUpperCase());
            System.out.print("Unidade: ");
            p.setUnidade(new Scanner(System.in).nextLine().toUpperCase());
            System.out.print("Quantidade: ");
            p.setQuantidade(teclado.nextInt());
            System.out.print("Preço por Unidade: R$");
            p.setPreco(teclado.nextDouble());
            produtos.add(p);
            
            System.out.print("1 -- continuar 0 --  Sair: ");
            condWhile = teclado.nextInt();
            
            
        }while(condWhile !=0);
        
        
    }
    
    public void ExcluirProduto(){
        System.out.print("\nInsira o ID do Produto: ");
        int id = teclado.nextInt();
        
        Produto p1 = null;
        
        for(Produto p: produtos){
            if(p.getId() == id){
               produtos.remove(p);
               break;
            }
        }if(p.getId() != id){
            System.out.println("Produto não encontrado");
        }else{
            System.out.println("Produto excluido com sucesso");
        }
        
        
        
    }
    
    public void AlterarProduto(){
        System.out.print("\nInsira o ID do Produto: ");
        int id = teclado.nextInt();
        int flag = 0;
        for(Produto p: produtos){
            if(p.getId() == id){
                System.out.println("\t\n\nAlterando dados do Produto");
                System.out.print("\nDescrição: ");
                p.setDescricao(new Scanner(System.in).nextLine().toUpperCase());
                System.out.print("Unidade: ");
                p.setUnidade(new Scanner(System.in).nextLine().toUpperCase());
                System.out.print("Quantidade: ");
                p.setQuantidade(teclado.nextInt());
                System.out.print("Preço por Unidade: R$");
                p.setPreco(teclado.nextDouble());
                flag+=1;
               break;
            }
        }if(flag == 0){
            System.out.println("Produto não encontrado");
        }else{
            System.out.println("\n!!Produto alterado com sucesso!!\n\n");
        }
        
        
    }
    
    public void TabelaProdutos(){
        if(produtos.isEmpty()){
            System.out.println("\n\nNenhum Produto foi Cadastrado!!\n\n");
        }else{
        for(Produto p: produtos){
            System.out.print("\n\n|ID: "+p.getId()+"|");
            System.out.print("  |Descrição: "+p.getDescricao()+"|");
            System.out.print("  |Unidade: "+p.getUnidade()+"|");
            System.out.print("  |Quantidade: "+p.getQuantidade()+"|");
            System.out.print("  |Preço por Unidade: R$"+p.getPreco()+"|");
            
            }
        }
        System.out.println("\n");
    }
    
    public void SaidaDeProdutos(){
        System.out.print("\nInsira o ID do Produto: ");
        int id = teclado.nextInt();
        int flag = 0;
        int qtt = 0;
        for(Produto p: produtos){
            if(p.getId() == id){
                System.out.println("Quantidade: ");
                qtt = teclado.nextInt();
                p.setQuantidade(p.getQuantidade()-qtt);
                flag+=1;
                break;
            }
        }if(flag == 0){
            System.out.println("Saida de Produto liberada");
        }else{
            System.out.println("ERRO NOT FOUND 04");
        }
        
    }
}
