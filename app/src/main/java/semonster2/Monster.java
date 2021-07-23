package semonster2;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(int nameNum, int rareNum) {
    this.rare = rareNum;
    this.name = this.summonMonster(nameNum, rareNum);
  }

  String summonMonster(int mnumber, int rnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    String evolve[] = { "キングスライム", "伝説のフィッシャーマン", "アクノロギア", "ベルディア", "リヴァイアサン" };

    if (rnumber >= 3)
      return evolve[mnumber];
    else
      return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
