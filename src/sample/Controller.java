package sample;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Controller {
public TextArea text;
public void pressButton(ActionEvent event) throws IOException {
  {
   String s=text.getText();

  File f=new File("Bhuvan.txt");
  FileWriter fw=new FileWriter(f);
   fw.write(s);
  fw.close();
 }

 }
 void textArea(ActionEvent event)
 {

 }

}

