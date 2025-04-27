public class Main {

  public static int getPath(String path) {
    int x = 0, y = 0;

    for (int i = 0; i < path.length(); i++) {
      char direction = path.charAt(i);
      if (direction == 'E') {
        x++;
      } else if (direction == 'W') {
        x--;
      } else if (direction == 'N') {
        y++;
      } else if (direction == 'S') {
        y--;
      }
    }
    return (int) Math.sqrt((x * x) + (y * y));
  }

  public static String compress(String str) {

    String newStr = "";

    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count > 1) {
        newStr += count.toString();
      }
    }

    return newStr;
  }

  public static void main(String[] args) {

    // String str = "This is a string";
    // System.out.println(str);
    // System.out.println(str.length());
    // String str2 = " New String";
    // System.out.println(str+str2);

    // read notes for concepts and functions
    
    String path = "WNEENESENNN";
    int ans = getPath(path);
    System.out.println(ans);

    String str = "aaabbcccdd";
    System.out.println(compress(str));

  }
}
