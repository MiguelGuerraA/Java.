
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class AumentoSalario {
public static void main(String[] args) {
        
        // solicita a entrada do salário atual
        String salarioAtualStr = JOptionPane.showInputDialog("Digite o salário atual:");
        
        // converte o salário atual para um número
        double salarioAtual = Double.parseDouble(salarioAtualStr);
        
        // calcula o novo salário com aumento de 25%
        double novoSalario = salarioAtual * 1.25;
        
        // exibe o novo salário
        JOptionPane.showMessageDialog(null, "O novo salário é: R$ " + novoSalario);
    }
}
