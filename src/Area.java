public class Area {
    private int lenth,width;
     Area(int lenth,int width) {
         this.lenth = lenth;
         this.width = width;

     }
     public void getArea() {
         int area = lenth * width;
         System.out.println("Area  " + area);
     }
}
class Test {
    public static void main(String[] args) {
        Area a = new Area(10,5);
        a.getArea();
    }
}
