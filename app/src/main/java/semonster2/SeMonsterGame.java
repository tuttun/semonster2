package semonster2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class SeMonsterGame {
  Map<String, Player> playermap = new HashMap<String, Player>();
  LinkedList<Integer> randomList = new LinkedList<Integer>();

  SeMonsterGame(LinkedList<Integer> randomList) {
    this.randomList = randomList;
  }

  public void addPlayer(String playerName) {
    this.playermap.put(playerName, (new Player(playerName, this.randomList)));
  }

  public void draw(String playerName) {
    Player player = this.playermap.get(playerName);
    player.drawMonsters();
    System.out.println(player);
  }

  public String toString(String playerName) {
    Player player = this.playermap.get(playerName);
    player.drawMonsters();
    return player.toString();
  }
}
