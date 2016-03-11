package chapter00;

import java.io.*;
/*
 *  Java IO Stream ×Ü½á 
 *  ²Î¿¼ http://blog.csdn.net/icyfire0105/article/details/2229485
 * 
1. Creat node stream;
2. Upgrade node stream to processing stream if necessary
3. Use the methods in the stream object to read or write
4. Close the stream and release the resource
--------------------------------------------------------
1. Create InputStream/Reader
2. Upgrade to Buffered
3. Use readLine()
   While((str=in.readln())!=null)
4. close()
--------------------------------------------------------
1. Create OutputStream/Writer
2. Upgrade to PrintWriter
3. Use println()
4. close()
*/
public class IOProcessSample{

 public static void main(String[] args) {
  //Create a file based on the first command-line argument to the program
  File file= new File(args[0]);
  //Create buffered reader from the standard input
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
  System.out.println("Press ctr-d or ctr-z to end");
  String str;
  try{
   //Create a print write to write on a file
   //PrintWriter is required to handled the IO exception
   PrintWriter out= new PrintWriter(file);
   //Read from the standard input and write to the file
   while((str=in.readLine())!=null){
    out.println(str);
   }
   //close the stream and release the resource
   in.close();
   out.close();
  }
  catch(FileNotFoundException e){
   System.err.println("File not found in part 1 : "+file);
  }
  catch (IOException e){
   e.printStackTrace();
  }
  finally{
   System.out.println("-----------Part1 is ended-----------------------");
  }
  //////////////////////////////////////////////////////////////////////////////
  try{
   //Create a buffer reader from a file
   in=new BufferedReader(new FileReader(file));
   //Read the file and print the content on the screen.
   while((str=in.readLine())!=null){
    System.out.println(str);
   }
   //close the stream and release the resource
   in.close();
  }
  catch (FileNotFoundException e){
   System.err.println("File not found in part 2: "+file);
  }
  catch (IOException e){
   e.printStackTrace();
  }
  finally{
   System.out.println("----------------------The End -------------------------");
  }
 }
}