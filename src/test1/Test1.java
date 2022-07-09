
package test1;

import java.awt.Desktop;
import java.net.URI;

public class Test1 {


    public static void main(String[] args) throws Exception {
        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
    }
  
}
