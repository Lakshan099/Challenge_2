public class Main {

    //main class

    public static void main(String[] args) {

        String s = args[0];

        boolean ans = chkLogic(s);

        System.out.println(ans);

    }

    static boolean chkLogic(String sysWord) {

        Queue symList = new Queue(10);

        for (int i = 0; i < sysWord.length(); i++) {

            if (sysWord.charAt(i) == '(' || sysWord.charAt(i) == '{' || sysWord.charAt(i) == '[') {
                symList.insert(sysWord.charAt(i));
            }

            else if (sysWord.charAt(i) == ')' && !symList.isEmpty() && symList.peek().getWord() == '(') {
                symList.remove();
            } else if (sysWord.charAt(i) == '}' && !symList.isEmpty() && symList.peek().getWord() == '{') {
                symList.remove();
            } else if (sysWord.charAt(i) == ']' && !symList.isEmpty() && symList.peek().getWord() == '[') {
                symList.remove();
            } else {
                return false;
            }
        }

        return symList.isEmpty();

    }
}