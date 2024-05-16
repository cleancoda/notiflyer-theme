package org.notiflyer;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import java.awt.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Get the UIDefaults object
        UIDefaults defaults = UIManager.getDefaults();

        // Get the set of keys
        Set<Object> keys = defaults.keySet();

        // Convert the set to a list
        List<Object> keyList = new ArrayList<>(keys);

        // Sort the list
        Collections.sort(keyList, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        // Print all the keys
        for (Object key : keyList) {
            System.out.println(key);
        }

        // Set the look and feel
        // try {
        //     for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        //         if ("Nimbus".equals(info.getName())) {
        //             UIManager.setLookAndFeel(info.getClassName());
        //             break;
        //         }
        //     }
        // } catch (Exception e) {
        //     // If Nimbus is not available, fall back to cross-platform
        //     try {
        //         UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        //     } catch (Exception ex) {
        //         // Not worth handling
        //     }
        // }

        // Set custom theme
        // UIManager.put("control", new Color(128, 128, 128));
        // UIManager.put("info", new Color(128, 128, 128));
        // UIManager.put("nimbusBase", new Color(18, 30, 49));
        // UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
        // UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
        // UIManager.put("nimbusFocus", new Color(115, 164, 209));
        // UIManager.put("nimbusGreen", new Color(176, 179, 50));
        // UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
        // UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
        // UIManager.put("nimbusOrange", new Color(191, 98, 4));
        // UIManager.put("nimbusRed", new Color(169, 46, 34));
        // UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
        // UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
        // UIManager.put("text", new Color(230, 230, 230));

        // Create and show a sample frame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    FlatDraculaIJTheme.setup();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                JFrame frame = new JFrame("Custom Theme");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800,800);

                UIManager.put("Panel.background", Color.decode("#2b283e"));
               
                
                // Add GUI components
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Hello, World!");
                JButton button = new JButton("Click Me");
                JTextField textField = new JTextField(10);
                JCheckBox checkBox = new JCheckBox("Check Me");
                JRadioButton radioButton = new JRadioButton("Select Me");
                JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
                JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3"});
                JTextArea textArea = new JTextArea(5, 20);
                JScrollPane scrollPane = new JScrollPane(textArea);
                JPasswordField passwordField = new JPasswordField(10);
                JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

                // Increase the scaling of the components
                float scalingFactor = 1.5f;
                Font currentFont = label.getFont();
                Font newFont = currentFont.deriveFont(currentFont.getSize() * scalingFactor);
                label.setFont(newFont);
                button.setFont(newFont);
                textField.setFont(newFont);
                checkBox.setFont(newFont);
                radioButton.setFont(newFont);
                comboBox.setFont(newFont);
                list.setFont(newFont);
                textArea.setFont(newFont);
                passwordField.setFont(newFont);
                slider.setFont(newFont);
                

                panel.add(passwordField);
                panel.add(slider);
                panel.add(label);
                panel.add(button);
                panel.add(textField);
                panel.add(checkBox);
                panel.add(radioButton);
                panel.add(comboBox);
                panel.add(list);
                panel.add(scrollPane);
                
                frame.add(panel);
                frame.setVisible(true);


            }
        });
    }
}
