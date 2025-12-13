package kadai_028;

public class JyankenExec_Chapter28{
    public static void main(String[] args){
        Jyanken_Chapter28 jyankenApp = new Jyanken_Chapter28();

        //じゃんけんの入力
        String choice = jyankenApp.getMyChoice();

        //じゃんけんの設定(プログラム側で設定)
        jyankenApp.getRandom();

        //じゃんけん実行(入力値×プログラムで生成した値)
        jyankenApp.playGame(choice, choice);
    }
}