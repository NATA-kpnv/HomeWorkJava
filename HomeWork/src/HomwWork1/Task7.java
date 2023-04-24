package HomwWork1;

public class Task7 {
    public static void main(String[] args) {
        int[] phoneArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = createPhoneNumber(phoneArray);
        System.out.println(phoneNumber);
    }

    //Номер в формате (123) 456-7890
    public static String createPhoneNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        String phoneNumber = "(" + strings[0] + strings[1] + strings[2] + ")";
        phoneNumber += ' ' + strings[3] + strings[4] + strings[5];
        phoneNumber += "-" + strings[6] + strings[7] + strings[8] + strings[9];
        return phoneNumber;
    }
}
