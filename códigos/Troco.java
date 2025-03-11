package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */

//Enzo Ferroni - 10417100
//Rafael Neves - 10418316

class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) { //16 - Excesso:  Implementação excessiva e desnecessária de loops com 'while'.
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) { //17 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0; //18 - Excesso:  Implementação desnecessária, uma vez que a variável já foi definida anteriormente.
        while (valor % 50 != 0) { //19 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0; //20 - Excesso:  Implementação desnecessária, uma vez que a variável já foi definida anteriormente.
        while (valor % 20 != 0) { //21 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0; //22 - Excesso:  Implementação desnecessária, uma vez que a variável já foi definida anteriormente.
        while (valor % 10 != 0) { //23 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0; //24 - Excesso:  Implementação desnecessária, uma vez que a variável já foi definida anteriormente.
        while (valor % 5 != 0) { //25 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0; //26 - Excesso:  Implementação desnecessária, uma vez que a variável já foi definida anteriormente.
        while (valor % 2 != 0) { //27 - Desempenho:  Implementação incorreta gerando um loop infinito, em que a condição 'valor' não é alterada.
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(2, count); //28 - Dados: Implementação incorreta do mesmo índice, fazendo com que pepeisMoeda[1] seja sobrescrito.
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> { //29 - Comissão:  Criação de uma classe dentro de outra não é uma boa prática.

        protected Troco troco; //30 - Comissão:  Atributo 'Troco' não foi definido nos requisitos.
        //31 - Omissão: Segundo o padrão iterator, é necessário ter uma variável para indicar a posição.

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) { 
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) { //32 - Dados: O loop nunca se inicia, uma vez que, a variável 'ret' foi definida como 'null'.
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() { //33 - Comissão:  A função 'remove()' não foi especificada nos requisitos.
            next();
        }
    }
}
