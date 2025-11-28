package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    public void transferWords(String[] words){
        HashMap<String, String> dictionary = new HashMap<>();
            dictionary.put("apple","りんご");
            dictionary.put("peach","桃");
            dictionary.put("banana","バナナ");
            dictionary.put("lemon","レモン");
            dictionary.put("pear","	梨");
            dictionary.put("kiwi","キウィ");
            dictionary.put("strawberry","いちご");
            dictionary.put("grape","ぶどう");
            dictionary.put("muscat","マスカット");
            dictionary.put("cherry","さくらんぼ");

            //for文
            for(int i=0;i<words.length;i++){
                String result = dictionary.get(words[i]);

                if(result == null){
                   System.out.println(words[i] + "は辞書に存在しません");
                    
                }else{
                   System.out.println(words[i] + "の意味は"+ result); 
                }
            }

            //拡張for文
            for (String word : words){

            }


    }
}