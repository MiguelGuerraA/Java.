
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Peso {
public static void main(String[] args) {
        
        // solicita a entrada do peso da pessoa
        String pesoStr = JOptionPane.showInputDialog("Digite o peso da pessoa:");
        
        // converte o peso para um número
        double peso = Double.parseDouble(pesoStr);
        
        // calcula o novo peso se a pessoa engordar 15%
        double novoPesoEngordar = peso * 1.15;
        
        // calcula o novo peso se a pessoa emagrecer 20%
        double novoPesoEmagrecer = peso * 0.8;
        
        // exibe os novos pesos
        JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar);
        JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer);
    }
}


