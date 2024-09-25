public class Quiz6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i += 1) {
            while (i < 2) {
                System.out.print("While" + ", ");
                break;
            }
            System.out.print("For" + ", ");
            if (i < 3){
                continue;
            }
            else{
                break;
            }
        }


    
    }
}
