public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder builder = new StringBuilder();

            for (String n : args) {
                builder.append(n).append(", ");
            }

            // remove trailing ", "
            name = builder.substring(0, builder.length() - 2);
        }

        System.out.println("Hello, " + name + "!");
    }
}