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

    public double calcDamageModifier(Pokemon gymPokemon) {
        double damageModifier;

        switch (gymPokemon.getType()) {
            case "water":
                damageModifier = 0.5;
                break;
            case "grass":
                damageModifier = 0.75;
                break;
            case "electric":
                damageModifier = 1;
                break;
            default:
                damageModifier = 1.5;
                break;
        }
        return damageModifier;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses surf on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses hydropump on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses hydrocanon on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses raindance on " + gymPokemon.getName());
        int damage = (int) (30 * calcDamageModifier(gymPokemon));
        if (gymPokemon.getType() == "electric") {
            damage = 0;
            System.out.println("raindance has no effect on the opposing " + gymPokemon.getName());
        }
        if (gymPokemon.getType() == "grass") {
            damage = 30;
            System.out.println("your raindance has healed the opposing " + gymPokemon.getName() + " by " + damage + " HP");
            gymPokemon.setHp(gymPokemon.getHp() + damage);
            System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
        }
        else {
            System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
            gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
            System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
        }
    }
}
