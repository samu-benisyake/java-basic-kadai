package kadai_018;

abstract public class Kato_Chapter18 {
//	フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
////	コンストラクタ publicだからしなくていいのか？
//	public Kato_Chapter18(String familyName, String givenName, String address) {
//		this.familyName= familyName;
//		this.givenName= givenName;
//		this.address=address;
//	}
	
	
//	メゾット作成
	
//	共通の紹介を出力するメゾット
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName +"です");
		System.out.println("住所は"+address+"です");
		
	}
	
	
//	個別の紹介を出力するメゾット 抽象
	public abstract void eachIntroduce();
		
	
	
	
//	紹介を実行するメゾット
	public  void  execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
		
		
	
	
	
	
	

}
