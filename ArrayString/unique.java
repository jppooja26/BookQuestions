/*Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional
 * data structures?
 */
//Time complexity - O(n)
//Space complexity - O(1)
package ArrayString;
import java.util.Scanner;
class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        //Assuming string contains ASCII values
        boolean[] arr = new boolean[128];
        boolean found = false;
        for(int i=0;i<str.length();i++) {
            if(arr[(int)str.charAt(i)]) {
                found = true;
                System.out.println("Provided string does not contain unique characters");
                break;
            }
            arr[(int)str.charAt(i)] = true;
        } 
        if(!found)
            System.out.println("Provided string contains unique characters");
        sc.close();
    }
}