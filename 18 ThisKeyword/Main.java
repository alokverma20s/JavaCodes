class Box {
    private  int l, b, h;
    public void  setDimension(int l, int b, int h){ //instance member function
        this.l=l;  this.b=b; this.h=h;
    }
}
public class Main {
    public static void main(String[] args) {  //static member function
        Box b1 = new Box();
        b1.setDimension(12, 10, 5);
    }
}
