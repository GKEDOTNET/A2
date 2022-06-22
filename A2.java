/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app;

import java.util.Scanner;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class A2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idok = 0;
    do{
        System.out.println("[---------MENU---------]");
        System.out.println("Digite o ID do veículo que deseja cadastrar: \n1 - Automóvel\n2 - Aviao\n3 - Barco");
        System.out.println("");
        
        int id = sc.nextInt();
        

            switch(id){
            case 1:
                idok = 1;
                //Geral
                Fabricante FabricanteAuto = new Fabricante();
                System.out.println("Você seleciou Automóvel.\n");
                System.out.println("Cadastre o Fabricante: \nNome: ");
                FabricanteAuto.setNome(sc.next());
                System.out.println("\nPaís de origem: ");
                FabricanteAuto.setPaisDeOrigem(sc.next());
                //Especificos
                Automovel carro = new Automovel();
                System.out.print("Digite a capacidade do automóvel: ");
                Veiculo veiculo = new Veiculo() {};
                veiculo.setCapacidade(sc.nextInt());
                System.out.print("Digite o nome do automóvel: ");
                veiculo.setNome(sc.next());
                System.out.print("\nDigite o ano de fabricação: ");
                veiculo.setAnoFabricacao(sc.nextInt());
                System.out.print("\nDigite o diametro das rodas(EM CM): ");
                carro.setDiametroRoda(sc.nextInt());
                System.out.print("\nDigite a quantidade de portas: ");
                carro.setQtdPortas(sc.nextInt());
                System.out.print("\nDigite a quantidade Gasolina atual no Automóvel: ");
                carro.setQtdGas(sc.nextInt());
                System.out.println("\n\nVeiculos cadastrado com sucesso!");
                //Ações
                System.out.println("Ações: \n1 - Detalhes\n2 - Abrir Porta Malas\n3 - Acelerar\n4 - Sair do programa");
                int escolha = sc.nextInt();
                if(escolha == 4){
                   System.out.println("Saindo do programa...");
                   break; 
                }else if(escolha == 1){
                    System.out.println("o automóvel com o nome de "+veiculo.getNome()+" ,ano "+veiculo.getAnoFabricacao()+",produzido pela "+FabricanteAuto.getNome()+"("+FabricanteAuto.getPaisDeOrigem()+"), com capacidade de "+veiculo.getCapacidade()+" o automovel possuí rodas no diametro de "+carro.getDiametroRoda()+" cms, com "+carro.getQtdPortas()+" portas e "+carro.getQtdGas()+" MLs de Gasolina.");
                }else if(escolha == 2){
                    System.out.println(carro.AbrirPortaMalas());
                }else if(escolha == 3){
                    System.out.println(carro.Acelerar());
                }
                break;
            case 2:
                idok = 1;
                System.out.println("Você selecionou Avião.\n");
                //Geral
                Fabricante FabricanteAviao = new Fabricante();
                System.out.println("Cadastre o Fabricante: \nNome: ");
                FabricanteAviao.setNome(sc.next());
                System.out.println("\nPaís de origem: ");
                FabricanteAviao.setPaisDeOrigem(sc.next());
                //
                //Especificos
                Aviao aviao = new Aviao();
                System.out.print("Digite a capacidade do Aviao: ");
                Veiculo veiculo2 = new Veiculo() {};
                veiculo2.setCapacidade(sc.nextInt());
                System.out.print("Digite o nome do Avião: ");
                veiculo2.setNome(sc.next());
                System.out.print("\nDigite o ano de fabricação: ");
                veiculo2.setAnoFabricacao(sc.nextInt());
                System.out.println("Digite a qtd de turbinas: ");
                aviao.setNumTurbinas(sc.nextInt());
                System.out.println("Digite a qtd de asas: ");
                aviao.setNumAsas(sc.nextInt());
                System.out.println("Digite a qtd de poltronas: ");
                aviao.setNumPoltronas(sc.nextInt());
                System.out.println("\n\nVeiculo cadastrado com sucesso!");
                //Ações
                System.out.println("Ações: \n1 - Detalhes\n2 - Levantar voô\n3 - Pousar\n4 - Acelerar\n5 - Sair do programa");
                escolha = sc.nextInt();
                if(escolha == 5){
                   System.out.println("Saindo do programa...");
                   break; 
                }else if(escolha == 1){
                    System.out.println("o avião com o nome de "+veiculo2.getNome()+" ,ano "+veiculo2.getAnoFabricacao()+",produzido pela "+FabricanteAviao.getNome()+"("+FabricanteAviao.getPaisDeOrigem()+"), com capacidade de "+veiculo2.getCapacidade()+", o avião possuí "+aviao.getNumTurbinas()+" turbinas, "+aviao.getNumAsas()+" asas e "+aviao.getNumPoltronas()+" poltronas.");
                }else if(escolha == 2){
                    System.out.println(aviao.Decolar());
                }else if(escolha == 3){
                    System.out.println(aviao.Pousar());
                }else if(escolha == 4){
                    System.out.println(aviao.Acelerar());
                }
                break;
                
            case 3:
                idok = 1;
                System.out.println("Você selecionou Barco. \n");
                //Geral
                Fabricante FabricanteBarco = new Fabricante();
                System.out.println("Cadastre o Fabricante: \nNome: ");
                FabricanteBarco.setNome(sc.next());
                System.out.println("\nPaís de origem: ");
                FabricanteBarco.setPaisDeOrigem(sc.next());
                Barco barco = new Barco();
                System.out.print("Digite a capacidade do Barco: ");
                Veiculo veiculo3 = new Veiculo() {};
                veiculo3.setCapacidade(sc.nextInt());
                System.out.print("Digite o nome do Barco: ");
                veiculo3.setNome(sc.next());
                System.out.print("\nDigite o ano de fabricação: ");
                veiculo3.setAnoFabricacao(sc.nextInt());
                //Especificas
                System.out.println("Digite a qtd de velas: ");
                barco.setNumVelas(sc.nextInt());
                System.out.println("Digite a qtd de ancoras: ");
                barco.setNumAncoras(sc.nextInt());
                System.out.println("Digite a qtd de propulsores: ");
                barco.setNumPropulsores(sc.nextInt());
                System.out.println("\n\nVeiculo cadastrado com sucesso!");
                //Ações
                System.out.println("Ações: \n1 - Detalhes\n2 - Içar velas\n3 - Recolher velas\n4 - Acelerar\n5 - Sair do programa");
                escolha = sc.nextInt();
                if(escolha == 5){
                   System.out.println("Saindo do programa...");
                   break; 
                }else if(escolha == 1){
                    System.out.println("o barco com o nome de "+veiculo3.getNome()+" ,ano "+veiculo3.getAnoFabricacao()+",produzido pela "+FabricanteBarco.getNome()+"("+FabricanteBarco.getPaisDeOrigem()+"), com capacidade de "+veiculo3.getCapacidade()+" pessoas, o barco possuí "+barco.getNumVelas()+" velas, "+barco.getNumAncoras()+" ancoras e "+barco.getNumPropulsores()+" propulsores.");
                }else if(escolha == 2){
                    System.out.println(barco.IcarVelas());
                }else if(escolha == 3){
                    System.out.println(barco.RecolherVelas());
                }else if(escolha == 4){
                    System.out.println(barco.Acelerar());
                }
                break;
            case default: 
                System.out.println("\n\nID INVÁLIDO.\n\n");
                break;              
        }
        }while(idok == 0);
	System.out.println("\nPrograma encerrado!");

    }
}
