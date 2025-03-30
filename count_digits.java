public class count_digits{
    public static void main(String[] arg){
        long n = 58938439;
        int i = 0;
        while(n>0){
            n= n/10;
            i++;
        }
        System.out.println(i);

    }
}