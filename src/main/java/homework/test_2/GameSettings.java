package homework.test_2;

public class GameSettings {
    static int maxPlayers;

    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int max) {
        maxPlayers = max;
    }
    void addPlayer() {
        currentPlayers++;
    }
    void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + ", текущие игроки: " + this.currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }
}
