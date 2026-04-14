public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
            }),
            new CharacterPatternMap('P', new String[] {
                " ********",
                " *     * ",
                " *     * ",
                " ********",
                " *       ",
                " *       ",
                " *       "
            }),
            new CharacterPatternMap('S', new String[] {
                " ********",
                " *       ",
                " *       ",
                " ********",
                "        *",
                "        *",
                " ********"
            }),
            new CharacterPatternMap(' ', new String[] {
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', maps);
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] maps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, maps);
    }
}