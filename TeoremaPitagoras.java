
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class TeoremaPitagoras {
public static void main(String[] args) {
        
        // solicita a entrada do valor do primeiro cateto
        String cateto1Str = JOptionPane.showInputDialog("Digite o valor do primeiro cateto:");
        
        // converte o valor do primeiro cateto para um número
        double cateto1 = Double.parseDouble(cateto1Str);
        
        // solicita a entrada do valor do segundo cateto
        String cateto2Str = JOptionPane.showInputDialog("Digite o valor do segundo cateto:");
        
        // converte o valor do segundo cateto para um número
        double cateto2 = Double.parseDouble(cateto2Str);
        
        // calcula o valor da hipotenusa usando o Teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        // exibe o valor da hipotenusa
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
    }
} 

