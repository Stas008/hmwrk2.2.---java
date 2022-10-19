import java.util.Random;

public class lib {
    public static void print_arr(int[] input_arr) {
        for (int i = 0; i < input_arr.length; i++) {
            System.out.print(input_arr[i] + " ");
        }
        System.out.println();
    }

    public static void fill_rand_array(int[] input_arr) {
        Random rand = new Random();
        for (int i = 0; i < input_arr.length; i++) {
            input_arr[i] = rand.nextInt(100);

        }
    }

    public static void insert_item(int[] input_arr, int item_index, int new_index) {
        int temp = input_arr[item_index];
        for (int i = item_index - 1; i >= new_index; i--) {
            input_arr[i + 1] = input_arr[i];
        }
        input_arr[new_index] = temp;
    }

    public static int sorted_length(int[] input_arr) {
        int result = 1;
        while ((result < input_arr.length) && (input_arr[result] >= input_arr[result - 1])) {
            result++;
        }
        return result;
    }

    public static int find_index(int[] input_arr, int end_pos, int item) {
        while ((end_pos > 0) && (item <= input_arr[end_pos - 1])) {
            end_pos--;
        }
        return end_pos;
    }

    public static void sort_array_insert(int[] input_arr) {

        while (sorted_length(input_arr) != input_arr.length) {
            int len = sorted_length(input_arr);
            insert_item(input_arr, len, find_index(input_arr, len - 1, input_arr[len]));
        }
    }

    public static void main(String[] args) {

    }

}
