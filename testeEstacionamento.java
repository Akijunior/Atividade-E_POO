package Application;

import javax.swing.JOptionPane;

import Domain.Carro;
import Domain.Estacionamento;

public class TesteEstacionamento {
	
	public static void main(String[] args) {
		
		Estacionamento estacionamento = new Estacionamento();
		int opcao = -1;
		
		int cont = 0;
		
		while (opcao != 4) {
			
			opcao = (int) Long.parseLong(JOptionPane.showInputDialog("Bem-vindo ao Estacio!\n"
					+ "\nEscolha uma das opções abaixo:"
					+ "\n1 - Adicionar Carro no estacionamento"
					+ "\n2 - Retirar Carro"
					+ "\n3 - Listar Situação"
					+ "\n4- Sair do Programa"));
			
		switch(opcao) {
			
			
			case 1:
				
				
				Carro carro = new Carro();
				carro.placa = JOptionPane.showInputDialog("Diga o número da placa: ");
				carro.modelo = JOptionPane.showInputDialog("Diga o modelo do carro: ");
				int valorNovo = 0;
				for (int i = 0; i < Estacio.length; i++) {
					if (Estacio[i] == null) {
						Estacio[i] = carro;
						valorNovo = 1;
						break;
					}
					
				}
				if (valorNovo == 0)
					Estacio[cont] = carro;
				
				cont ++;
				break;
			
			case 2:
				
				JOptionPane.showMessageDialog(null, "Você escolheu retirar o Carro.");
				int posicao = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Diga a posição do estacionamento do carro que deseja retirar."));
				Estacio[posicao] = null;
				break;
			
			case 3:
				
				for (int i = 0; i < Estacio.length; i++) {
					if (Estacio[i] != null) {
						System.out.println("\nVaga " + i + "\nModelo do Carro " + Estacio[i].modelo + "\nPlaca " + Estacio[i].placa + "\n");
					
					}
					else if(Estacio[i] == null) {
						System.out.println("Vaga " + i + " -> Disponível");
					}
				}
				break;
			
			case 4:
				
				JOptionPane.showMessageDialog(null, "O sistema será agora encerrado.\nTanananam.");		
				break;
			
				
			
				}
		
			}
	}
	
}
