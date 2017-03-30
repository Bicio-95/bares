/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para controlar o acesso de clientes ao bar. 
O proprietário deseja que, ao entrar no bar,  cliente informe seu nome, CPF, idade e gênero. Alguns dos clientes pode 
ser sócios do bar e elegíveis a um programa de milhagens. Neste caso, deve-se registrar também o número do sócio.

A qualquer momento, ele deseja ser capaz de consultar quem são as pessoas que estão no bar, se alguém com um determinado
CPF está no bar, quantas são as pessoas e qual a distribuição por gênero (percentual de clientes masculinos e femininos)
e por status de sócio (quantos são sócios, e quantos não são). Ao sair, o cliente deve informar seu CPF, para registrar 
sua saída.

Modele este sistema (defina classes, com seus atributos e métodos), implemente-o e implemente os casos de testes usando 
testes unitários e JUnit. 
*/


//http://javafree.uol.com.br/topic-886008-Ajuda-Cadastro-alterar-e-excluir.html

package bares;

public class bares {

	private String nome;
	private int idade;
	private int CPF;
	private  genero genero;
	private int NumeroSocio;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getCPF() {
		return CPF;
	}
	public genero getGenero() {
		return genero;
	}
	public int getNumeroSocio() {
		return NumeroSocio;
	}
	
	public int ConsultaCPF(int CPFCliente){
		if(CPFCliente == getCPF()){
			
		}
			
		return CPFCliente;
		
		
	}
	
	
	
}
