package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */

//Enzo Ferroni - 10417100
//Rafael Neves - 10418316

public class TicketMachine {

    protected int valor; //10 - Comissão:  Atributo 'valor' não foi definido nos requisitos.
    protected int saldo; //11 - Comissão:  Atributo 'saldo' não foi definido nos requisitos.
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) { //12 - Dados:  Índice de papelMoeda[1] incorreto.
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null; //13 - Excesso:  Implementação incorreta.
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
    
  //14 - Omissão: Falta a implementação do setter de 'saldo'.
  //15 - Omissão: Falta a implementação do setter de 'Troco'.
}
