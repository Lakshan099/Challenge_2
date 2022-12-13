public class Main {

    public static void main(String[] args) {

        String s = args[0];
        Queue symList = new Queue(10);

        for (int i = 0; i < s.length(); i++) {
            char cW = s.charAt(i);
            symList.insert(String.valueOf(cW));

        }

        for (int i = 0; i < s.length(); i++) {

            Characters z = symList.peek(i);

            if (!symList.isEmpty()) {
                System.out.print(z.getWord());
            }

        }

    }

    static String chkLogic(String sysLetter) {
        return null;
    }
}
