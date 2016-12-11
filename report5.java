/**
 * Created by e165740 on 2016/12/06.
 */
public class report5 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.printf("%s", str.length());
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }
    }
}