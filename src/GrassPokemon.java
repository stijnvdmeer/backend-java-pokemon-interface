import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");
    // Volgens de Randvoorwaarden word hier nog een private final variabele verwacht, hoogst mogenlijk type,
    // maar er worden ook 6 variabelen verwacht in de Pokemon super class. Ik kan nergens een 7de variabele gevonden dus staat hier maar een.

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "grass", level, sound, food, hp);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses leafstorm on " + gymPokemon.getName());
    }
    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses solarbeam on " + gymPokemon.getName());
    }
    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses leechseed on " + gymPokemon.getName());
    }
    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "uses leafblade on " + gymPokemon.getName());
    }
}
