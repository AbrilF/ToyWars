public class main {
    public static void main(String[] args) {

        int options = 0;
        do {
            options = optionsStart();

            if (options == 1) {
                System.out.println("")
                System.out.println("Give your pet a name!")
                String name = sc.next();
                lifeBeing pet = new lifeBeing(name);


                do {
                    options = optionsPet();
                    if (options == 2) {
                        System.out.println("Feed");

                     }
                    if (options == 3) {
                        System.out.println("Shower");
                    }
                    if (options == 4) {
                            System.out.println("Train");
                    }

                while (options != 0);
            }

        } while (options != 0);
    }
    public static void optionsStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("")
        System.out.println("[2]Feed")
        System.out.println("[3]Shower")
        System.out.println("[4]Train")
        System.out.println("[0]Exit.")
        return sc.nextInt();
    }
        }
    public static void optionsStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("")
        System.out.println("[1]Hi! What do you want to do?")
        System.out.println("[2]Create a new Pet!")
        System.out.println("[0]Exit.")
        return sc.nextInt();
    }

}