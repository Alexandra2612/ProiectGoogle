package builder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void write(UserAccount useraccount){
        try {
            File myFile = new File("users.txt");
            myFile.createNewFile();
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("users.txt", true)
            );
            writer.write(useraccount.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void removeAccounts(){
        FileWriter writer;
        try {
            writer = new FileWriter("users.txt");
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        UserAccount useraccount1=new UserAccount.UserBuilder("AlexandraHertanu","123456","alexandra.hertanu@yahoo.com")
                .setGender("female")
                .setNickname("Ale")
                .build();
        UserAccount useraccount2=new UserAccount.UserBuilder("Tudor","qwertyuiop","vlad.tudor@yahoo.com")
                .setGender("male")
                .setPhonenumber("09865367")
                .build();
        removeAccounts();
        write(useraccount1);
        write(useraccount2);
        //A user can create an account.If the user does not want to share sensitive data(gender,nickname,phone number) he doesn't have to.
        //That's why the builder only requires the username,password and email and the other variables are set through setters
    }
}
