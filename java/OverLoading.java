public class OverLoading {
    public int multiply(int x, int y){
        return(x*y);
    }
    public int multiply(int x , int y , int z){
        return(x*y*z);
    }
    public double multiply(double x , double y){
        return(x*y);
    }
    public static void main (String args[]){
        OverLoading overLoading = new OverLoading();
        System.out.println(overLoading.multiply(10, 45));
        System.out.println(overLoading.multiply(89, 4, 5));
        System.out.println(overLoading.multiply(5.5, 0));
    }
}
