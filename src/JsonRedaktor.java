import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonRedaktor extends JFrame {
    private JPanel mainPanel;
    private JButton openButton;
    private JButton saveButton;
    private JEditorPane JsonPole;
    private JButton addButton;
    private JEditorPane cUsersUser1IdeaProjectsTest;

    public JsonRedaktor(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,600);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String soderjimoe = new String( Files.readAllBytes(Paths.get("fruit.json")));
                    JsonPole.setText(soderjimoe);
                } catch (IOException e1) {
                    System.out.println("Произошла ошибка при открытии");
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String izPolia = JsonPole.getText();

                    Writer writer = new FileWriter("fruit.json", false);
                    writer.write(izPolia);
                    writer.flush();



                } catch (IOException e1) {
                    System.out.println("Произошла ошибка при сохранении");
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    JSONObject jo = new JSONObject();

                } catch (IOException e1) {
                    System.out.println("Произошла ошибка при работе с JSON");
                }
            }
        });

    }

}
