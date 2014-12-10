package and1107.java.oop1.ex7;

class RPG {
    public static void main(String[] args) {
        Charactor john = new Charactor();

        john.setHitPoint(1000);
        john.showStatus();
        john.walk(3);
        john.showStatus();
        john.sleep();
        john.showStatus();
    }
}

/** 登場人物のクラス */
class Charactor {
	int hpMax;
    int hp;

    void setHitPoint(int hp) {
        this.hp = hp;
    }
    /** 距離 distance を移動 */
    void walk(int distance) {
        System.out.println("Walking...(" + distance + ")");
        // 距離に比例して体力を消耗
    }

    void lvup() {
    	this.hp += 200;
    }
    /** 寝る */
    void sleep() {
        System.out.println("Sleeping...");
        // 睡眠をとると体力がある程度回復する
    }
    /** 状態表示 */
    void showStatus() {
        System.out.println("HitPoint: " + this.hp);
    }
}