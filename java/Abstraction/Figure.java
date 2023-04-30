package Abstraction;

abstract class Figure {
    protected int dimension;

    public void dimensions(int value){
        dimension = value;
        System.out.println(dimension);
    }
    
    abstract void draw();
    abstract void resize();
   
}
