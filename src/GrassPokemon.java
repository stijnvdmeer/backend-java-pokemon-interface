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

    public double calcDamageModifier(Pokemon gymPokemon) {
        double damageModifier;

        switch (gymPokemon.getType()) {
            case "grass":
                damageModifier = 0.5;
                break;
            case "water":
                damageModifier = 0.75;
                break;
            case "fire":
                damageModifier = 1;
                break;
            default:
                damageModifier = 1.5;
                break;
        }
        return damageModifier;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leafstorm on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses solarbeam on " + gymPokemon.getName());
        int damage = (int) (90 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leechseed on " + gymPokemon.getName());
        int damage = (int) (40 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        pokemon.setHp(pokemon.getHp() + (damage / 2)); // heal hp
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
        System.out.println("your " + pokemon.getName() + " has healed for " + (damage / 2));
    }
    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leafblade on " + gymPokemon.getName());
        int damage = (int) (80 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
}
