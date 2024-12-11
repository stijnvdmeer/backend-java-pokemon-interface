import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");
    // Volgens de Randvoorwaarden word hier nog een private final variabele verwacht, hoogst mogenlijk type,
    // maar er worden ook 6 variabelen verwacht in de Pokemon super class. Ik kan nergens een 7de variabele gevonden dus staat hier maar een.

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "electric", level, sound, food, hp);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses thunderpunch on " + gymPokemon.getName());
    }
    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses electroball on " + gymPokemon.getName());
    }
    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses thunder on " + gymPokemon.getName());
    }
    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses pyroball on " + gymPokemon.getName());
    }
}
