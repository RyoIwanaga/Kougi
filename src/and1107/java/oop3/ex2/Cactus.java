package and1107.java.oop3.ex2;

public class Cactus {

	int height;
    int growth;

    public Cactus(int height, int growth) {
		super();
		this.height = height;
		this.growth = growth;
	}

    void setHeightAndGrowth(int x, int y) {
        this.height = x;
        this.growth = y;
    }

    void grown(int years) {
        this.height = this.height + this.growth * years;
    }

    int getHeight() {
        return this.height;
    }

    public static void main(String[] args) {
        // 高さ 100mm = 10cm 、成長率年間 5mm としたサボテンを生成
        Cactus myCactus = new Cactus(100, 5);

	System.out.println("現在のサボテンの背丈は " + myCactus.getHeight());

        // 1年後の経過をみる
        myCactus.grown(1);
	System.out.println("現在のサボテンの背丈は " + myCactus.getHeight());

        // さらにそれから2年後の経過をみる
        myCactus.grown(2);
	System.out.println("現在のサボテンの背丈は " + myCactus.getHeight());
    }
}
