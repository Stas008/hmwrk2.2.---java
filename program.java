/**
 * СОРТИРОВКА ВСТАВКОЙ
 * main
 */
public class program {

    public static void main(String[] args) {
        int[] array = new int[10];
        lib.fill_rand_array(array);
        lib.print_arr(array);
        lib.sort_array_insert(array);
        System.out.println("array was sorted succesfuly!");
        lib.print_arr(array);
    }
}