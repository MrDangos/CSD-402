/**
 * @author Hugo Ramirez Jr.
 * @date 2/28/2026
 * Module 9 - SQl GUI
 * @description This file is the GUI for the program that allows the user to interact with
 * the backend of the program. It allows the user to search by ID and update any user's
 * first name, last name, and favorite team.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDBC_GUI extends JFrame{

  SelectData selectData = new SelectData();

  private JButton btnSearch;
  private JButton btnUpdate;
  private JButton btnExit;

  private JTextField txtFieldID;
  private JTextField txtFirstName;
  private JTextField txtLastName;
  private JTextField txtFavoriteTeam;

  private JLabel lblFieldID;
  private JLabel lblFirstName;
  private JLabel lblLastName;
  private JLabel lblFavoriteTeam;

  private ActionListener buttonListener = new ActionListener(){

    public void actionPerformed(ActionEvent e){

      String buttonSelected = ((JButton)e.getSource()).getText();
 
      if(buttonSelected.equals("Search")){
          int id = Integer.parseInt(txtFieldID.getText());
          update(selectData.getSearch(id));
      }
      if(buttonSelected.equals("Update")){

        int id = Integer.parseInt(txtFieldID.getText());
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String favoriteTeam = txtFavoriteTeam.getText();

        update(selectData.updateRecord(id, firstName, lastName, favoriteTeam));
      }

      if(buttonSelected.equals("Exit")){

        shutDown();
      }     
    }
  };

  public JDBC_GUI(){

    super("SQL GUI");

    btnSearch = new JButton("Search");
    btnUpdate = new JButton("Update");
    btnExit = new JButton("Exit");

    txtFieldID = new JTextField("");
    txtFirstName = new JTextField("");
    txtLastName = new JTextField("");
    txtFavoriteTeam = new JTextField("");

    lblFieldID = new JLabel("ID");
    lblFirstName = new JLabel("First Name");
    lblLastName = new JLabel("Last Name");
    lblFavoriteTeam = new JLabel("Favorite Team");

    txtFieldID.setEditable(true);
    txtFirstName.setEditable(true);
    txtLastName.setEditable(true);
    txtFavoriteTeam.setEditable(true);
  }

  public void launchJFrame(){

    // width - height
    setSize(500, 300);
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.white);

    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    getContentPane().add(btnSearch);
    getContentPane().add(btnUpdate);
    getContentPane().add(btnExit);

    getContentPane().add(txtFieldID);
    getContentPane().add(txtFirstName);
    getContentPane().add(txtLastName);
    getContentPane().add(txtFavoriteTeam);

    getContentPane().add(lblFieldID);
    getContentPane().add(lblFirstName);
    getContentPane().add(lblLastName);
    getContentPane().add(lblFavoriteTeam);

    lblFieldID.setBounds(new Rectangle(65, 10, 100, 30));
    lblFirstName.setBounds(new Rectangle(65, 45, 100, 30));
    lblLastName.setBounds(new Rectangle(65, 80, 100, 30));
    lblFavoriteTeam.setBounds(new Rectangle(65, 115, 100, 30));

    txtFieldID.setBounds(new Rectangle(210, 10, 100, 30));
    txtFirstName.setBounds(new Rectangle(210, 45, 100, 30));
    txtLastName.setBounds(new Rectangle(210, 80, 100, 30));
    txtFavoriteTeam.setBounds(new Rectangle(210, 115, 100, 30));

    btnSearch.setBounds(new Rectangle(10, 200, 90, 30));
    btnUpdate.setBounds(new Rectangle(100, 200, 90, 30));
    btnExit.setBounds(new Rectangle(370, 200, 90, 30));

    setVisible(true);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        shutDown();
      }
    });

    btnSearch.addActionListener(buttonListener);
    btnUpdate.addActionListener(buttonListener);
    btnExit.addActionListener(buttonListener);
  }

  private void update(MyRecord record){

    txtFieldID.setText(String.valueOf(record.getFeild_id()));
    txtFirstName.setText(record.getFirstname());
    txtLastName.setText(record.getLastname());
    txtFavoriteTeam.setText(record.getFavoriteteam());
  }

  private void shutDown(){

    int returnVal = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?");

    if(returnVal == JOptionPane.YES_OPTION){

      System.exit(0);
    }
  }

  public static void main(String[] args){

    JDBC_GUI layout = new JDBC_GUI();
    layout.launchJFrame();
    
  }
}