public class Numbers {

    public int max_number(int[] numbers) {
        int max_number = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max_number)
                max_number = numbers[i];
        }
        return max_number;
    }

    public int min_number(int[] numbers) {
        int min_number = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min_number)
                min_number = numbers[i];
        }
        return min_number;
    }
}
