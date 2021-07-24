package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();
  String Name;
  LinkedList<Integer> randomList = new LinkedList<>();// ランダムな数値を格納していく

  Player(String PlayerName, LinkedList<Integer> random) {
    this.Name = PlayerName;
    this.randomList = random;
    // 24行目でモンスターをドロー
    this.drawMonsters();
  }

  // モンスターをドロー
  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster(this.randomList.pop(), this.randomList.pop()));
    }
  }

  // Playerがもつモンスターを返す
  public String showDeck() {
    String MonsterName = "";
    for (Monster m : this.deck) {
      MonsterName = MonsterName + m + "\n";
    }
    return MonsterName;
  }

  // Playerの名前とモンスターを表示
  @Override
  public String toString() {
    String PlayerStatus = "";
    PlayerStatus = "Deck:" + this.Name + "\n" + this.showDeck();
    return PlayerStatus;
  }

}
