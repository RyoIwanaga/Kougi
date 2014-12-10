package and1107.meikai.chapter5;

public class Ex2 {

	public static void main(String[] args) {

		int dt;

		dt = 100;
		System.out.println("\n通常の加算式:");
		dt = dt + 1;
		System.out.println("結果1=" + dt);
		dt = dt + 1;
		System.out.println("結果2=" + dt);
		dt = dt + 1;
		System.out.println("結果3=" + dt);
		dt = dt + 1;
		System.out.println("結果4=" + dt);

		dt = 100;
		System.out.println("\n前置型インクリメント:");
		System.out.println("結果1=" + ++dt);
		System.out.println("結果2=" + ++dt);
		System.out.println("結果3=" + ++dt);
		System.out.println("結果4=" + ++dt);

		dt = 100;
		// 複合代入演算子の加算を使用する。
		System.out.println("\n複合代入加算:");
		dt += 1;
		System.out.println("結果1=" + dt);
		dt += 1;
		System.out.println("結果2=" + dt);
		dt += 1;
		System.out.println("結果3=" + dt);
		dt += 1;
		System.out.println("結果4=" + dt);
	}
}
