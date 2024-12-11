public abstract class Pokemon {
    private final String name;
    private final String type;
    private final int level;
    private final String sound;
    private final String food;
    private int hp;

    public Pokemon(String name, String type, int level, String sound, String food,int hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.sound = sound;
        this.food = food;
        this.hp = hp;
    }


    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getLevel() {
        return level;
    }
    public String getSound() {
        return sound;
    }
    public String getFood() {
        return food;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
