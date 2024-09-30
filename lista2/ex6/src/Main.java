import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de objetos do tipo Animal
        List<Animal> animais = new ArrayList<>();

        // Adicionando instâncias das subclasses na lista
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        // Iterando sobre a lista e chamando emitirSom() para cada animal
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}