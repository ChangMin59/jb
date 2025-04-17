public class Main {

    public static int getTotal(int[] numbers){
        int total = 0;

        for(int i=0; i<numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] numberArr = {10,20,30,40,50};

        int resultNum = getTotal(numberArr);
        System.out.println("총합은 "+resultNum);
    }
}