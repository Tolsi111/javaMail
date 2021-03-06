package javatutorial.javamail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThisShouldBeSent {

    public String content = "";
    public ThisShouldBeSent() throws FileNotFoundException {
        File fileToBeSent = new File("C:\\Users\\bacil\\IdeaProjects\\Tutorial\\src\\javatutorial\\javamail\\fileToBeSent.html");
        Scanner myReader = new Scanner(fileToBeSent);
        while (myReader.hasNextLine()){
            content += myReader.nextLine();
        }
        myReader.close();

    }
    /*public String getHtml() throws FileNotFoundException {
        File fileToBeSent = new File("fileToBeSent.html");
        Scanner myReader = new Scanner(fileToBeSent);
        while (myReader.hasNextLine()){
            content = myReader.nextLine();
            System.out.println(content);
        }
        myReader.close();
        return
    }*/

    //public getHtml()

    /*
    public static void main(String[] args) {
        try {
            File fileToBeSent = new File("fileToBeSent.html");
            Scanner myReader = new Scanner(fileToBeSent);
            while (myReader.hasNextLine()){
                String content = myReader.nextLine();
                System.out.println(content);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    */

    /*
    static StringBuilder contentBuilder = new StringBuilder();
    BufferedReader in;
    {
        try {
            in = new BufferedReader(new FileReader("fileToBeSent.html"));
            String str;
            while ((str = in.readLine()) != null){
                System.out.println(str);/////this is for testing
                contentBuilder.append(str);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String content = contentBuilder.toString();

    */
    /*
    static String mesaj = new String("\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\">\n" +
            "    <title>HTML Email base</title>\n" +
            "    <meta name=\"viewport\" content=\"width=device-width\" />\n" +
            "</head>\n" +
            "\n" +
            "<body style=\"margin: 0; padding: 0;\">\n" +
            "<div style=\"margin:auto; max-width: 600px;\">\n" +
            "    <h2 style=\"color:rgb(184, 13, 47); font-family: 'Arial Black'; font: size 74px; line-height: 74px; margin: 0; max-width: 600px; background-color: blueviolet;\">\n" +
            "        Welcome to my collection of dinosaurs</h2>\n" +
            "        <img src=\"https://images.newscientist.com/wp-content/uploads/2020/08/19131539/gpnatp_web.jpg?width=800\"\n" +
            "             style=\"background-color:blueviolet; display: block; max-width: 100%; padding: 12px 0;\" width=\"600\" />\n" +
            "        <p>This is a Diplodocus</p>\n" +
            "</div>\n" +
            "</body>\n" +
            "\n" +
            "</html>");
    */
}
