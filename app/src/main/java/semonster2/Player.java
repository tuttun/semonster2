package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();
  String Name;
  LinkedList<Integer> randomList = new LinkedList<>();// ランダムな数値の最大値(0～4)を格納していく
  final static Random random = new Random();
  final static int maxRandomNumber = 4;

  Player(String PlayerName) {
    this.Name = PlayerName;
    // ランダムな値を22行目で算出
    this.RandomCreate();
    // 24行目でモンスターをドロー
    this.drawMonsters();
  }

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster(this.randomList.pop(), this.randomList.pop()));
    }
  }

  public String showDeck() {
    String MonsterName = "";
    for (Monster m : this.deck) {
      MonsterName = MonsterName + m + "\n";
    }
    return MonsterName;
  }

  public void RandomCreate() {
    for (int i = 0; i < 8; i++) {
      // 偶数番目の要素に名前，奇数番目の要素にレア度を入れる
      this.randomList.add(random.nextInt(5));
      this.randomList.add(random.nextInt(maxRandomNumber + 1));
    }
  }

  @Override
  public String toString() {
    String PlayerDeckName = "";
    PlayerDeckName = "Deck:" + this.Name + "\n" + this.showDeck();
    return PlayerDeckName;
  }

}
