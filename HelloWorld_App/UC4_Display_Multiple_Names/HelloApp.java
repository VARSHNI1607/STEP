public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                builder.append(args[i]);

                if (i < args.length - 1) {
                    builder.append(", ");
                }
            }

            name = builder.toString();
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}