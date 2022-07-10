import java.util.Scanner;

class Str {
    String word;
}

public class StringManipulation {
    public static void main(String[] args) {

        Str wor = new Str();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        wor.word = sc.nextLine();

        System.out.println("The length of the string usng length() function : " + wor.word.length());
        System.out.println("Using toLowerCase() function : " + wor.word.toLowerCase());
        System.out.println("Using toUpperCase() function : " + wor.word.toUpperCase());
        System.out.println("Checks whether a string is empty(TRUE) or not(False) using isEmpty() function : "
                + wor.word.isEmpty());
        System.out.println();
	  String str2="I Love Python";
        System.out.println("New string:"+str2);
	  System.out.println("String Concatination:"+wor.word.concat(str2));
	  System.out.println("Index of a Word: \"python\"in"+str2+":"+str2.indexOf("Python"));
	   System.out.println("String Replacement: \"python to Java\":"+str2.replace("Python","Java"));

    }
}