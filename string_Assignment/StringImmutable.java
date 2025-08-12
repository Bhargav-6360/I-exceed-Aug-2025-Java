public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "microsoft";
        String s2 = s1.concat(" World");
        System.out.println(s1==s2);
        System.out.println("s1: " + s1); 
        System.out.println("s2: " + s2); 
        // String methods
        System.out.println("Length: " + s1.length()); 
        System.out.println("Char at index 1: " + s1.charAt(1));
        System.out.println("Substring(1,4): " + s1.substring(1, 4));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Replace l->p: " + s1.replace('3', 'o'));
        System.out.println("Index of 'c': " + s1.indexOf('c'));
        System.out.println("Last index of 'c': " + s1.lastIndexOf('c')); 
        System.out.println("Split by 'c': " + String.join(", ", s1.split("c")));
        System.out.println("Trimmed: " + s1.trim());
        System.out.println("Equals ignore case 'MICROSOFT': " + s1.equalsIgnoreCase("MICROSOFT"));
        System.out.println("Compare to 'microsoft': " + s1.compareTo("microsoft"));
        System.out.println("Compare to 'Microsoft': " + s1.compareToIgnoreCase("Microsoft"));
        System.out.println("reverse: " + new StringBuilder(s1).reverse().toString());
        System.out.println("replaceAll 'c' with 'x': " + s1.replaceAll("c", "x"));
        
    }
}
    