public class printMaze{
    public static void main(String[] args) {
        maze("", 3, 3);
    }

    public static void maze(String p, int r,int c) {

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            maze(p+"d",r-1,c-1);
        }
        if(r>1){
            maze(p+"D", r-1,c);
        }
        if(c>1){
            maze(p+"R", r,c-1);
        }
}}