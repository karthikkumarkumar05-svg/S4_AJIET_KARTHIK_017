class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; 
        }
        System.out.println("The sum of all elements is: " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
