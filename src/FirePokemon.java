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
    public double calcDamageModifier(Pokemon gymPokemon) {
        double damageModifier;

        switch (gymPokemon.getType()) {
            case "fire":
                damageModifier = 0.5;
                break;
            case "electric":
                damageModifier = 0.75;
                break;
            case "water":
                damageModifier = 1;
                break;
            default:
                damageModifier = 1.5;
                break;
        }
        return damageModifier;
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses firelash on " + gymPokemon.getName());
        int damage = (int) (40 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses flamethrower on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses inferno on " + gymPokemon.getName());
        int damage = (int) (90 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses pyroball on " + gymPokemon.getName());
        int damage = (int) (80 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
}
