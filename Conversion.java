import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        // 1. char[] → String
        char[] array1 = {'a','b','c','d'};//direct conversion//
        String newstr = new String(array1);
        System.out.println(newstr);

        // 2. String → int[] (digits)
        String num = "12345";
        int[] newarr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            newarr[i] = num.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(newarr));
        
         // 3. int[] → String (manual concat)
        int[] array2 = {1,2,3,4,5};
        String result = "";
        for (int n : array2) {
            result = result + n;
        }
        System.out.println(result);

        int num2=456;
        String newStr=String.valueOf(num2);
              //(or)//
        //String newstr = Integer.toString(num2);
        System.out.println(newStr);
        
        // 4. String → char[]
        char[] newchar = newstr.toCharArray();//direct conversion//
        System.out.println(Arrays.toString(newchar));

        // 5. String → char
        char ch = newstr.charAt(0);
        System.out.println(ch);

        // 6. char → String
        String cts = String.valueOf(ch);
        System.out.println(cts);

       // 7. int[] → String (official)
        String official = Arrays.toString(array2);
        System.out.println(official);
        
         //8.int[]--> String(without commas)//
        int[] num3={1,2,3,4,5};
        String result1="";
        for(int n:num3)
        {
            result1=result1+n;
        }
        System.out.println(result1);
         // 9. String → String[] (split)
        String sentence = "hi hello welcome";
        String[] parts = sentence.split(" ");
        System.out.println(Arrays.toString(parts));
    }
}
