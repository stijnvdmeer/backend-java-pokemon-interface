import java.util.List;

public class PokemonTrainer {
    public String name;
    public List<Pokemon> pokemons;
    // Volgens de randvoorwaarden worden er in deze class 8 variabelen verwacht,
    // Maar er worden maar 3 variabelen gebruikt door trainer, waarvan 1 door gymtrainer.
    // Ik weet dus niet welke variabelen hier nog meer worden verwacht en houd het dus leeg

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
