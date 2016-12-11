/**
 * Created by e165740 on 2016/12/06.
 */
public class report5 {
    public static void main(String[] args) {
        String str = "3．14";
        try {
            System.out.printf("%s", str.length());
            double value = Double.parseDouble(str);
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }
    }


}