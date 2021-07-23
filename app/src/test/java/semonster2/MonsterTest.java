package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testSummonMonster0() {
    Monster monster = new Monster(0, 0);
    assertEquals("スライム:レア度[0]", monster.toString());
    Monster monster2 = new Monster(0, 1);
    assertEquals("スライム:レア度[1]", monster2.toString());
    Monster monster3 = new Monster(0, 2);
    assertEquals("スライム:レア度[2]", monster3.toString());
    Monster monster4 = new Monster(0, 3);
    assertEquals("キングスライム:レア度[3]", monster4.toString());
    Monster monster5 = new Monster(0, 4);
    assertEquals("キングスライム:レア度[4]", monster5.toString());
  }

  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(1, 0);
    assertEquals("サハギン:レア度[0]", monster.toString());
    Monster monster2 = new Monster(1, 1);
    assertEquals("サハギン:レア度[1]", monster2.toString());
    Monster monster3 = new Monster(1, 2);
    assertEquals("サハギン:レア度[2]", monster3.toString());
    Monster monster4 = new Monster(1, 3);
    assertEquals("伝説のフィッシャーマン:レア度[3]", monster4.toString());
    Monster monster5 = new Monster(1, 4);
    assertEquals("伝説のフィッシャーマン:レア度[4]", monster5.toString());
  }

  @Test
  public void testSummonMonster2() {
    Monster monster = new Monster(2, 0);
    assertEquals("ドラゴン:レア度[0]", monster.toString());
    Monster monster2 = new Monster(2, 1);
    assertEquals("ドラゴン:レア度[1]", monster2.toString());
    Monster monster3 = new Monster(2, 2);
    assertEquals("ドラゴン:レア度[2]", monster3.toString());
    Monster monster4 = new Monster(2, 3);
    assertEquals("アクノロギア:レア度[3]", monster4.toString());
    Monster monster5 = new Monster(2, 4);
    assertEquals("アクノロギア:レア度[4]", monster5.toString());
  }

  @Test
  public void testSummonMonster3() {
    Monster monster = new Monster(3, 0);
    assertEquals("デュラハン:レア度[0]", monster.toString());
    Monster monster2 = new Monster(3, 1);
    assertEquals("デュラハン:レア度[1]", monster2.toString());
    Monster monster3 = new Monster(3, 2);
    assertEquals("デュラハン:レア度[2]", monster3.toString());
    Monster monster4 = new Monster(3, 3);
    assertEquals("ベルディア:レア度[3]", monster4.toString());
    Monster monster5 = new Monster(3, 4);
    assertEquals("ベルディア:レア度[4]", monster5.toString());
  }

  @Test
  public void testSummonMonster4() {
    Monster monster = new Monster(4, 0);
    assertEquals("シーサーペント:レア度[0]", monster.toString());
    Monster monster2 = new Monster(4, 1);
    assertEquals("シーサーペント:レア度[1]", monster2.toString());
    Monster monster3 = new Monster(4, 2);
    assertEquals("シーサーペント:レア度[2]", monster3.toString());
    Monster monster4 = new Monster(4, 3);
    assertEquals("リヴァイアサン:レア度[3]", monster4.toString());
    Monster monster5 = new Monster(4, 4);
    assertEquals("リヴァイアサン:レア度[4]", monster5.toString());
  }
}
