import java.util.Random;


public class Unit
{
	String name;
	int hp;
	int atk;

	public Unit(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public int attack (Unit opp) {

		Random rnd = new Random();
		int dmg = rnd.nextInt(this.atk) + 1;

		opp.hp = opp.hp - dmg;

		System.out.printf("アクション：「%s」の攻撃、「%s」に %d ダメージを与えた。\n",
				this.name,
				opp.name,
				dmg);

		return dmg;
	}

	public void print() {
		System.out.printf("情報：「%s」HP %d, 攻撃力 %d\n",
				this.name, this.hp, this.atk);
	}

	public boolean isAlive() {
		return this.hp > 0;
	}

	public boolean isDead() {
		return this.hp <= 0;
	}

	public static void main(String[] args) throws InterruptedException
	{
		int turn = 1;
		Unit me = new Unit("勇者", 10, 3);
		Unit enemy = new Unit("敵", 10, 3);

		// お互いに生きている間
		while (me.isAlive() && enemy.isAlive()) {
			System.out.printf("=== ターン %d ===\n", turn);
			me.print();
			enemy.print();

Thread.sleep(2000);
			me.attack(enemy);
Thread.sleep(2000);
			enemy.attack(me);

			System.out.println();
			turn ++;
Thread.sleep(2000);

		}

		System.out.printf("=== ゲーム終了 ===\n");
		me.print();
		enemy.print();
	}
}
