package projetoestoquebe;

import java.util.Scanner;

public class Main {
    
    

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner teclado = new Scanner(System.in);
        int op;
        do{
        System.out.println("\t\tGerenciamento de Produtos\n");
        System.out.println("\t0 -- Sair");
        System.out.print("\t1 -- Cadastrar Produto");
        System.out.println("\t2 -- Excluir Produto");
        System.out.print("\t3 -- Alterar Produto");
        System.out.println("\t4 -- Tabela dos Produtos");
        System.out.print("\t5 -- Saida de Produtos");
        System.out.print("\nOpção: ");
        op = teclado.nextInt();
        
        switch(op){
            case 1:
                sistema.CadastrarProduto();
                break;
            case 2:
                sistema.ExcluirProduto();
                break;
            case 3:
                sistema.AlterarProduto();
                break;
            case 4:
                sistema.TabelaProdutos();
                break;
            case 5:
                sistema.SaidaDeProdutos();
                break;
            default:
                break;
                      
        }
        
      }while(op != 0);  
    }
    
}
