import java.util.HashMap;
public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        map.put('P', new String[] {
            " ********",
            " *     * ",
            " *     * ",
            " ********",
            " *       ",
            " *       ",
            " *       "
        });

        map.put('S', new String[] {
            " ********",
            " *       ",
            " *       ",
            " ********",
            "        *",
            "        *",
            " ********"
        });

        map.put(' ', new String[] {
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        });

        return map;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, map);
    }
}