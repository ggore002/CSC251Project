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

        policies.add(new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight));
      }
      file.close();
      
      int smokers = 0;
      int nonSmokers = 0;
      
      for (int i = 0; i < policies.size(); i++) {
        System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
        System.out.println("Provider Name: " + policies.get(i).getProviderName());
        System.out.println("Policyholder's First Name: " + policies.get(i).getPolicyholderFirstName());
        System.out.println("Policyholder's Last Name: " + policies.get(i).getPolicyholderLastName());
        System.out.println("Policyholder's Age: " + policies.get(i).getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + policies.get(i).getPolicyholderSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f inches\n", policies.get(i).getPolicyholderHeight());
        System.out.printf("Policyholder's Weight: %.1f pounds\n", policies.get(i).getPolicyholderWeight());
        System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).calculateBMI());
        System.out.printf("Policy Price: $%.2f\n\n", policies.get(i).calculatePolicyPrice());
        
        if (policies.get(i).getPolicyholderSmokingStatus().equals("smoker")) {
         smokers++;
        } else {
         nonSmokers++;
        }
      }
      
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
   }
}