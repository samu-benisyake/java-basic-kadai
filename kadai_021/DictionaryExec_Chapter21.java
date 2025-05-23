package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		辞書クラスのインスタンスを作成
		Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();

		
//		調べる英単語を配列にセットする
		 String[] wordsToSearch = {"apple", "banana", "grape", "orange"};
		
//		辞書を調べるメゾットを引数指定で呼び出す
		 myDictionary.searchWords(wordsToSearch);
	}

}
