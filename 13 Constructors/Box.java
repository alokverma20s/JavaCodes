public class Box{
    private int  l, b, h;
    public Box(){
        l=10; b= 8; h=4;
    }
    public Box(int L , int B, int H){
        l=L; b= B; h= H;
    }
    public int volume(){
        return l*b*h;
    }
    public static void  main(String[]  args){
        Box b1 = new Box();
        System.out.println(b1.volume());
        Box b2 = new Box(20,5,6);
        System.out.println(b2.volume());
    }
}