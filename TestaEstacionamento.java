package Application;

import javax.swing.JOptionPane;

import Domain.Carro;

import Domain.Estacionamento;

public class TestaEstacionamento {

	

	public static void main(String[] args) {

		
		Estacionamento estaciona = new Estacionamento();
		Carro[] estacionamento = new Carro[10];
		Carro carro = new Carro();

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

				estaciona.adicionaCarro();

				break;
			
			case 2:

				estaciona.removeCarro();
				
				break;

			
			case 3:

				estaciona.estadoEstacionamento(estacionamento);

				break;


			case 4:

				
				JOptionPane.showMessageDialog(null, "O sistema será agora encerrado.\nTanananam.");		

				break;

				}

			}

	}

	

}