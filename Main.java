import com.utility.collection.*;
import com.utility.collection.collectionManager;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("collection manager");
        Commander commander=new Commander(new collectionManager());
commander.interactiveMod();    }
}
