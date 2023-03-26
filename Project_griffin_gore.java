import java.util.Scanner;

class Project_griffin_gore {
   public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = keyboard.nextInt();
      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder’s First Name: ");
      String policyholderFirstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder’s Last Name: ");
      String policyholderLastName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder’s Age: ");
      int policyholderAge = keyboard.nextInt();
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String policyholderSmokingStatus = keyboard.nextLine();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double policyholderHeight = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      double policyholderWeight = keyboard.nextDouble();
      
      Policy policy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
      System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches\n", policy.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
   }
}