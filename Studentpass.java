import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap:
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class Studentpass {
    public static int numOfStudents = 0;
    private String firstName, lastName, userName, password;
    private int studentNum;

    public int getStudentNum() {
        return studentNum;
    }

    publica void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Studentpass(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = id;
        this.password = generatePassword();
        numOfStudents ++;
        this.studentNum = numOfStudents;
    }

    @Override
    public String toString() {
        return "Name" + this.firstName = " " + this.lastName + ", UserName:" + this.userName + ", Password:" + this.password;
    }
    
    public static String generatePassword() {
        int passwordLength = 12;
        char[] array = new char[passwordLength];
        Random random = new Random();
        for (int i = 0; i < passwordLength; i ++) {
            array[i] = (char) random.nextInt(origin: 33, bound: 127);
        }
        return new String(array);
    }
}
 // use scanner and file reader to pass each character in generated password from txt document with list of acceptable characters
//unfinished.. wanted to 