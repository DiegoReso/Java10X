package Generics;


public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja espada = new EquipamentosNinja("Espada");
        EquipamentosNinja escudo = new EquipamentosNinja("Escudo");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(espada);
        bolsaGenerica.adicionarEquipamento(escudo);
        System.out.println(bolsaGenerica);

    }
}
