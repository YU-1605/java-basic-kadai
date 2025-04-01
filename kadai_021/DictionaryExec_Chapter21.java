package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();
		
		// 調べる単語を配列にセット
		String[] wordsToSearch = {"apple", "banana", "grape", "orange"};
		
		// 検索
		for (String word : wordsToSearch) {
			myDictionary.searchWord(word);
		}

	}

}
