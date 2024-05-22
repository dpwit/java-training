// String objects are immutable - meaning they cannot be modified
// StringBuilder object however CAN be modified or 'mutated'.

public class StringBuilderFun {
    public static void main(String[] args) {
        //java.lang.StringBuilder newSb = new java.lang.StringBuilder("Darren Whatford");
        StringBuilder newSb = new StringBuilder("Darren Whatford");

        newSb.append(" is cool!");
        System.out.println(newSb);

        newSb.insert(7, "Paul "); // start index and the data to insert
        System.out.println(newSb);

        newSb.replace(24, 29, "amazing!"); // 3 params, starting index, ending index and string data.
        System.out.println(newSb);

        newSb.delete(6, 11); // 2 params, starting index, ending index
        System.out.println(newSb);

        newSb.replace(0,6, "Mr.");
        System.out.println(newSb);


    } //end main
}
