import java.util.Scanner;

class LAB1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter employee name,age,region,state,gender");
        String name = scan.nextLine();
        int age= Integer.parseInt(scan.nextLine());
        String region = scan.nextLine();
        String state = scan.nextLine();
        String MNC = scan.next();
        char gender = scan.next().charAt(0);
    System.out.println("Employee [name = " + name + ", age = " + age + ", gender = " + gender + ", region = " + region 
            + ", state = " + state + ", company = " + MNC + "]"  ); 
    
    
        
        if(gender == 'M'){
		System.out.println("The gender is MALE");
        }
		else{
            System.out.println("The gender is FEMALE");

        }
        if (state.equalsIgnoreCase("Andhra Pradesh") || state.equalsIgnoreCase("Karnataka")
              || state.equalsIgnoreCase("Kerala") || state.equalsIgnoreCase("Tamil Nadu")
              || state.equalsIgnoreCase("Telangana")) {
            System.out.println("The Employee is from the southern states of India; Preferable work location is in " + state);
              

            // check for top MNC Companies Using switch case:
            switch (MNC.toLowerCase()) {
                case "facebook":
                case "google":
                case "microsoft":
                case "samsung":
                case "ibm":
                case "apple":
                  System.out.println("The employee is working in Top MNC Companies");
                  break;
                default:
                  break;
            }

    }
}
}