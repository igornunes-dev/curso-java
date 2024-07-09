package interfacee.estabelecimento;

import interfacee.equipamentos.copiadora.Copiadora;
import interfacee.equipamentos.digitalizadora.Digitalizadora;
import interfacee.equipamentos.impressora.Deskjet;
import interfacee.equipamentos.impressora.Impressora;
import interfacee.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional equipamentoMultiFuncional = new EquipamentoMultiFuncional();
        Impressora impressora = equipamentoMultiFuncional;
        Digitalizadora digitalizadora = equipamentoMultiFuncional;
        Copiadora copiadora = equipamentoMultiFuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
