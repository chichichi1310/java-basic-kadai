package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28{
public String getMyChoice(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("自分のじゃんけんの手を入力しましょう");
            String choice = scanner.next();

            if(!(choice.equals("r") || choice.equals("s") || choice.equals("p"))){
                System.out.println("グーはrockのrを入力しましょう");
                System.out.println("チョキはscissorsのsを入力しましょう");
                System.out.println("パーはpaperのpを入力しましょう");
            }else{
                scanner.close();
                return choice;
            }
        } 

    }

public String getRandom(){
    String[] jyanken = { "r", "s", "p" };
    String choice = jyanken[(int) Math.floor(Math.random() * 3)];
    return choice;
}
public void playGame(String myChoice, String random){
    HashMap<String, String> jyanken = new HashMap<>();
    jyanken.put("r", "グー");
	jyanken.put("s", "チョキ");
	jyanken.put("p", "パー");
    
    System.out.println("自分の手は" + jyanken.get(myChoice) + ",対戦相手の手は" + jyanken.get(random));
   
    if ((myChoice.equals("r") && random.equals("s"))
        ||  (myChoice.equals("s") && random.equals("p"))
        || (myChoice.equals("p") && random.equals("r"))) {
        //自分の勝ち
        System.out.println("自分の勝ちです");
    }else if((myChoice.equals("r") && random.equals("p"))
        ||  (myChoice.equals("s") && random.equals("r"))
        || (myChoice.equals("p") && random.equals("s"))){
        //自分のまけ
        System.out.println("自分の負けです");
    }else if((myChoice.equals("r") && random.equals("r"))
        ||  (myChoice.equals("s") && random.equals("s"))
        || (myChoice.equals("p") && random.equals("p"))){
        //あいこ
        System.out.println("あいこです");


    }
}
}

