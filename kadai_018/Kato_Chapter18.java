package kadai_018;

public abstract class Kato_Chapter18 {
    public String 	familyName = "加藤";
    public String 	givenName = "";
    public String 	address = "住所は東京都中野区〇×";
    
    public void commonIntroduce(){
        System.out.println("名前は" + this.familyName + this.givenName + "です");
        System.out.println(this.address + "です");
    }
    
    abstract public void eachIntroduce();
    
    public void execIntroduce() {
        commonIntroduce();   // 共通部分
        eachIntroduce();     // 個別の自己紹介
    	
    }
    
    
}
