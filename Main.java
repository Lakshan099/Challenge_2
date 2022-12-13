public class Main {

    public static void main(String[] args) {

        String s = args[0];

        boolean ans = chkLogic(s);

        System.out.println(ans);

    }

    static boolean chkLogic(String sysWord) {

        Queue symList = new Queue(10);

        for (char l : sysWord.toCharArray()) {

            if (l == '(' || l == '{' || l == '[') {
                symList.insert(l);
            }

            else if (l == ')' && !symList.isEmpty() && symList.peek() == '(') {
                symList.remove();
            } else if (l == '}' && !symList.isEmpty() && symList.peek() == '{') {
                symList.remove();
            } else if (l == ']' && !symList.isEmpty() && symList.peek() == '[') {
                symList.remove();
            } else {
                return false;
            }
        }

        return symList.isEmpty();

    }
}
