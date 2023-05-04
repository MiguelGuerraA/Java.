
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class AreaLosangulo {
public static void main(String[] args) {
        
        // solicita a entrada das diagonais maior e menor
        String diagonalMaiorStr = JOptionPane.showInputDialog("Digite a diagonal maior:");
        String diagonalMenorStr = JOptionPane.showInputDialog("Digite a diagonal menor:");
        
        // converte as diagonais para números
        double diagonalMaior = Double.parseDouble(diagonalMaiorStr);
        double diagonalMenor = Double.parseDouble(diagonalMenorStr);
        
        // calcula a área do losango
        double area = (diagonalMaior * diagonalMenor) / 2;
        
        // exibe a área do losango
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}


