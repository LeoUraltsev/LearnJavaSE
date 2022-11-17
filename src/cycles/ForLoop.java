package cycles;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++ ){
            if(i == 0){
                System.out.print("[" + i);
            }else if(i == 9){
                System.out.print(", " + i + "]");
            }else {
                System.out.print(", " + i);
            }
        }
    }

}
