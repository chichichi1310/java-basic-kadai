package kadai_015;

public class Car_Chapter15 {
    //フィールド定義
	private int    gear = 1;
	private int    speed = 10;

    public void gearChange(int afterGear) {
    	 this.gear = afterGear;
    	 switch(this.gear) {
    	 
    	 case 1:
    		 this.speed = 10;
    		 break;
    	 case 2:
    		 this.speed = 20;
    		 break;
    	 case 3:
    		 this.speed = 30;
    		 break;
    	 };
    	
     System.out.println("ギア1から" + this.gear + "に切り替えました");
    	
    }
    public void run() {

            System.out.println("速度は時速" + this.speed + "kmです");
    	
    	
    }
    
    
}
