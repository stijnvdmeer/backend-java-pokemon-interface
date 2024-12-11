import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");
    // Volgens de Randvoorwaarden word hier nog een private final variabele verwacht, hoogst mogenlijk type,
    // maar er worden ook 6 variabelen verwacht in de Pokemon super class. Ik kan nergens een 7de variabele gevonden dus staat hier maar een.

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "water", level, sound, food, hp);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses surf on " + gymPokemon.getName());
    }
    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses hydropump on " + gymPokemon.getName());
    }
    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses hydrocanon on " + gymPokemon.getName());
    }
    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses raindance on " + gymPokemon.getName());
    }
}
