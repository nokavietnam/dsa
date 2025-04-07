public class StringExample {
  public static void main(String[] args) {
    String str = "Hello";
    str = str + " World";
    System.out.println(str);

    StringBuilder sb = new StringBuilder();
    sb.append(" World");
    System.out.println(sb.toString());
  }
}
