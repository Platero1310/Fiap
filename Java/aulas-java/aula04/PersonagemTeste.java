package aula04;

public class PersonagemTeste {
    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        p1.mostrarDados();

        Personagem p2 = new Personagem("Gustavo", 20);
        p2.mostrarDados();

        Personagem p3 = new Personagem("Legulas", 5);
        p3.mostrarDados();

    }
}
