public class Whileloop {
    public static void main(String[] args) throws Exception {
        for (int i=0;i<10;i++) {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            String time = scanner.nextLine();
            System.out.println("Count Down:" + time);
            scanner.close();
        }
    }
}
