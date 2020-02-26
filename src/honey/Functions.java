package honey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.OutputStream;

public class Functions 
{

    public Functions() 
    {
        
    }
    
    public void getr()
    {
        try 
        {
            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }

            conn.disconnect();

	} 
        catch (MalformedURLException e) 
        {
            e.printStackTrace();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    public void postr(int id, String fn, String ln, String em, String ph)
    {
        try 
        {
            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"employeeId\":" + id + "," + "\"firstName\":" + "\"" + fn + "\"" + "," + "\"lastName\":" + "\"" + ln + "\"" + "," + "\"email\":" + "\"" + em + "\"" + "," + "\"phone\":" + "\"" + ph + "\"" + "}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }
            
            conn.disconnect();
	} 
        catch (MalformedURLException e) 
        {
            e.printStackTrace();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    public void deletr(int id)
    {
        try 
        {
            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees/" + id);
            System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");
            conn.setRequestProperty("Accept", "*/*");

            if (conn.getResponseCode() != 200) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }

            conn.disconnect();

	} 
        catch (MalformedURLException e) 
        {
            e.printStackTrace();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    public void getr(int id)
    {
        try 
        {
            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees/" + id);
            System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "*/*");

            if (conn.getResponseCode() != 200) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }

            conn.disconnect();

	} 
        catch (MalformedURLException e) 
        {
            e.printStackTrace();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    public void patchr(int id, String fn, String ln, String em, String ph)
    {
        try 
        {
            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees/" + id);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"firstName\":" + "\"" + fn + "\"" + "," + "\"lastName\":" + "\"" + ln + "\"" + "," + "\"email\":" + "\"" + em + "\"" + "," + "\"phone\":" + "\"" + ph + "\"" + "}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            
            while ((output = br.readLine()) != null) 
            {
                System.out.println(output);
            }
            
            conn.disconnect();
	} 
        catch (MalformedURLException e) 
        {
            e.printStackTrace();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
}
