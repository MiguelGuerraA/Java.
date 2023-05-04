
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class CelsiusParaFahrenheit {
public static void main(String[] args) {
        
        // solicita a entrada da temperatura em Celsius
        String temperaturaCelsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
        
        // converte a temperatura para um número
        double temperaturaCelsius = Double.parseDouble(temperaturaCelsiusStr);
        
        // calcula a temperatura em Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        
        // exibe a temperatura em Fahrenheit
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}

