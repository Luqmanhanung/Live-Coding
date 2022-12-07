import java.util.Arrays;

public class SortAscending
{
    public static void main(String[] args) {

        int[] array = {4, 1, 6, 9, 7};

        Arrays.sort(array);
        for(int i : array){
            System.out.print(i + ", ");
        }
    }
}
