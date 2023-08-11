import java.util.ArrayList;
import java.util.List;

class Warrior {
    private int level;
    private int xp;
    private int xpCap;

    private int MaxLv = 100;

    private List<String> achievements;

    private String[] Ranks = { "Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror",
            "Champion",
            "Master", "Greatest" };

    private String RankAtual;

    public Warrior() {

        this.level = 1;
        this.xp = 100;
        this.RankAtual = Ranks[0];
        this.achievements = new ArrayList<>();
        this.xpCap = 200;
    }

    // #region GETTERS

    public int level() {
        return this.level;
    }

    public int experience() {
        return this.xp;
    }

    public String rank() {
        return this.RankAtual;
    }

    public List<String> achievements() {
        return this.achievements;
    }

    // #endregion

    private void ganharXP(int XpGanha) {

        if (this.level <= MaxLv) {

            this.xp += XpGanha;

            if (this.xp > MaxLv * 100) {
                this.xp = MaxLv * 100;
            }

            while (this.xp >= xpCap) {
                this.level++;
                this.xpCap += 100;
            }

            this.RankAtual = Ranks[this.level / 10];
        }
    }

    public String battle(int levelOponente) {

        if (levelOponente > MaxLv || levelOponente <= 0) {
            return "Invalid level";
        }

        String[] retornos = { "Easy fight", "A good fight", "An intense fight" };

        int IndexRetorno = 0;

        if (this.level / 10 < levelOponente / 10 && this.level <= levelOponente - 5) {
            return "You've been defeated";
        }

        if (levelOponente == this.level) {
            ganharXP(10);
            IndexRetorno = 1;
        } else if (levelOponente == this.level - 1) {
            ganharXP(5);
            IndexRetorno = 1;
        } else if (levelOponente > this.level) {

            int dif = levelOponente - this.level;
            int total = dif * dif * 20;
            ganharXP(total);
            IndexRetorno = 2;
        }

        return retornos[IndexRetorno];

    }

    public String training(String Descricao, int XpParaGanhar, int nivelMinimo) {

        if (this.level < nivelMinimo) {
            return "Not strong enough";
        }

        achievements.add(Descricao);
        ganharXP(XpParaGanhar);

        return Descricao;

    }

}