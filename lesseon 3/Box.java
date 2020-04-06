
public class Box
{
    private int _length;
    private int _width;
    private int _height;
    private final int DEFAULT_LENGTH=1; 
    private final int DEFAULT_WIDTH=1; 
    private final int DEFAULT_HEIGHT=1; 
    public Box(int len,int wid,int hei){
        if(len>0)
            _length=len;
        else 
            _length=DEFAULT_LENGTH;
        if(wid>0)
            _width=wid;
        else 
            _width=DEFAULT_WIDTH;
        if(hei>0)
            _height=hei;
        else 
            _height=DEFAULT_HEIGHT;
    }

    public Box(){
        _length=DEFAULT_LENGTH;
        _width=DEFAULT_WIDTH;
        _height=DEFAULT_HEIGHT;
    }

    public Box(int num){
        if(num>0)
        {
            _length=num;
            _width=num;
            _height=num;
        }
        else
        {
            _length=DEFAULT_LENGTH;
            _width=DEFAULT_WIDTH;
            _height=DEFAULT_HEIGHT;
        }
    }

    public  void   setLength(int newLength){
        if(newLength>0)
            _length=newLength;
    }

    public int getLength(){
        return _length;
    }

    

    public int calculateVolume(){
        return _length*_width*_height;
    }

    public int   calculateSurfaceArea(){
        return _length*_width*2+_width*_height*2+_height*_length*2;
    }

    
    
    
    
    
    
    public boolean allEqualSize(int num){
        return(_length==num&&_width==num&&_height==num);

    }
    
    
    public void addToAll(int num){
        if(num>0)
        {
            _length+=num;
            _width+=num;
            _height+=num;
        }}
}