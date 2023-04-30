public class Cuboid {
    int width; 
    int height; 
    int depth;
    Cuboid(int width , int height , int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Cuboid(int width , int height){
        this.width = width;
        this.height = height;
        this.depth = 10;
    }
    Cuboid(int dimension){
        width =dimension;
        height = dimension;
        depth =dimension;
    }
    Cuboid(){
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }
    int volume(){
        return width*height*depth;
    }
    public static void main(String args[]){
        int volume;
        Cuboid cuboid1 = new Cuboid (11,22,13);
        volume = cuboid1.volume();
        System.out.println(volume);

        Cuboid cuboid2 = new Cuboid (11,22);
        volume = cuboid2.volume(); 
        System.out.println(volume);

        Cuboid cube = new Cuboid (5);
        volume = cube.volume();
        System.out.println(volume);

        Cuboid defaCuboid = new Cuboid ();
        volume = defaCuboid.volume();
        System.out.println(volume);
    }
}
