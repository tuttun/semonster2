package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;

public class PlayerTest {
  @Test
  public void PlayerStatus1() {
    LinkedList<Integer> randomtestList = new LinkedList<>();// ランダムな数値を格納していく
    String testName = "user";

    randomtestList.add(0);
    randomtestList.add(0);
    randomtestList.add(1);
    randomtestList.add(0);
    randomtestList.add(0);
    randomtestList.add(4);
    randomtestList.add(4);
    randomtestList.add(0);
    randomtestList.add(3);
    randomtestList.add(3);
    randomtestList.add(2);
    randomtestList.add(0);
    randomtestList.add(1);
    randomtestList.add(1);
    randomtestList.add(2);
    randomtestList.add(4);

    Player player = new Player(testName, randomtestList);

    String testStatus = "Deck:" + testName + "\n" + "スライム:レア度[0]\n" + "サハギン:レア度[0]\n" + "キングスライム:レア度[4]\n"
        + "シーサーペント:レア度[0]\n" + "ベルディア:レア度[3]\n" + "ドラゴン:レア度[0]\n" + "サハギン:レア度[1]\n" + "アクノロギア:レア度[4]\n";

    assertEquals(testStatus, player.toString());

  }

  @Test
  public void PlayerStatus2() {
    LinkedList<Integer> randomtestList = new LinkedList<>();// ランダムな数値を格納していく
    String testName = "hoge";

    randomtestList.add(0);
    randomtestList.add(2);
    randomtestList.add(3);
    randomtestList.add(1);
    randomtestList.add(4);
    randomtestList.add(2);
    randomtestList.add(3);
    randomtestList.add(0);
    randomtestList.add(1);
    randomtestList.add(4);
    randomtestList.add(3);
    randomtestList.add(0);
    randomtestList.add(4);
    randomtestList.add(3);
    randomtestList.add(2);
    randomtestList.add(1);

    Player player = new Player(testName, randomtestList);

    String testStatus = "Deck:" + testName + "\n" + "スライム:レア度[2]\n" + "デュラハン:レア度[1]\n" + "シーサーペント:レア度[2]\n"
        + "デュラハン:レア度[0]\n" + "伝説のフィッシャーマン:レア度[4]\n" + "デュラハン:レア度[0]\n" + "リヴァイアサン:レア度[3]\n" + "ドラゴン:レア度[1]\n";

    assertEquals(testStatus, player.toString());

  }

}
