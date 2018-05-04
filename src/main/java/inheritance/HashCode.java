package inheritance;

public class HashCode {
    public static void main(String[] args){
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());//2524 1163157884
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());//2524 1956725890
        //s与t拥有相同的散列码
    }
}
