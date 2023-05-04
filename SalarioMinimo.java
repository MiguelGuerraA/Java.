
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class SalarioMinimo {
public static void main(String[] args) {
        
        // solicita a entrada do valor do salário mínimo e do salário do funcionário
        String salarioMinimoStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        String salarioFuncionarioStr = JOptionPane.showInputDialog("Digite o valor do salário do funcionário:");
        
        // converte os valores para números
        double salarioMinimo = Double.parseDouble(salarioMinimoStr);
        double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);
        
        // calcula a quantidade de salários mínimos que o funcionário recebe
        double quantidadeSalarios = salarioFuncionario / salarioMinimo;
        
        // exibe a quantidade de salários mínimos que o funcionário recebe
        JOptionPane.showMessageDialog(null, "O funcionário recebe " + quantidadeSalarios + " salários mínimos.");
    }
}   

