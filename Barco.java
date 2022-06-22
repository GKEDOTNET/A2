/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Barco extends Veiculo{

    private int numVelas;
    private int numAncoras;
    private int numPropulsores;

    public int getNumAncoras() {
        return numAncoras;
    }

    public void setNumAncoras(int numAncoras) {
        this.numAncoras = numAncoras;
    }

    public int getNumPropulsores() {
        return numPropulsores;
    }

    public void setNumPropulsores(int numPropulsores) {
        this.numPropulsores = numPropulsores;
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }
    
    public String MostrarDetalhes() {

        return super.MostrarDetalhes();

    }

    public String Acelerar() {
        return super.Acelerar("barco"); 
    }

    public String IcarVelas(){
        
        return "O barco está com as velas içadas.";
        
    }
    
    public String RecolherVelas(){
        
        return "Velas recolhidas.";
        
    }
}
