public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder builder = new StringBuilder();
            boolean first = true;

            for (String n : args) {
                if (!first) {
                    builder.append(", ");
                }
                builder.append(n);
                first = false;
            }

            name = builder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}