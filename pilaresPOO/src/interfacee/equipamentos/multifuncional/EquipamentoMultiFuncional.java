package interfacee.equipamentos.multifuncional;

import interfacee.equipamentos.copiadora.Copiadora;
import interfacee.equipamentos.digitalizadora.Digitalizadora;
import interfacee.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento MultiFuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento MultiFuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo via equipamento MultiFuncional");
    }
}
