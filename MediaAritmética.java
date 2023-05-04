/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Migue
 */
public class MediaAritmética {
    public static void main(String[] args) {
        
    // solicita a entrada das três notas
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        
        // converte as notas para números
        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);
        
        // calcula a média aritmética
        double media = (n1 + n2 + n3) / 3;
        
        // exibe a média aritmética
        JOptionPane.showMessageDialog(null, "A média aritmética das notas é: " + media);
    }
}
    
    
   

