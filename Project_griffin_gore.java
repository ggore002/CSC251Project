import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Project_griffin_gore {
   public static void main(String args[]) throws FileNotFoundException {
      Scanner file = new Scanner(new File("C:\\Users\\ggore002\\Documents\\GitHub\\CSC251Project\\PolicyInformation.txt"));
      ArrayList<Policy> policies = new ArrayList<Policy>();
      while (file.hasNext()) {
        //System.out.print("Please enter the Policy Number: ");
        int policyNumber = file.nextInt();
        file.nextLine();
        //System.out.print("Please enter the Provider Name: ");
        String providerName = file.nextLine();
        //System.out.print("Please enter the Policyholder’s First Name: ");
        String policyholderFirstName = file.nextLine();
        //System.out.print("Please enter the Policyholder’s Last Name: ");
        String policyholderLastName = file.nextLine();
        //System.out.print("Please enter the Policyholder’s Age: ");
        int policyholderAge = file.nextInt();
        file.nextLine();
        //System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String policyholderSmokingStatus = file.nextLine();
        //System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double policyholderHeight = file.nextDouble();
        //System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double policyholderWeight = file.nextDouble();

        policies.add(new Policy(policyNumber, providerName, new PolicyHolder(policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight)));
      }
      file.close();
      
      int smokers = 0;
      int nonSmokers = 0;
      
      for (int i = 0; i < policies.size(); i++) {
        System.out.println(policies.get(i));
        System.out.println();        
        if (policies.get(i).getPerson().getSmokingStatus().equals("smoker")) {
         smokers++;
        } else {
         nonSmokers++;
        }
      }
      
      System.out.println("There were " + Policy.objCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
   }
}