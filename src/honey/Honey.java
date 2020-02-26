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
            g.getr();
	} 
        catch(Exception e) 
        {
            e.printStackTrace();
	}
    }
} 