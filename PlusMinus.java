import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args){
        //test cases
        List<Integer> a = new ArrayList<>();
        a.add(-4);
        a.add(3);
        a.add(-9);
        a.add(0);
        a.add(4);
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(-1);
        b.add(-2);
        b.add(-3);
        b.add(0);
        b.add(0);

        System.out.println("Test case 1: ");
        solution(a);
        System.out.println("Test case 2:");
        solution(b);

    }

    public static void solution(List<Integer> arr){
        //task: print out the ratios of positive, negative, and zero values in the array
        double pos = 0;
        double neg = 0;
        double zer = 0;
        for (int i: arr){
            if (i > 0){
                pos++;
            }
            if (i < 0){
                neg++;
            }
            if (i == 0){
                zer++;
            }
        }
        System.out.println(pos/ arr.size() + "\n" + neg/ arr.size() + "\n" + zer/ arr.size());
    }
}
