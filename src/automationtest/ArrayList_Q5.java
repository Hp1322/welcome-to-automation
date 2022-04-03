package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {

        ArrayList<String> teamName = new ArrayList();
        teamName.add("Scrum");
        teamName.add("Java");
        teamName.add("Jira");
        teamName.add("Selenium");
        teamName.add("Cucumber");
        teamName.add("Postman");
        teamName.add("Rest Assured");

        for (String team : teamName){
            System.out.println(team);
        }

    }
}
