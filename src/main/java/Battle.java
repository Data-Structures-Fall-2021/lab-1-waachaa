public class Battle {
    public String name1, name2;
    public float atk1, atk2, def1, def2, hp1, hp2;
    public int round = 0;

    public Battle (String name1, float atk1, float def1, float hp1, String name2, float atk2, float def2, float hp2) {
        this.name1 = name1;
        this.atk1 = atk1;
        this.def1 = def1;
        this.hp1 = hp1;

        this.name2 = name2;
        this.atk2 = atk2;
        this.def2 = def2;
        this.hp2 = hp2;
    }

    public void simulateRound() {
        float damageTaken1 = atk2 - def1;
        float damageTaken2 = atk1 - def2;

        round++;
        hp1 -= damageTaken1;
        hp2 -= damageTaken2;

        System.out.printf("Round %d\n%s does %.0f points of damage to %s\n%s does %.0f points of damage to %s\n" +
                "%s:  %.0f\n%s:  %.0f\n\n"
                ,round, name1, damageTaken2, name2, name2, damageTaken1, name1, name1, hp1, name2, hp2);
    }

    public boolean isMonster1Dead() {
        return hp1 <= 0;
    }

    public boolean isMonster2Dead() {
        return hp2 <= 0;
    }

    public String getMonster1Name() {
        return name1;
    }

    public String getMonster2Name() {
        return name2;
    }

    public float getMonster1HP() { return hp1; }

    public float getMonster2HP() { return hp2; }
}
