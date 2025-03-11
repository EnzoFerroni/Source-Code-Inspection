package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */

//Enzo Ferroni - 10417100
//Rafael Neves - 10418316

public class PapelMoeda {

    protected int valor; //4 - Comissão:  De acordo com os requisitos, o acesso deveria ser 'private' ao invés de 'protected'.
    protected int quantidade; //5 - Comissão:  De acordo com os requisitos, o acesso deveria ser 'private' ao invés de 'protected'.

    public PapelMoeda(int valor, int quantidade) {
    	//6 - Omissão: Não há verificação se o valor é válido.
    	//7 - Omissão: Falta de validação da quantidade, que caso seja negativa pode causar erros lógicos.
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
  //8 - Omissão: Falta a implementação do setter de 'valor'.
  //9 - Omissão: Falta a implementação do setter de 'quantidade'.
}
