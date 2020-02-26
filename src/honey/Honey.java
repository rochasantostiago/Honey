package honey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.OutputStream;

public class Honey 
{
    public static void main(String[] args) 
    {
        try 
        {
            Functions g = new Functions();
            Functions p = new Functions();
            Functions d = new Functions();   
            //p.postr(777, "Tiago", "Santos", "tiago@santos.com", "7777777777");
            //d.deletr(777);
            //g.getr();
            g.getr(777);
            p.patchr(777, "Tiago", "Santos", "tiago@santos.com", "999");
	} 
        catch(Exception e) 
        {
            e.printStackTrace();
	}
    }
} 