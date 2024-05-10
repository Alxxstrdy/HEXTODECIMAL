package hextodecimal;
public class HexToDecimal {
 public static int HexToDec(final String hexString) {
    StringBuilder rh = new StringBuilder(hexString);
    rh.reverse();
    int dec = 0;
    int counter = 1;
    int num;
    for (char c : rh.toString().toUpperCase().toCharArray()) {
      if (c == '-') {
        dec = -dec;
      } else {
        num = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
        dec += counter * num;
        counter *= 16;
      }
    }
    return dec;
  }
}