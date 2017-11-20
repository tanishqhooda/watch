//frame 1
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String name=n.getText();
        String d=date.getText();
        String b=begin.getText();
        String c=end.getText();
        String t=topic.getText();
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/calender","root","root");
            Statement stmt = (Statement) con.createStatement();
            String query = "INSERT INTO entry VALUES('"+name+"','"+d+"','"+b+"','"+c+"','"+t+"');";
                     stmt.executeUpdate(query);                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
         }                                        

    private void topicActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Homepage a=new Homepage();
a.setVisible(true);
this.setVisible(false);
    }                                        
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField begin;
    private javax.swing.JTextField date;
    private javax.swing.JTextField end;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField n;
    private javax.swing.JTextField topic;
    // End of variables declaration                   
}
//frame 2
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel model = (DefaultTableModel) 
         xyz.getModel();
        String name1=n1.getText(); 
        System.out.println(name1);
  try
  {
Class.forName("java.sql.DriverManager");
    Connection con = (Connection) 
 DriverManager.getConnection 
("jdbc:mysql://localhost:3306/calender",   
"root", "root");
Statement stmt = (Statement) con.createStatement();
  String query="SELECT * FROM entry where NAME='"+name1+"';";
    System.out.println(query);
     ResultSet rs = stmt.executeQuery(query);
    while(rs.next())
    {
     String Name2   = rs.getString("name");
     String DD = rs.getString("DD");

      String ST  = rs.getString("ST");
      String ET  = rs.getString("ET");
      String Topic  = rs.getString("Topic");
      model.addRow (new Object[] {Name2,DD,ST,ET,Topic});
    }
  }
  catch (Exception e)
  {
    JOptionPane.showMessageDialog (this, e.getMessage());
  }



    }                                           
     //frame 3
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        viewEntry b=new viewEntry();
b.setVisible(true);
this.setVisible(false);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    NewJFrame a=new NewJFrame();
a.setVisible(true);
this.setVisible(false);        
    }      
	//frame 4
 	package calenderpro;

/**
 *
 * @author Tanuj
 */
public class Calenderpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}