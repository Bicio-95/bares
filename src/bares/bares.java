/*O dono de uma rede de bares da cidade nos encomendou um sistema em Java para controlar o acesso de clientes ao bar. 
O propriet�rio deseja que, ao entrar no bar,  cliente informe seu nome, CPF, idade e g�nero. Alguns dos clientes pode 
ser s�cios do bar e eleg�veis a um programa de milhagens. Neste caso, deve-se registrar tamb�m o n�mero do s�cio.

A qualquer momento, ele deseja ser capaz de consultar quem s�o as pessoas que est�o no bar, se algu�m com um determinado
CPF est� no bar, quantas s�o as pessoas e qual a distribui��o por g�nero (percentual de clientes masculinos e femininos)
e por status de s�cio (quantos s�o s�cios, e quantos n�o s�o). Ao sair, o cliente deve informar seu CPF, para registrar 
sua sa�da.

Modele este sistema (defina classes, com seus atributos e m�todos), implemente-o e implemente os casos de testes usando 
testes unit�rios e JUnit. 
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
