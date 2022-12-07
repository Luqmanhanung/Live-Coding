public class FindingDuplicateNumber {
    private static void FindDuplicationNumber(int[] numbers){
        StringBuilder hasil = new StringBuilder();

        for (int x=0; x<numbers.length;x++){
            for (int y = x+1; y < numbers.length; y++){
                if (numbers[x] == numbers[y] && !hasil.toString().contains(String.valueOf(numbers[y]))){
                    hasil.append(numbers[y]);
                }
            }
        }
        System.out.println("Output: [" + hasil.toString().replaceAll(".(?!$)","$0, ") + "]");
    }

    public static void main(String[] args)
    {
        int[] input1= {1,1};
        FindDuplicationNumber(input1); //Output: [1]

        int[] input2= {1,2,3,4};
        FindDuplicationNumber(input2); //Output: []

        int[] input3= {1, 2, 1, 2, 2, 3, 4, 5, 5, 5, 5};
        FindDuplicationNumber(input3); //Output: [1, 2, 5]

    }
}
