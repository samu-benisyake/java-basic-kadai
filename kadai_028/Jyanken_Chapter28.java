package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//	public	String	getMyChoice	自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			//TODO

			String input = scanner.next();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input;
			} else {
				System.out.println("無効な入力です。もう一度入力してください。");
			}
		}

	}

	//	public	String	getRandom	対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hands = { "r", "s", "p" };
		return hands[(int) Math.floor(Math.random() * 3)];

	}

	//	public	void	playGame	じゃんけんを行う
	public void playGame(String myHand, String enemyHand) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("r", "グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");

		System.out.println("自分の手は " + hashMap.get(myHand) + ", 対戦相手の手は " + hashMap.get(enemyHand));

		String message = "";

		if (myHand.equals(enemyHand)) {
			message = "あいこです";
		} else if ((myHand.equals("r") && enemyHand.equals("s")) ||
				(myHand.equals("s") && enemyHand.equals("p")) ||
				(myHand.equals("p") && enemyHand.equals("r"))) {
			message = "自分の勝ちです";
		} else {
			message = "自分の負けです";
		}
		System.out.println(message);
	}
}
