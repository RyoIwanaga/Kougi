package and1107.meikai.chapter7;

public class Ren12
{
	//
	//２０人分のテスト結果のヒストグラムを出力するプログラム
	// 実行結果ーー＞
	//   00点台の人数 |*
	//   10点台の人数 |*
	//   20点台の人数 |*
	//   30点台の人数 |*
	//   40点台の人数 |*
	//   50点台の人数 |**
	//   60点台の人数 |**
	//   70点台の人数 |****
	//   80点台の人数 |****
	//   90点台の人数 |**
	//  100点台の人数 |*
	//--------------------------
	public static void main(String[] args)
	{
		//テストの点数データが格納されている配列（２０人分）
		int[] scores = { 15, 89, 78, 86, 25, 100, 61, 67, 71, 55, 89, 92, 78, 80, 72, 5, 34, 92,
				46, 52 };
		
		//0,10,20,30,40,50,60,70,80,90,100点台の人数を格納するための配列（１１個）
		int[] graph = new int[11];
		
		for (int i = 0; i < scores.length; i++) {
			//このブロック内で配列graphの[０]から[１０]までにscores配列の点数のデータを整理して
			// 	graph[0] には 00?９点までの人数
			// 	graph[1] には 10?19点までの人数
			// 	graph[2] には 20?29点までの人数
			// 	graph[3] には 30?39点までの人数
			// 	graph[4] には 40?49点までの人数
			// 	graph[5] には 50?59点までの人数
			// 	graph[6] には 60?69点までの人数
			// 	graph[7] には 70?79点までの人数
			// 	graph[8] には 80?89点までの人数
			// 	graph[9] には 90?99点までの人数
			// 	graph[10]には100 点の人数
			//をそれぞれ設定するプログラムを記述してください。
			
			int score = scores[i];
			
			if (score < 10) {
				graph[0]++;
			} else if (score < 20) {
				graph[1]++;
			} else if (score < 30) {
				graph[2]++;
			} else if (score < 40) {
				graph[3]++;
			} else if (score < 50) {
				graph[4]++;
			} else if (score < 60) {
				graph[5]++;
			} else if (score < 70) {
				graph[6]++;
			} else if (score < 80) {
				graph[7]++;
			} else if (score < 90) {
				graph[8]++;
			} else if (score < 100) {
				graph[9]++;
			} else {
				graph[10]++;
			}
		}
		//graph配列の点数範囲別に星を表示するプログラム
		for (int i = 0; i < graph.length; i++) {
			System.out.printf("  %2d0点台の人数 |", i);
			for (int j = 0; j < graph[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}
