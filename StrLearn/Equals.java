package StrLearn;

public class Equals {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";
        String s3 = "hello";
        String s4 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str2==s3);
        System.out.println(str1==s4);
        String s5 = "hello";
        String s6 = "Hello";
        System.out.println(s5.equalsIgnoreCase(s6));
        System.out.println(s5.contains("he"));
        System.out.println(s5.startsWith("hello"));
        System.out.println(s5.endsWith("he"));
        System.out.println(s5.length());
        System.out.println(s5.indexOf("l"));
        System.out.println(s5.lastIndexOf("o"));
        System.out.println(s5.substring(2,4));
        System.out.println(s5.charAt(3));
        System.out.println(s5.replace("l","p"));


    }
}
