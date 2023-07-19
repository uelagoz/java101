public class Main {
    public static void main(String[] args) {
        char[][] b = new char[7][5];

        // "B" harfini oluşturma
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == 0 || i == 3 || i == 6) && j < 4 || j == 4 && (i > 0 && i < 3 || i > 3 && i < 6))
                    b[i][j] = '*';
                else
                    b[i][j] = ' ';
            }
        }

        // "B" harfini ekrana yazdırma
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
