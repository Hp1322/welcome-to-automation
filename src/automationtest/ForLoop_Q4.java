package automationtest;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime){
        for(howManyTime =0; howManyTime>=15; howManyTime++){
            System.out.println(name+""+howManyTime);
        }

    }
    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Harsh",10);


    }


}
