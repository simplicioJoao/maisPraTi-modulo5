// Classe Bicicleta que implementa IMeioTransporte
public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando pedalando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando com os freios de mão.");
    }
}
