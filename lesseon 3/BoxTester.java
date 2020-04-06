
public class BoxTester
{
    public static void main(String []args){
        Box phone=new Box(15,5,1);
        Box book=new Box(20,10,5);
        Box defaultBox=new Box();
        defaultBox.setLength(10);
        Box dice=new Box(3);
        
        int phoneVolume=phone.calculateVolume();
        int bookVolume=book.calculateVolume();
        System.out.println("phone volume is:"+phoneVolume);
        System.out.println("book volume is:"+bookVolume);
        int phoneSurfaceArea=phone.calculateSurfaceArea();
        int bookSurfaceArea=book.calculateSurfaceArea();
        System.out.println("phone surface area is:"+phoneSurfaceArea);
        System.out.println("book surface area is:"+bookSurfaceArea);
        phone.setLength(8);
        int phoneLength=phone.getLength();

       
    }
}
