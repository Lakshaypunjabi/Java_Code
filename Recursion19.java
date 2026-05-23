//Place the tiles of size 1xm in a floor of size nxm 

public class Recursion19 {
    public static int placeTiles(int n, int m){
        if(n < m){//Only place horizontally
            return 1;
        }
        if(n == m){//Horizontally and vertically both
            return 2;
        }

        //Vertically
        int vertPlacements = placeTiles(n-m, m);
        //Horizontally
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements+horPlacements;
    }    
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }
}
