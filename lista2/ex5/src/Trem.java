// Classe Trem que implementa IMeioTransporte
public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando nos trilhos.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando lentamente.");
    }
}
