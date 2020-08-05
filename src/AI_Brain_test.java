import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AI_Brain_test {
    public static int first_move[]= {5,3,5,7,9,3,5,9,5};
    public static int pos1=0,pos2=0,count=0;
    public static int[][] second_move ={{1,2,3},{1,3,2},{1,4,7},{1,7,4},{1,8,7},{1,9,4}
            ,{1,6,7}//6//,{1,6,3} will block

            ,{2,1,5},{2,4,5},{2,5,8},{2,7,1},{2,8,5},{2,9,8}
            ,{2,6,7}//13//,{2,6,5} will block

            ,{3,1,2},{3,2,1},{3,6,9},{3,7,4},{3,8,9},{3,9,6}
            ,{3,4,9}//20//,{3,4,1} will block

            ,{4,1,5},{4,3,6},{4,5,6},{4,6,5},{4,8,5},{4,9,5}
            ,{4,2,3}//27//,{4,2,5} will block

            ,{5,2,8},{5,3,7},{5,4,6},{5,6,4},{5,7,3},{5,8,2}
            ,{5,1,8}//34//,{5,1,3} will block

            ,{6,1,5},{6,2,5},{6,4,5},{6,5,4},{6,7,5},{6,9,5}
            ,{6,8,7}//41//,{6,8,5} will block

            ,{7,1,4},{7,3,2},{7,4,1},{7,6,9},{7,8,9},{7,9,8}
            ,{7,2,9}//48//,{7,2,1} will block

            ,{8,1,5},{8,2,5},{8,3,5},{8,5,2},{8,6,5},{8,7,5}
            ,{8,4,1}//55//,{8,4,5} will block

            ,{9,1,2},{9,3,6},{9,4,7},{9,6,3},{9,7,8},{9,8,7}
            ,{9,2,7}};//62//,{9,2,3}}; will block
    
    
    public static void first_move_dicision() 
    {
        first_move[0]=5;
        first_move[1]=3;
        first_move[2]=5;
        first_move[3]=7;
        first_move[4]=9;
        first_move[5]=3;
        first_move[6]=5;
        first_move[7]=9;
        first_move[8]=5;
        
        int flag=0;
        for(int i=0;i<9;i++)
        {
            pos1=0;
            if(Application.btn_array[i].getText()=="o")
            {
                flag=i;
                
                pos1=i;
                break;
            }
        }
        
        Application.btn_array[first_move[flag]-1].setText("x");
        Application.btn_array[first_move[flag]-1].setBackground(new Color(255,0,0));
    }
    
    public static void second_move_decision()
    {
        
        position();
        location();
    }
    
    public static void position()
    {
        pos2=0;
        for(int i=0;i<9;i++)
        {
            if(Application.btn_array[i].getText()=="o")
            {
                if(pos1!=i)
                {
                    pos2=i;
                    break;
                }
            }
        }
    }
    
        public static void location()
    {
        for(int i=0;i<63;i++)
            {
            if(second_move[i][0]==(pos1+1) && second_move[i][1]==(pos2+1))
            {
                Application.btn_array[second_move[i][2]-1].setText("x");
                Application.btn_array[second_move[i][2]-1].setBackground(new Color(255,0,0));
            }
        }
    }
    
    public static boolean block_user_test()
    {
        if(finishing_move()!=true)
        {
            if(Application.btn_1.getText()=="o" && Application.btn_2.getText()=="o" && Application.btn_3.getText()=="")
            {
                    block_user(3);
                    return true;
            }
            else if(Application.btn_2.getText()=="o" && Application.btn_3.getText()=="o" && Application.btn_1.getText()=="")
            {
                    block_user(1);
                    return true;
            }
            else if(Application.btn_1.getText()=="o" && Application.btn_3.getText()=="o" && Application.btn_2.getText()=="")
            {
                    block_user(2);
                    return true;
            }
            else if(Application.btn_4.getText()=="o" && Application.btn_5.getText()=="o" && Application.btn_6.getText()=="")
            {
                    block_user(6);
                    return true;
            }
            else if(Application.btn_4.getText()=="o" && Application.btn_6.getText()=="o" && Application.btn_5.getText()=="")
            {
                    block_user(5);
                    return true;
            }
            else if(Application.btn_5.getText()=="o" && Application.btn_6.getText()=="o" && Application.btn_4.getText()=="")
            {
                    block_user(4);
                    return true;
            }
            else if(Application.btn_7.getText()=="o" && Application.btn_8.getText()=="o" && Application.btn_9.getText()=="")
            {
                    block_user(9);
                    return true;
            }
            else if(Application.btn_7.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_8.getText()=="")
            {
                    block_user(8);
                    return true;
            }
            else if(Application.btn_8.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_7.getText()=="")
            {
                    block_user(7);
                    return true;
            }
            else if(Application.btn_1.getText()=="o" && Application.btn_4.getText()=="o" && Application.btn_7.getText()=="")
            {
                    block_user(7);
                    return true;
            }
            else if(Application.btn_1.getText()=="o" && Application.btn_7.getText()=="o" && Application.btn_4.getText()=="")
            {
                    block_user(4);
                    return true;
            }
            else if(Application.btn_4.getText()=="o" && Application.btn_7.getText()=="o" && Application.btn_1.getText()=="")
            {
                    block_user(1);
                    return true;
            }
            else if(Application.btn_2.getText()=="o" && Application.btn_5.getText()=="o" && Application.btn_8.getText()=="")
            {
                    block_user(8);
                    return true;
            }
            else if(Application.btn_2.getText()=="o" && Application.btn_8.getText()=="o" && Application.btn_5.getText()=="")
            {
                    block_user(5);
                    return true;
            }
            else if(Application.btn_5.getText()=="o" && Application.btn_8.getText()=="o" && Application.btn_2.getText()=="")
            {
                    block_user(2);
                    return true;
            }
            else if(Application.btn_3.getText()=="o" && Application.btn_6.getText()=="o" && Application.btn_9.getText()=="")
            {
                    block_user(9);
                    return true;
            }
            else if(Application.btn_3.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_6.getText()=="")
            {
                    block_user(6);
                    return true;
            }
            else if(Application.btn_6.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_3.getText()=="")
            {
                    block_user(3);
                    return true;
            }
            
            else if(Application.btn_1.getText()=="o" && Application.btn_5.getText()=="o" && Application.btn_9.getText()=="")
            {
                    block_user(9);
                    return true;
            }
            else if(Application.btn_1.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_5.getText()=="")
            {
                    block_user(5);
                    return true;
            }
            else if(Application.btn_5.getText()=="o" && Application.btn_9.getText()=="o" && Application.btn_1.getText()=="")
            {
                    block_user(1);
                    return true;
            }
            else if(Application.btn_3.getText()=="o" && Application.btn_5.getText()=="o" && Application.btn_7.getText()=="")
            {
                    block_user(7);
                    return true;
            }
            else if(Application.btn_3.getText()=="o" && Application.btn_7.getText()=="o" && Application.btn_5.getText()=="")
            {
                    block_user(5);
                    return true;
            }
            else if(Application.btn_5.getText()=="o" && Application.btn_7.getText()=="o" && Application.btn_3.getText()=="")
            {
                block_user(3);  
                return true;
            }
            else 
            {
                return false;
            }
        }
        
        else
        {
            return false;
        }
    }
    
    public static void block_user(int n)
    {
        if(Application.check_empty(n)==true)
        {
            switch(n)
            {
            case 1: Application.btn_1.setBackground(new Color(255,0,0));
                    Application.btn_1.setText("x");
                    Application.btn_1.setEnabled(false);
                break;
            case 2: Application.btn_2.setBackground(new Color(255,0,0));
                    Application.btn_2.setText("x");
                    Application.btn_2.setEnabled(false);
                break;
            case 3: Application.btn_3.setBackground(new Color(255,0,0));
                    Application.btn_3.setText("x");
                    Application.btn_3.setEnabled(false);
                break;
            case 4: Application.btn_4.setBackground(new Color(255,0,0));
                    Application.btn_4.setText("x");
                    Application.btn_4.setEnabled(false);
                break;
            case 5: Application.btn_5.setBackground(new Color(255,0,0));
                    Application.btn_5.setText("x");
                    Application.btn_5.setEnabled(false);
                break;
            case 6: Application.btn_6.setBackground(new Color(255,0,0));
                    Application.btn_6.setText("x");
                    Application.btn_6.setEnabled(false);
                break;
            case 7: Application.btn_7.setBackground(new Color(255,0,0));
                    Application.btn_7.setText("x");
                    Application.btn_7.setEnabled(false);
                break;
            case 8: Application.btn_8.setBackground(new Color(255,0,0));
                    Application.btn_8.setText("x");
                    Application.btn_8.setEnabled(false);
                break;
            case 9: Application.btn_9.setBackground(new Color(255,0,0));
                    Application.btn_9.setText("x");
                    Application.btn_9.setEnabled(false);
                break;
            
            default : JOptionPane.showMessageDialog(null, "Brain Malfunctioning");
            }
        }
        
    }
    
    public static boolean finishing_move() 
    {
        if(Application.btn_1.getText()=="x" && Application.btn_2.getText()=="x")
        {
            if(Application.check_empty(3))
            {
                block_user(3);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_2.getText()=="x" && Application.btn_3.getText()=="x")
        {
            if(Application.check_empty(1))
            {
                block_user(1);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_1.getText()=="x" && Application.btn_3.getText()=="x")
        {
            if(Application.check_empty(2))
            {
                block_user(2);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_4.getText()=="x" && Application.btn_5.getText()=="x")
        {
            if(Application.check_empty(6))
            {
                block_user(6);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_4.getText()=="x" && Application.btn_6.getText()=="x")
        {
            if(Application.check_empty(5))
            {
                block_user(5);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_5.getText()=="x" && Application.btn_6.getText()=="x")
        {
            if(Application.check_empty(4))
            {
                block_user(4);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_7.getText()=="x" && Application.btn_8.getText()=="x")
        {
            if(Application.check_empty(9))
            {
                block_user(9);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_7.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(8))
            {
                block_user(8);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_8.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(7))
            {
                block_user(7);
                return true;
            }
            else
            {
                return false;
            }
        }
        
        else if(Application.btn_1.getText()=="x" && Application.btn_4.getText()=="x")
        {
            if(Application.check_empty(7))
            {
                block_user(7);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_1.getText()=="x" && Application.btn_7.getText()=="x")
        {
            if(Application.check_empty(4))
            {
                block_user(4);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_4.getText()=="x" && Application.btn_7.getText()=="x")
        {
            if(Application.check_empty(1))
            {
                block_user(1);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_2.getText()=="x" && Application.btn_5.getText()=="x")
        {
            if(Application.check_empty(8))
            {
                block_user(8);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_2.getText()=="x" && Application.btn_8.getText()=="x")
        {
            if(Application.check_empty(5))
            {
                block_user(5);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_5.getText()=="x" && Application.btn_8.getText()=="x")
        {
            if(Application.check_empty(2))
            {
                block_user(2);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_3.getText()=="x" && Application.btn_6.getText()=="x")
        {
            if(Application.check_empty(9))
            {
                block_user(9);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_3.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(6))
            {
                block_user(6);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_6.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(3))
            {
                block_user(3);
                return true;
            }
            else
            {
                return false;
            }
        }
        
        else if(Application.btn_1.getText()=="x" && Application.btn_5.getText()=="x")
        {
            if(Application.check_empty(9))
            {
                block_user(9);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_1.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(5))
            {
                block_user(5);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_5.getText()=="x" && Application.btn_9.getText()=="x")
        {
            if(Application.check_empty(1))
            {
                block_user(1);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_3.getText()=="x" && Application.btn_5.getText()=="x")
        {
            if(Application.check_empty(7))
            {
                block_user(7);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_3.getText()=="x" && Application.btn_7.getText()=="x")
        {
            if(Application.check_empty(5))
            {
                block_user(5);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Application.btn_5.getText()=="x" && Application.btn_7.getText()=="x")
        {
            if(Application.check_empty(3))
            {
                block_user(3);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
}
