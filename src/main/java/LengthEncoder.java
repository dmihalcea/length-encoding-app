/**
 * Responsible for encoding the length of a String
 */
public class LengthEncoder {

  public final String input;

  public LengthEncoder(String input) {
    this.input = input;
  }

  public String encode() {
    String str = this.input;

    if (str == null || str.isEmpty()) {
      return "";
    }

    StringBuilder result = new StringBuilder();
    int cnt = 1;

    for (int i = 1; i <= str.length(); i++) {
      if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
        cnt++;
      } else {
        result.append(str.charAt(i - 1));
        result.append(cnt);
        cnt = 1;
      }
    }

    return result.toString();
  }
}
