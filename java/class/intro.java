public class intro{
    public static void main(String args[]){
        dimension mydimension=new dimension();
        mydimension.width=34;
        mydimension.height=24;
        mydimension.length=12;
        double vol=mydimension.volume();
        System.out.println("The vloume is :"+vol);
    }

}
class dimension{
    int width;
    int height;
    int length;
  double volume(){
    return width*height*length;
  }
}