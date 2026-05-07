import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleEstoque {


        public static String lerTextoNaoNulo(Scanner caixaDeTexto, String mensagem ) {
            
            while (true) {
                
                System.out.print(mensagem);

                String texto = caixaDeTexto.nextLine();

            if (texto != null && !texto.trim().isEmpty()) {
                    return texto.trim();
            } 
            System.out.println("Entrada inválida. Digite um texto não vazio.");
            }
        }

        private static int lerInt(Scanner caixaDeTexto, String mensagem, int minPermitido){
                
                while (true) {
                    System.out.print(mensagem);

                    String texto = caixaDeTexto.nextLine();

                    try {                
                        int valor = Integer.parseInt(texto.trim());
                        
                        if (valor < minPermitido) {
                            System.out.println("Valor inválido. O mínimo permitido é: " + minPermitido);
                            continue;
                        }
                        return valor;

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número inteiro (ex: 0, 10, 25..)");
                    }
                }

        }

        private static double lerDouble(Scanner caixaDeTexto, String mensagem, double minPermitido){

            while (true) {
                
                System.out.print(mensagem);
                String texto = caixaDeTexto.nextLine();

                try {
                    double valor = Double.parseDouble(texto.trim().replace(",", "."));

                    if (valor < minPermitido) {
                        System.out.println("Valor inválido. O mínimo permitido é: " + minPermitido);
                        continue;
                    }

                    return valor;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número (ex: 25.50, 11.38...)");
                }
            }

        }

        private static Produto cadastrarProduto(Scanner caixaDeTexto, int numeroProduto){

            System.out.println("\n=== Cadastro do Produto " + numeroProduto + " ===");
            
            String categoria = lerTextoNaoNulo(caixaDeTexto, "Categoria do produto: ");

            String nome = lerTextoNaoNulo(caixaDeTexto, "Nome do produto (campo obrigatório): ");

            double preco = lerDouble(caixaDeTexto, "O preço do produto (ex: 25.50 ou 25,50): R$ ", 0.0);
            
            int quantidade = lerInt(caixaDeTexto, "Quantidade em estoque (ex: número inteiro >=0): ", 0);
        
            return new Produto(nome, categoria, preco, quantidade);
        }

        private static void exibirEstatisticas(List<Produto> produtos){

            System.out.println("\n=== Estatísticas do Estoque ===");

            Produto maiorEstoque = produtos.get(0);
            Produto maiorValor = produtos.get(0);

            for (Produto p : produtos) {
                if (p.getQuantidade() > maiorEstoque.getQuantidade()) {
                    maiorEstoque = p;
                }
                if (p.calculaValorEmEstoque() > maiorValor.calculaValorEmEstoque()) {
                    maiorValor = p;
                }
            }

            System.out.println("\n--- Produto com maior Quantidade em Estoque ---");
            System.out.println(maiorEstoque.getNome() + " com " + maiorEstoque.getQuantidade() + " unidades.");

            System.out.println("\n--- Produto com maior Valor Total em Estoque ---");
            System.out.printf("%s com valor total de R$ %.2f%n", maiorValor.getNome(), maiorValor.calculaValorEmEstoque());
        }

        public static void main(String[] args) {
            Scanner caixaDeTexto = new Scanner(System.in);

            System.out.println("Sistema de Controle de Estoque - T1 2601 - AS");
            
            int qtdProdutos = lerInt(caixaDeTexto, "\nQuantos produtos você deseja cadastrar? ", 1);
            
            List<Produto> produtos = new ArrayList<>();

            for (int i = 1; i <= qtdProdutos; i++) {
                produtos.add(cadastrarProduto(caixaDeTexto, i));
            }

            System.out.println("\n=== Resumo dos Produtos Cadastrados ===");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println("\nProduto " + (i + 1));
                produtos.get(i).exibirResumo();
            }

            exibirEstatisticas(produtos);

            caixaDeTexto.close();
        }
}
