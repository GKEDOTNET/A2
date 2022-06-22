/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Automovel extends Veiculo{
    private int diametroRoda;
    private int qtdPortas;
    private int qtdGas;
    private String Detalhes;
    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdGas() {
        return qtdGas;
    }

    public void setQtdGas(int qtdGas) {
        this.qtdGas = qtdGas;
    }
    
    
    
    public String AbrirPortaMalas(){
        
        return "O porta malas do carro foi aberto.";
        
    }

    public String MostrarDetalhes() {

        return super.MostrarDetalhes();
    }

    public String Acelerar() {
        return super.Acelerar("automovel");
    }
    
    
    
}
