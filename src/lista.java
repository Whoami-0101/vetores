import javax.swing.JOptionPane;

public class lista {
    public static void main(String[] args) {
        
                double soma = 0;
                int quantidadeLista=0;
                String resultado = "";
                
                try {
                    quantidadeLista = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Quantidade de Produtos:"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, " error :\n [insira um numero inteiro]");
               
                }
        
                // entrada
        
                String[] produtolista = new String[quantidadeLista];
                double[] valorProdutoLista = new double[quantidadeLista];
        
                for (int i = 0; i < quantidadeLista; i++) {
        
                
                    produtolista[i] = JOptionPane.showInputDialog(
                                "Qual o " + (i + 1) + "°" + " item da lista? ");
            
                    valorProdutoLista[i] = Double
                            .parseDouble(JOptionPane.showInputDialog(
                                    "e qual o valor do " + (i + 1) + "°" + " item da lista?"));
        
                    resultado += "--------\n" + produtolista[i] + 
                    " o valor é de: R$ " + valorProdutoLista[i] + "\n";
        
                    soma = soma + valorProdutoLista[i];
                }
                // saida
        
                JOptionPane.showMessageDialog(null, "A sua Lista de produtos é:");
        
                JOptionPane.showMessageDialog(null, resultado + "\ne o total é da sua compra é: " +"R$"+soma);
    }
}
