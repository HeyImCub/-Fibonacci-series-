//string.substring(string.length() - 1);
class practice {
  public static void check(String input){
    String output = "";
    String firstString = "";
    input = input.toLowerCase();
    for (int a = 1;a <= input.length();a++) {

      firstString = input.substring(input.length()-a);
      output += firstString.substring(0, 1);
    }
    System.out.println(output.equals(input));
  }
  public static void main(String[] args) {
      check("bob");
    }
}
