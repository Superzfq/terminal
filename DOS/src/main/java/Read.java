import java.io.*;
public class Read {
        public static void main(String[] args) {

            System.out.println("ReadTest, Please Enter your password!");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            File directory  = new File("");

            try{
                String name = bufferedReader.readLine();
                System.out.println("ReadTest Output:"+name);
                if(name.equals("ls"))
                {
                    File[] files = directory.listFiles();
                    System.out.println("you got ls, show all the documents!");
                    for(File file: files)
                    {
                        System.out.println(file);
                    }
                }
                else if(name.equals("pwd") )
                {
                    System.out.println("show this directory path");
                    System.out.println(directory.getCanonicalPath());
                }
                else if(name.equals("cd"))
                {

                    System.out.println("pass to the is directory path");
                }
                else
                {
                    String[] newStr = name.split("\\s+");
                    if (newStr[0].equals("cd"))
                    {
                        System.out.println("xxxx");
                    }
                    System.out.println("I love dkkkk");
                }

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

        }
    }
