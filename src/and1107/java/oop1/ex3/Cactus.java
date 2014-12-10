package and1107.java.oop1.ex3;

public class Cactus
{
    int height;
    int growth;

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
}
