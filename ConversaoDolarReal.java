
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class ConversaoDolarReal {
public static void main(String[] args) {
        
        // solicita a entrada da cotação do dólar e do valor em dólares
        String cotacaoDolar = JOptionPane.showInputDialog("Digite a cotação do dólar:");
        String valorDolar = JOptionPane.showInputDialog("Digite o valor em dólares:");
        
        // converte a cotação e o valor para números
        double cotacao = Double.parseDouble(cotacaoDolar);
        double valor = Double.parseDouble(valorDolar);
        
        // converte o valor em dólares para reais
        double valorEmReais = valor * cotacao;
        
        // exibe o valor em reais
        JOptionPane.showMessageDialog(null, "Valor em reais: R$ " + valorEmReais);
    }
}

