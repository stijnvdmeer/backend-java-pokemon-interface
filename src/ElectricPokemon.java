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
    public double calcDamageModifier(Pokemon gymPokemon) {
        double damageModifier;

        switch (gymPokemon.getType()) {
            case "electric":
                damageModifier = 0.5;
                break;
            case "fire":
                damageModifier = 0.75;
                break;
            case "grass":
                damageModifier = 1;
                break;
            default:
                damageModifier = 1.5;
                break;
        }
        return damageModifier;
    }


    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses thunderpunch on " + gymPokemon.getName());
        int damage = (int) (60 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses electroball on " + gymPokemon.getName());
        int damage = (int) (40 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses thunder on " + gymPokemon.getName());
        int damage = (int) (30 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println("your " + pokemon.getName() + " healed for " + ((int) (gymPokemon.getHp() * 1.2)) + " HP");
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " HP remaining");
        pokemon.setHp((int) (pokemon.getHp() * 1.2));
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses volttackle on " + gymPokemon.getName());
        int damage = (int) (90 * calcDamageModifier(gymPokemon)); // calculate damage modifier dependend on type
        System.out.println(gymPokemon.getName() + " loses " + damage + " HP");
        gymPokemon.setHp(gymPokemon.getHp() - damage); // Change HP
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " HP remaining");
    }
}
