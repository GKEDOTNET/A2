/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public abstract class Veiculo {
    public String nome;
    public String fabricante;
    public int anoFabricacao;
    public int capacidade;
    
    public String Acelerar(String tipo){
        
        return "O "+tipo+" acelerou!";
        
    }
    
    public String MostrarDetalhes(){
        
        Fabricante Fabricante = new Fabricante();
        
        return "com o nome de "+getNome()+" ,ano "+getAnoFabricacao()+",produzido pela "+Fabricante.getNome()+"("+Fabricante.getPaisDeOrigem()+"), com capacidade de "+getCapacidade();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    
}

