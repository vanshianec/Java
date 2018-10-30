import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        char[][] matrix = new char[size][size];
        String commands[] = reader.readLine().split(", ");
        fillMatrix(reader, size, matrix);

        long length = 1;
        for (String command : commands) {
            String position = getPosition(matrix);
            int row = Integer.parseInt(position.split(" ")[0]);
            int col = Integer.parseInt(position.split(" ")[1]);
            matrix[row][col] = '*';
            switch (command) {
                case "up":
                    if (row == 0) {
                        row = matrix.length - 1;
                    } else {
                        row--;
                    }
                    break;
                case "down":
                    if (row == matrix.length - 1) {
                        row = 0;
                    } else {
                        row++;
                    }
                    break;
                case "right":
                    if (col == matrix[row].length - 1) {
                        col = 0;
                    } else {
                        col++;
                    }
                    break;
                case "left":
                    if (col == 0) {
                        col = matrix[row].length - 1;
                    } else {
                        col--;
                    }
                    break;
            }
            if (matrix[row][col] == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                return;
            } else if (matrix[row][col] == 'f') {
                length++;

            }
            matrix[row][col] = 's';
            boolean foodLeft = checkFoodLeft(matrix);
            if (!foodLeft) {
                System.out.printf("You win! Final snake length is %d%n", length);
                return;
            }
        }

        boolean foodLeft = checkFoodLeft(matrix);
        if (foodLeft) {
            long foodCounter = countFoodLeft(matrix);
            System.out.printf("You lose! There is still %d food to be eaten.%n", foodCounter);
        } else {
            System.out.printf("You win! Final snake length is %d%n", length);
        }

    }

    private static void fillMatrix(BufferedReader reader, int size, char[][] matrix) throws IOException {
        for (int i = 0; i < size; i++) {
            String input = reader.readLine();
            input = input.replaceAll("\\s+", "");
            char[] columns = input.toCharArray();
            for (int j = 0; j < size; j++) {
                matrix[i][j] = columns[j];
            }
        }
    }

    private static String getPosition(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 's') {
                    return String.format("%d %d", row, col);
                }
            }
        }
        return "";
    }

    private static boolean checkFoodLeft(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 'f') {
                    return true;
                }
            }
        }
        return false;
    }

    private static long countFoodLeft(char[][] matrix) {
        long counter = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 'f') {
                    counter++;
                }
            }
        }
        return counter;
    }
}







