package javatutorial.javamail;

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThisShouldBeSent {

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

}
