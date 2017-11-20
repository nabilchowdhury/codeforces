import java.util.*;

/**
 * Created by Nabillionaire on 8/28/17.
 */
public class foobar {

    static final int boardSize = 8;

    static int encode(int x, int y) {
        if (x < 0 || x >= boardSize || y < 0 || y >= boardSize) return -1;
        return x * boardSize + y;
    }

    static int[] decode(int p) {
        int x = p / boardSize;
        int y = p - x * boardSize;
        return new int[]{x, y};
    }

    public static int answer(int src, int dest) {

        int size = boardSize * boardSize;

        if (src < 0 || src >= size || dest < 0 || dest >= size) return -1;
        if (src == dest) return 0;

        // Dijistra

        boolean[] seen = new boolean[size];
        int[] distances = new int[size];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[src] = 0;

        for (int i = 0; i < size; i++) {

            // find min neighbor
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < size; j++) {
                if (!seen[j] && distances[j] < minValue) {
                    minValue = distances[j];
                    minIndex = j;
                }
            }

            if(minIndex == dest) break;

            seen[minIndex] = true;

            // go through all 8 neighbors
            int[] pos = decode(minIndex);
//            System.out.println(pos[0] + " " + pos[1]);
            int[] neighbors = { encode(pos[0] - 2, pos[1] - 1),
                                encode(pos[0] - 2, pos[1] + 1),
                                encode(pos[0] + 2, pos[1] - 1),
                                encode(pos[0] + 2, pos[1] + 1),
                                encode(pos[0] - 1, pos[1] - 2),
                                encode(pos[0] + 1, pos[1] - 2),
                                encode(pos[0] - 1, pos[1] + 2),
                                encode(pos[0] + 1, pos[1] + 2)};

            for (int neighbor : neighbors) {
//                System.out.print(neighbor + " ");
                if (neighbor >= 0 && neighbor < size && !seen[neighbor] && (distances[minIndex] + 1 < distances[neighbor])) {
                    distances[neighbor] = distances[minIndex] + 1;
                }
            }

//            System.out.println(Arrays.toString(seen));
//            System.out.println(Arrays.toString(distances));
//            System.out.println();

        }

        return distances[dest];
    }

    public static void main(String[] args) {

        System.out.println(answer(19, 37));
    }

}
