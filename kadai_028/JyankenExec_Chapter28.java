package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		//	じゃんけんクラスのインスタンスを生成
		Jyanken_Chapter28 game = new Jyanken_Chapter28();

		//	自分のじゃんけんの手を入力
		String myHand = game.getMyChoice();

		//	対戦相手のじゃんけんの手が乱数で選ばれる
		String enemyHand = game.getRandom();

		//	じゃんけんの結果を出力する
		game.playGame(myHand, enemyHand);
	}
}

