public class SentenciaFor {
    public static void main(String[] args) {
        int i = 0;
        for(; i <= 5; i++){
            System.out.println("i = " + i);
        }
        for(int j = 0; j <= 5; j++){
            System.out.println("j = " + j);
        }
        System.out.println(i);

        for (int k = 1, l = 10; k<l; k++, l--){
            System.out.println(k + " - " + l);
        }

        for (int j = 0; j <= 10; j++){
            if(j % 2 == 0){
                continue;
            }
            System.out.println("j = " + j);
        }
    }
}
