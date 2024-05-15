class mythread extends Thread{
    public void run() {
        
        for(int n=0;n<365;n++){
            for(int k=0;k<24;k++){
                for(int j=0;j<60;j++){
        
                    for(int i=0;i<60;i++){
                        try{
                            Thread.sleep(1000);
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println(n+":"+k+":"+j+":"+i);
                    }
                    
                }
            }
        }
    }

}

public class time_thread {
    public static void main(String args[]) {

        mythread t=new mythread();
        t.start();
  
    }
}
