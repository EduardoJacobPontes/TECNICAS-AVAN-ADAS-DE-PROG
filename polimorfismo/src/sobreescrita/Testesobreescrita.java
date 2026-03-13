package sobreescrita;

public class Testesobreescrita {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Cachorro();
        Animal c = new Gato();

        a.emitirSom();
        b.emitirSom();
        c.emitirSom();
    }
}
