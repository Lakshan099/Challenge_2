public class Main {

    public static void main(String[] args) {

        String s = args[0];
        Queue symList = new Queue(10);

        symList.insert(s);

        System.out.println(symList.peek());

    }

}
