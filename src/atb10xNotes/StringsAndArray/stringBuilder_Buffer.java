package atb10xNotes.StringsAndArray;

public class stringBuilder_Buffer {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("withspace");
        str.replace(1,5,"power");
        str.reverse();
        System.out.println(str);
    }
}
