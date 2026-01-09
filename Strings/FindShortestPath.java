package Strings;

public class FindShortestPath {

    public static float getShortestpath(String path) {

        int x = 0;
        int y = 0;

        for(int i=0 ; i<path.length() ; i++) {
            char dir = path.charAt(i);

            //East
            if (dir == 'E') {
                x++;
            }
            //West
            else if (dir == 'W') {
                x--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //South
            else {
                y--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        float result = (float)Math.sqrt(x2 + y2);

        return result;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestpath(path));
    }
}
