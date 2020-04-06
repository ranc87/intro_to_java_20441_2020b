
public class Box
{
    private int _lenght;
    private int _width;
    private int _height;
    
    public Box(int len,int wid,int hei)
    {
        if (len>0)
            _lenght=len;
        else
            _lenght=1;
        if (wid>0)
            _width=len;
        else
            _width=1;
        if (hei>0)
            _height=len;
        else
            _height=1;
                
    }
    public int volume()
    {
        int vol  = _lenght * _width * _height;
        return vol;
    }
    
}
