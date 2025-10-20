//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Numbers number = new Numbers();
       int[] numbers = {23,1,87,34,11};
       System.out.println("Max number : " + number.max_number(numbers));
        System.out.println("Min number : " + number.min_number(numbers));
        System.out.println("Max sum : " + number.max_sum(numbers));
        System.out.println("Min sum : " + number.min_sum(numbers));
    }
}