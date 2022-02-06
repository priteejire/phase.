
public class Tests implements First,second {

    public void show() 
    {  
        First.super.show(); 
        second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Tests ob = new Tests(); 
        ob.show(); 
    } 
}


