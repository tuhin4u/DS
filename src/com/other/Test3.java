package com.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by U6042192 on 25-May-17.
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> emailList= Arrays.asList("hariprasad.bachala@clarivate.com","Tuhin.SubhraDe@thomsonreuters.com","Sunil.KumarDas@thomsonreuters.com","lohit.ramachandra@thomsonreuters.com","aju.mathews@thomsonreuters.com","Manasa.Epuru@thomsonreuters.com","Vinny.RajC@thomsonreuters.com");
        for(int i=0;i<emailList.size();i++){
            String email=emailList.get(i);
            emailList.set(i,email.replace("thomsonreuters.com","clarivate.com"));
        }

        emailList.forEach(System.out::println);
    }
}
