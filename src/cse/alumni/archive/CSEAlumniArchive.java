/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.alumni.archive;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Properties;
import javax.swing.UIManager;

/**
 *
 * @author Siyam
 */
public class CSEAlumniArchive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Metal".equals(info.getName())) {
                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 break;
                 }*/
                Properties props = new Properties();
                props.put("logoString", "my company");
                HiFiLookAndFeel.setCurrentTheme(props);
//                  UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//                  UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//                  UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
//                   UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//                  UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//                  UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
//                   UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
//                   UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                  UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//                 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//                   UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
//                   UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        // TODO code application logic here
        MainFrame mainFrame = new MainFrame();
//        mainFrame.setAlwaysOnTop(true);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dim.getWidth() - mainFrame.getWidth()) / 2);
        int y = 100;
        mainFrame.setLocation(x, y);

    }

}
