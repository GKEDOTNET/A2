/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Aviao extends Veiculo{
    private int numTurbinas;
    private int numAsas;
    private int numPoltronas;

    public int getNumAsas() {
        return numAsas;
    }

    public void setNumAsas(int numAsas) {
        this.numAsas = numAsas;
    }

    public int getNumPoltronas() {
        return numPoltronas;
    }

    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
    
    public String MostrarDetalhes() {

        return super.MostrarDetalhes();

    }

    public String Acelerar() {
        return super.Acelerar("aviao"); 
    }
    
    public String Decolar(){
        
        return "O avião decolou.";
        
    }
    
    public String Pousar(){
       
        return "O avião pousou.";
       
    }
    
}
