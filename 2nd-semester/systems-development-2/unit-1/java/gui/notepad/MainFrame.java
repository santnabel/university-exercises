
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.net.URI;

public class MainFrame extends JFrame
{
    
    private JTextArea txtContent;
    private JMenuItem itemNew;
    private JMenuItem itemOpen;
    private JMenuItem itemSave;
    private JMenuItem itemExit;
    private JMenuItem itemWarp;
    private JMenuItem itemFont;
    private JMenuItem itemColour;

    // Constructor.
    public MainFrame()
    {

        // Window.
        setSize(600, 400);
        setTitle("Notepad");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Menu bar.
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuFormat = new JMenu("Format");
        JMenuItem menuHelp = new JMenuItem("Help");
        menuBar.add(menuFile);
        menuBar.add(menuFormat);
        menuBar.add(menuHelp);
        setJMenuBar(menuBar);

        // Items for 'File' menu bar.
        itemNew = new JMenuItem("New");
        itemOpen = new JMenuItem("Open");
        itemSave = new JMenuItem("Save");
        itemExit = new JMenuItem("Exit");
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemExit);

        // Items for 'Format' menu bar.
        itemWarp = new JMenuItem("Word Warp");
        itemFont = new JMenuItem("Font");
        itemColour = new JMenuItem("Colour");
        menuFormat.add(itemWarp);
        menuFormat.add(itemFont);
        menuFormat.add(itemColour);

        // Text area.
        txtContent = new JTextArea();
        txtContent.setColumns(20);
        txtContent.setRows(5);
        txtContent.setFont(new java.awt.Font("Times New Roman", 0, 15));
        add(txtContent);
        
        // Scroll pane.
        JScrollPane scrollPane = new JScrollPane(txtContent);
        add(scrollPane);

        // Actions.
        itemNew.addActionListener(e-> newFile());
        itemOpen.addActionListener(e-> openFile());
        itemSave.addActionListener(e-> saveFile());
        itemExit.addActionListener(e-> exitFile());
        itemWarp.addActionListener(e-> wordWarp());
        itemFont.addActionListener(e-> fontSelector());
        itemColour.addActionListener(e-> colourSelector());
        menuHelp.addActionListener(e-> helpMessage());

        setVisible(true);

    }

    // Main method.
    public static void main(String[] args)
    {
        
        SwingUtilities.invokeLater(() -> new MainFrame());

    }

    // Methods.
    private void newFile()
    {
        
        int option = JOptionPane.showConfirmDialog(null, "Are you sure?");

        if (option == JOptionPane.YES_OPTION)     
        {
    
            txtContent.setText("");
        
        }
  
    }

    private void openFile()
    {

        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION)
        {

            File file = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file)))
            {

                StringBuilder content = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null)
                {

                    content.append(line + "\n");

                }

                txtContent.setText(content.toString());

            }
            catch (Exception ex)
            {

                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);


            }

        }

    }

    private void saveFile() {
        
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION)
        {

            File file = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
            {

                writer.write(txtContent.getText());
                JOptionPane.showMessageDialog(this, "File saved");

            } 
            catch (IOException ex)
            {

                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

    }

    private void exitFile()
    {

        int option = JOptionPane.showConfirmDialog(null, "WARNING!\n If you haven't saved any of the information in your file you'll loose it.\n You want to continue?");

        if (option == JOptionPane.YES_OPTION)
        {
            
            System.exit(0);

        }

    }

    private void wordWarp()
    {

        if (txtContent.getLineWrap() == true)
        {

            txtContent.setLineWrap(false);

        }
        else
        {

            txtContent.setLineWrap(true);

        }

    }

    private void fontSelector()
    {

        // Vi que el JFontChooser lleva sin soporte desde el 2008 creo. Tambien vi que esta la opcion de instalar librerias de terceros pero la verdad preferi pedirle ayuda a la IA.

        JDialog dialog = new JDialog(this, "Font");
        dialog.setSize(380, 110);
        dialog.setLocationRelativeTo(this);
        dialog.setLayout(new java.awt.FlowLayout());


        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox<String> fontFamily = new JComboBox<>(fonts);
        JComboBox<String> fontStyle = new JComboBox<>(new String[] {"Plain", "Bold", "Italic"});
        JComboBox<Integer> fontSize = new JComboBox<>(new Integer[] {8, 12, 16, 20, 24, 26, 30});

        JButton btnApply = new JButton("Apply");
        btnApply.addActionListener(e-> 
        {

        String name = (String) fontFamily.getSelectedItem();
        int style = fontStyle.getSelectedIndex();
        int size = (Integer) fontSize.getSelectedItem();
        txtContent.setFont(new java.awt.Font(name, style, size));
        dialog.dispose();

        });
        
        dialog.add(fontFamily);
        dialog.add(fontStyle);
        dialog.add(fontSize);
        dialog.add(btnApply);
        dialog.setVisible(true);

    }

    private void colourSelector()
    {

        Color colour = JColorChooser.showDialog(null, "Colour", Color.BLACK);
        txtContent.setForeground(colour);

    }

    private void helpMessage()
    {

        int option = JOptionPane.showOptionDialog(this, "Need some help? Watch this video: ", "Help", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null
        , new String[] {"https://www.youtube.com/watch?v=bk5gf9BjeDY"}, "Watch Video");

        if (option == 0)
        {

            try
            {
               
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=bk5gf9BjeDY"));

            }
            catch (Exception exception)
            {

                JOptionPane.showMessageDialog(this, "Error.");

            }

        }

    }

}
