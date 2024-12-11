import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");
    // Volgens de Randvoorwaarden word hier nog een private final variabele verwacht, hoogst mogenlijk type,
    // maar er worden ook 6 variabelen verwacht in de Pokemon super class. Ik kan nergens een 7de variabele gevonden dus staat hier maar een.

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, "fire", level, sound, food, hp);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses firelash on " + gymPokemon.getName());
    }
    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses flamethrower on " + gymPokemon.getName());
    }
    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses inferno on " + gymPokemon.getName());
    }
    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses pyroball on " + gymPokemon.getName());
    }
}
