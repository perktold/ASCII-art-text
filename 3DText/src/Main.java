import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "");
        while(!validString(input)){
            //clearConsole();
            input = (String) JOptionPane.showInputDialog(null, "bitte nur Buchstaben und Leerstellen", "Eingabe", 1, null, null, input);
        }
        clearConsole();
        input = input.toLowerCase();
        MultilineString multilineString = new MultilineString(input);
        multilineString.print();
    }
    public static boolean validString(String input){
        try{
            MultilineString multilineString = new MultilineString(input);
            multilineString.print();
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
        return true;
    }
    public static void clearConsole(){
        for(int i = 0; i < 25; i++){
            System.out.println();
        }
    }
}
