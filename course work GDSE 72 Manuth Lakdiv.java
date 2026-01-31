import java.util.*;
public class Main{
    static Scanner scanner = new Scanner(System.in);
	static  String userName = "manuth13";
    static String userPassword = "12345";
	static int[] chatagory = {1,2,3,4,5};  
	static int[] supplierManage ={1,2,3,4,5,6} ;  
	static String supId = "";
	static String supName = "";
	
	static String [][] SupplierDetails = new String [0][2];
	static String[][] tempSupplierDetail = new String[0][2];
	
	static String newSupplierID = "";
	static String AgainAddSuplier = "";
	static int [] SuppplierManageArray ={1,2,3,4,5,6};
	static String op = "";
	
	static String [] category =  new String [0];
	static String [] tempCategrory ;
	
	static String [][] itemArray = new String[0][6];
	static String itemCode = "";
	
	
	private final static void clearConsole() {

        final String os = System.getProperty("os.name");
        try {
            if (os.equals("Linux")) {
                System.out.print("\033\143");
            } else if (os.equals("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }
    }
	
	public static void main(String args[]){
		
		loginPage();
		
    }
	
	public static void loginPage(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t\t LOGIN PAGE\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+");
        System.out.println("\n\n");
		
		checkUserName ();
		 }	

    public static void checkUserName(){
        System.out.print("User name: ");
        String inputUserName = scanner.next();
        if(userName.equals(inputUserName)){
			System.out.println("\n");
            checkPassword();
        }else{
            System.out.println("user name is invalid. please try again!\n ");
            checkUserName();
        }
    }

    public static void checkPassword(){
        System.out.print("Password : ");
        String inputUserPassword = scanner.next();
        if(userPassword.equals(inputUserPassword)){
            System.out.println("\nLOGGING SUCCESFULLY !!!!!!!!!!\n\n");
            clearConsole();
            welcomePage();
        }else{
            System.out.println("password is incorrect. please try again! ");
            System.out.println("");
            checkPassword();
        }

    }

    public static void welcomePage(){        // welcome eke thorana 5
       System.out.println("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+");
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.print("[" +chatagory[0]+ "]  "+"Changes the Credentials\t\t " );
        System.out.println("[" +chatagory[1]+ "]  "+"Supplier Manage\n " );
        System.out.print("[" +chatagory[2]+ "]  "+"Stock Manage\t\t\t " );
        System.out.println("[" +chatagory[3]+ "]  "+"Log Out " );
        System.out.println("\n[" +chatagory[4]+ "]  "+"Exit the System\n\n " );

        System.out.print("Enter an option to countinue > ");
        String option = scanner.next();
		chooseOption(option);
    }

	public static void suppliercreate(){   // supplier eke thorana 6
				System.out.println("\n\n\n\n");
					System.out.print("[" +supplierManage[0]+ "]  "+"Add Supplier\t\t\t " );
						System.out.println("[" +supplierManage[1]+ "]  "+"Update Supplier\n " );
							System.out.print("[" +supplierManage[2]+ "]  "+"Delete Supplier\t\t\t " );
						System.out.println("[" +supplierManage[3]+ "]  "+"View Suppliers\n " );
					System.out.print("[" +supplierManage[4]+ "]  "+"Search Supplier\t\t\t " );
				System.out.println("[" +supplierManage[5]+ "]  "+"Home Page\n\n");
                
	}
	
	public static void chooseOption(String option){
		boolean check = true;
        switch (option){
            case "1":
				clearConsole ();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t   CREDENTIAL MANAGE\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
                changeCredential ();
                break;
            case "2":
                clearConsole ();
                 System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      SUPPLIER MANAGE\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
                suppliercreate();
                 supplierManagePage();
                break;
            case "3":
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      STOCK MANAGE\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				System.out.println("\n\n\n\n");
				System.out.print("[" +SuppplierManageArray[0]+ "]  "+"Manage Item Categories\t\t\t " );
				System.out.println("[" +SuppplierManageArray[1]+ "]  "+"Add Item\n " );
				System.out.print("[" +SuppplierManageArray[2]+ "]  "+"Get Items Supplier Wise\t\t\t " );
				System.out.println("[" +SuppplierManageArray[3]+ "]  "+"View Items\n " );
				System.out.print("[" +SuppplierManageArray[4]+ "]  "+"Rank Items per Unit Price\t\t\t " );
				System.out.println("[" +SuppplierManageArray[5]+ "]  "+"Home Page\n\n");
				stockManagePage();
                break;
            case "4":
                clearConsole ();
                logOut ();
                break;
            case "5":
                exitSystem();
                break;
            default: 
                while(true){
					System.out.println ("Your input is invalid!\n\n");
					System.out.print("Enter an option to countinue > ");
					option = scanner.next();
						if(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5")){
							check = false;
							chooseOption(option);
						}
				}
        }
    }
	
	public static void changeCredential() {
        System.out.print ("please enter the user name to verify it's you : ");
        String inputUserName = scanner.next ();
         if (userName.equals (inputUserName)) {
            System.out.println ("\nHey " + userName + "\n");
			boolean check=true;
			while (check){
				System.out.print ("Enter your current password : ");
				String inputCurrentPass = scanner.next ();
				if (userPassword.equals (inputCurrentPass)){
                check=false;
				}else{
					System.out.println("Incorrect password. try again!\n\n ");
				}
					
				
           }
			System.out.print("Enter your new password : ");
            String inputNewPassword = scanner.next();
			userPassword=inputNewPassword;
			System.out.print("\n\nPassword Change Succussfully..Do yo Want Home Page(y/n) > ");
            String answer=scanner.next ();
			if (answer.equalsIgnoreCase("y")) {
				clearConsole();
                welcomePage ();
            }else if(answer.equalsIgnoreCase("n")){
				exitSystem();
			} else {
				boolean checkyn = true ;
                while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo yo Want Home Page(y/n) > ");
					answer=scanner.next ();
					if(answer.equalsIgnoreCase("y")){
						checkyn = false ;
						clearConsole();
						welcomePage ();
					}else if(answer.equalsIgnoreCase("n")){
						clearConsole();
						exitSystem();
					}
				}
            }
		}else {
            System.out.println("invalid user name. try again! "+"\n");
            changeCredential ();
        }
    }
	
	public static void supplierManagePage(){
		System.out.print("Enter an option to countinue > ");
        String option = scanner.next();
        switch(option){
			case "1" :
				clearConsole();
				 System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				 addSupplier();
					break;
			case "2" :
				clearConsole();
					System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      UPDATE SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
					updateSupplier();
					break;
			case "3" :
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      DELETE SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				deleteSupplier();
					break;
			case "4" :
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      VIEW SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				viewSuppliertable();
					break;
			case "5" : 
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      SEARCH SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				searchSupplier();
					break;
			case "6" :
				clearConsole();
				welcomePage();
					break;
			default :{
				boolean check = true ;
				  while(check){
						if(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5") || option.equals("6")){
							check = false;
							suppliercreate();
							supplierManagePage();
						}else{
							System.out.println ("Your input is invalid!\n\n");
							supplierManagePage();
						}	
				}
			}
					
		}
		
        
	}
	
	public static void growthArray(){
		tempSupplierDetail = new String [SupplierDetails.length+1][2];
		for (int i = 0; i < SupplierDetails.length ; i++){
			for (int j = 0; j < SupplierDetails[i].length ; j++){
				
				tempSupplierDetail[i][j] = SupplierDetails[i][j];
			}
			
		}
			
		SupplierDetails = tempSupplierDetail;
		
	}
	
	public static void addSupplier(){
		boolean check = true;
		while(check){
			System.out.print("Supplier ID : ");
			newSupplierID= scanner.next();
			 if (hasDuplicate(newSupplierID)) {
				System.out.println("Supplier ID already exists. Please enter a unique Supplier ID.\n");
					addSupplier();
			}else{
				growthArray();
				int i = SupplierDetails.length - 1;
				SupplierDetails[i][0] = newSupplierID;	
				System.out.print("Supplier Name : ");
				SupplierDetails[i][1]= scanner.next();
		
				System.out.println("\n"+Arrays.deepToString(SupplierDetails));
				System.out.println("The array length is: " +SupplierDetails.length );
				System.out.println("");
				
				System.out.print("added  succesfuly! Do you want to add another supplier(y/n) > ");
				String yesOrNo = scanner.next();
				System.out.print("\n");
				
				if(yesOrNo.equals("y") || yesOrNo.equals("Y")){
					addSupplier();
				}else if(yesOrNo.equals("n") || yesOrNo.equals("N")){
					check = false;
					clearConsole();
					suppliercreate();
					chooseOption("2");
					supplierManagePage();
					addSupplier();
				}else{
					boolean checkyn  =  true ;
					while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo you want to add another supplier(y/n) > ");
					yesOrNo=scanner.next ();
					if(yesOrNo.equals("y") || yesOrNo.equals("Y")){
						checkyn = false ;
						System.out.println("\n");
						addSupplier();
					}else if(yesOrNo.equals("n") || yesOrNo.equals("N")){
						clearConsole();
						System.out.println("\n\n\n\n");
						clearConsole();
						suppliercreate();
						chooseOption("2");
						supplierManagePage();
						addSupplier();
					}
				}
			}
		}
	}
}
	
	public static void updateSupplier(){
		 System.out.print("Supplier ID: ");
        String checkSupID = scanner.next();
		 boolean found = false;
        for (int i = 0; i < SupplierDetails.length; i++) {
            if (SupplierDetails[i][0].equals(checkSupID)) {
                found = true;
                System.out.print("Supplier Name: ");
                System.out.println(SupplierDetails[i][1]+"\n");
                System.out.print("Enter the new supplier name: ");
                SupplierDetails[i][1] = scanner.next();      
                System.out.println("\nUpdated Successfully!");

                System.out.print("Do you want to update another supplier (y/n) > ");
                String response = scanner.next();
                
                if (response.equalsIgnoreCase("y")) {
					System.out.println("");
                    updateSupplier();    
                }else if(response.equalsIgnoreCase("n")){
						clearConsole();
						System.out.println("\n\n\n\n");
						clearConsole();
						suppliercreate();
						chooseOption("2");
						supplierManagePage();
						updateSupplier();
				}else{
					boolean checkyn  =  true ;
					while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)");
					System.out.print("\n\nDo you want to update another supplier(y/n) > ");
					response=scanner.next ();
					if(response.equalsIgnoreCase("y")){
						checkyn = false ;
						System.out.println("\n");
						updateSupplier();
					}else if(response.equalsIgnoreCase("n")){
						clearConsole();
						System.out.println("\n\n\n\n");
						clearConsole();
						suppliercreate();
						chooseOption("2");
						supplierManagePage();
						updateSupplier();
					}
				}
                break;
            }
        }
	}
        if (!found) {
            System.out.println("Can't find supplier ID. Try again!\n");
            updateSupplier();
        }
    }

   public static void deleteSupplier(){
		System.out.print("Supplier ID	:  ");
		String supID = scanner.next();
		
		int deleteIndex = -1 ;
		for (int i = 0; i < SupplierDetails.length; i++){
			if((SupplierDetails[i][0]).equals(supID)){
				deleteIndex = i;
				break ;
			}
		}
		 if (deleteIndex != -1) {
            String[][] tempArray = new String[SupplierDetails.length - 1][2];
            int index = 0;
            for (int i = 0; i < SupplierDetails.length; i++) {
                if (i != deleteIndex) {
                    tempArray[index++] = SupplierDetails[i];
                }
            }
            SupplierDetails = tempArray;
            System.out.println("Supplier " + supID + " deleted successfully.");
            System.out.print("Do you want to delete another (y/n)  > ");
            String option = scanner.next();
            if(option.equalsIgnoreCase("y")){
				System.out.println("");
				deleteSupplier();
			}else if(option.equalsIgnoreCase("n")){
					clearConsole();
						System.out.println("\n\n\n\n");
						clearConsole();
						suppliercreate();
						chooseOption("2");
						supplierManagePage();
						deleteSupplier();
			}else{
				boolean checkyn  =  true ;
					while(checkyn){
						System.out.println("Oooooooooops!!! You can enter only (y/n)");
						System.out.print("\n\nDo you want to update another supplier(y/n) > ");
						String response=scanner.next ();
							if(response.equalsIgnoreCase("y")){
								checkyn = false ;
								System.out.println("\n");
								updateSupplier();
							}else if(response.equalsIgnoreCase("n")){
								clearConsole();
								System.out.println("\n\n\n\n");
								clearConsole();
								suppliercreate();
								chooseOption("2");
								supplierManagePage();
								deleteSupplier();
							}	
					}
			}
			
            
        } else {
            System.out.println("can't find supplier ID. try again! .\n");
            deleteSupplier();
        }
    }

	public static void viewSuppliertable(){
		System.out.println("\n\t\t\t+--------------------+----------------------------------+");
		System.out.println("\t\t\t|   SUPPLIER ID	     |		SUPPLIER NAME           |");
		System.out.println("\t\t\t+--------------------+----------------------------------+");
		 for (String[] supplier : SupplierDetails) {
            System.out.printf("\t\t\t| %-18s | %-15s\t\t\t|\n", supplier[0], supplier[1]);
        }
        System.out.println("\t\t\t+-------------------------------------------------------+\n\n");
	
		System.out.print("Do you want to go Supplier Manage page (y/n) > ");
		String option = scanner.next();
		if(option.equalsIgnoreCase("y")){
			clearConsole();
			System.out.println("\n\n\n\n");
			clearConsole();
			suppliercreate();
			chooseOption("2");
			supplierManagePage();
		}else if(option.equalsIgnoreCase("n")){
			clearConsole();
			welcomePage();
			chooseOption("2");
		}else{
			boolean checkyn  =  true ;
					while(checkyn){
						System.out.print("Oooooooooops!!! You can enter only (y/n)\n");
						System.out.print("Do you want to go Supplier Manage page (y/n) >  ");
						String response=scanner.next ();
							if(response.equalsIgnoreCase("y")){
								clearConsole();
								checkyn = false ;
								System.out.println("\n\n\n\n");
								clearConsole();
								suppliercreate();
								chooseOption("2");
								supplierManagePage();
							}else if(response.equalsIgnoreCase("n")){
								clearConsole();
								welcomePage();
								chooseOption("2");
							}	
					}
		}
}
   
    public static void searchSupplier(){
		System.out.print("Supplier ID: ");
        String option = scanner.next();
        boolean found = false;

        for (int i = 0; i < SupplierDetails.length; i++) {
            if (SupplierDetails[i][0].equals(option)) {
                System.out.println("Supplier Name: " + SupplierDetails[i][1]);
                System.out.println("Search successful!\n\n");
                found = true;
                System.out.print("Do you want to search another Supplier (y/n) > ");
                option = scanner.next();
                if(option.equalsIgnoreCase("y")){
					System.out.println("");
					searchSupplier();
				}else if(option.equalsIgnoreCase("n")){
					clearConsole();
					suppliercreate();
					chooseOption("2");
					supplierManagePage();
				}else{
					boolean checkyn  =  true ;
					while(checkyn){
						System.out.print("Oooooooooops!!! You can enter only (y/n)\n");
						System.out.print("Do you want to search another Supplier (y/n) >  ");
						String response=scanner.next ();
							if(response.equalsIgnoreCase("y")){
								searchSupplier();
							}else if(response.equalsIgnoreCase("n")){
								clearConsole();
								checkyn = false ;
								System.out.println("\n\n\n\n");
								clearConsole();
								suppliercreate();
								chooseOption("2");
								supplierManagePage();
							}	
					}
					
				}
           
            }
        }

        if (!found) {
            System.out.println("Can't find Supplier ID. Try again!\n\n");
            searchSupplier();  
        }
    }

	public static boolean hasDuplicate(String newSupplierID) {
        for (String[] supplier : SupplierDetails) {
            if (supplier[0].equals(newSupplierID)) {
                return true;
            }
        }
        return false;
    }
	
	public static void stockManagePage(){
		System.out.print("Enter an option to countinue > ");
		op = scanner.next();
		switch(op){
			case "1" :
				clearConsole();
				manageItemCategory();
			
				break;
			case "2" :
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM\t\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				System.out.println("\n\n\n\n");
				addItem();
				break;
			case "3" : 
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      SEARCH SUPPLIERWISE\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				System.out.println("\n\n\n\n");
				searchSupWise();
				break;
			case "4" :
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      VIEW ITEM\t\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				System.out.println("\n\n\n\n");
				viewItem();
				break;
			case "5" :
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      RANKED UNIT PRICE\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				rankedUnitPrice();
				break;
			case "6" :
			clearConsole();
			welcomePage();
				break;
			default : {
				boolean check = true ;
				while(check){
						if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("6")){
							check = false;
						}else{
							System.out.println ("Your input is invalid!\n\n");
							stockManagePage();
						}	
				}
			}
		}
	}
	
	public static void manageItemCategory(){
		System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      MANAGE ITEM CATEGORY\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
		System.out.println("\n\n\n\n");
		System.out.print("[" +SuppplierManageArray[0]+ "]  "+"Add new item Category\t\t\t " );
		System.out.println("[" +SuppplierManageArray[1]+ "]  "+"Delete item category\n " );
		System.out.print("[" +SuppplierManageArray[2]+ "]  "+"Update item Category\t\t\t " );
		System.out.println("[" +SuppplierManageArray[3]+ "]  "+"Stock Management\n\n\n\n " );
		
		manageItemCategoryPage2();
		
		}
		
	public static void manageItemCategoryPage2(){
			System.out.print("Enter an option to countinue > ");
			op = scanner.next();
			switch(op){
			case "1" :
			clearConsole();
			System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM CATEGORY\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
			addItemCategory();
				break;
			case "2" :
			clearConsole();
			System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      DELETE ITEM CATEGORY\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
			deleteItemCategory();
				break;
			case "3" : 
			clearConsole();
			System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      UPDATE ITEM CATEGORY\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
			updateItemCategory();
				break;
			case "4" :
			clearConsole();
			chooseOption("3");
				break;
			default :{
				boolean check = true ;
				while(check){
						if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4")){
							check = false;
						}else{
							System.out.println ("Your input is invalid!\n\n");
							manageItemCategoryPage2();
						}	
				}
			}
		}
	}
	
	public static void addItemCategory(){
		boolean check = true;
        while (check) {
            growArrayCategory();
			System.out.print("Enter the new Item category: ");
            category[category.length - 1] = scanner.next();
			//System.out.println(Arrays.toString(category));
            System.out.print("Added successfully! Do you want to add another category (y/n)? ");
            String op = scanner.next();
            System.out.println("\n");
            if (op.equalsIgnoreCase("y")) {
				System.out.println("");
                addItemCategory();
            }else if(op.equalsIgnoreCase("n")){
				clearConsole();
				manageItemCategory();
			}else{
				boolean bool = true;
				while(bool){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo you want to add another supplier(y/n) > ");
					op = scanner.next();
					if(op.equalsIgnoreCase("y")){
						bool = false ;
						 addItemCategory();
					}else if(op.equalsIgnoreCase("n")){
						clearConsole();
						manageItemCategory();
					}
				}
			}
        }
   //     System.out.println(Arrays.toString(category));
	}
	
	public static void updateItemCategory(){
		 System.out.print("category name : ");
        String checkCategory = scanner.next();
        boolean found = false;
        for (int i = 0; i < category.length; i++) {
            if (category[i].equals(checkCategory)) {
                found = true;
                System.out.print("Enter the new category name: ");
                category[i]= scanner.next();
                System.out.println("\nUpdated Successfully!");
                System.out.print("Do you want to update another category (y/n) > ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("y")) {
					System.out.println("");
                    updateItemCategory();
                } else {
                    clearConsole();
                    manageItemCategory();
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Can't find category ID. Try again!\n");
              updateItemCategory();
        }
    }

	public static void deleteItemCategory(){
			  if (category.length == 0) {
        System.out.println("Category list is empty.");
        return; 
    }

    System.out.print("Category Name: ");
    String categoryName = scanner.next();

    int deleteIndex = -1;
    for (int i = 0; i < category.length; i++) {
        if (category[i].equals(categoryName)) {
            deleteIndex = i;
            break;
        }
    }

    if (deleteIndex != -1) {
        String[] tempArray = new String[category.length - 1];
        int index = 0;
        for (int i = 0; i < category.length; i++) {
            if (i != deleteIndex) {
                tempArray[index++] = category[i];
            }
        }
        category = tempArray;
        System.out.println("Category deleted successfully.");

        System.out.print("Do you want to delete another (y/n): ");
        String option = scanner.next();
        if (option.equalsIgnoreCase("y")) {
            System.out.println();
            deleteItemCategory();
        } else if (option.equalsIgnoreCase("n")) {
            clearConsole();
            manageItemCategory();
            manageItemCategoryPage2();
        } else {
            boolean checkYN = true;
            while (checkYN) {
                System.out.println("Invalid input. Enter 'y' or 'n'.");
                System.out.print("Do you want to delete another (y/n): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("y")) {
                    System.out.println();
                    deleteItemCategory();
                    checkYN = false;
                } else if (response.equalsIgnoreCase("n")) {
                    clearConsole();
                    manageItemCategory();
                    manageItemCategoryPage2();
                    checkYN = false;
                }
            }
        }
    } else {
        System.out.println("Category not found. Please try again.");
        deleteItemCategory();
    }
    }
	
	public static void addItem(){
	//System.out.println(Arrays.deepToString(itemArray));               // athule thiyena values balnawa
		if(category.length == 0){
			System.out.print("OOOOOOPS! It seems that you dan't have any item categories in the System.\nDo you want to add a new item category (y/n) > ");
			String yOrn = scanner.next();
			if(yOrn.equalsIgnoreCase("y")){
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM CATEGORY\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				addItemCategory();
			}else if(yOrn.equalsIgnoreCase("n")){
				chooseOption("3");
			}else{
				boolean checkyn  =  true ;
				while(checkyn){
					System.out.println("");
					System.out.print("Oooooooooops!!! You can enter only (y/n)\nDo you want to search another Supplier (y/n) >");
					String response=scanner.next ();
					System.out.println("");
							if(response.equalsIgnoreCase("y")){
								clearConsole();
								System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM CATEGORY\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
								addItemCategory();
								checkyn = false ;
							}else if(response.equalsIgnoreCase("n")){
								chooseOption("3");
							}
				}
			}				
		}else if(category.length > 0 && SupplierDetails.length == 0){
			System.out.print("OOOOOOPS! It seems that you dan't have any item suppliers in the System.\nDo you want to add a new supplier (y/n) > ");
				String yOrn = scanner.next();
				if(yOrn.equalsIgnoreCase("y")){
				clearConsole();
				 System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				 addSupplier();
				}else if(yOrn.equalsIgnoreCase("n")){
				chooseOption("3");
				}else{
					boolean checkyn  =  true ;
					while(checkyn){
						System.out.print("Oooooooooops!!! You can enter only (y/n)\nDo you want to search another Supplier (y/n) >");
						String response=scanner.next ();
						System.out.println("");
							if(response.equalsIgnoreCase("y")){
								clearConsole();
								System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD SUPPLIER\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
								 addSupplier();
								checkyn = false ;
							}else if(response.equalsIgnoreCase("n")){
								chooseOption("3");
							}
					}
			}
		}else{
			System.out.print("Item Code	:  ");
			itemCode = scanner.next();
			 if (hasDuplicateItemCode(itemCode)) {
				System.out.println("Item Code already exists. Please enter a unique Item code.\n");
				addItem();
			}else{
				growArrayItem();
				if(itemCode != null ){
					itemArray[itemArray.length - 1][0] = itemCode;
					System.out.println("\n\nSupplier List :\n ");
					System.out.println("\n+-------+-------------+--------------------------------+");
					System.out.println("|   #	| SUPPLIER ID |		SUPPLIER NAME	       |");
					System.out.println("+-------+-------------+--------------------------------+");
					for (int j = 0; j < SupplierDetails.length; j++){
						System.out.printf("| %-5s | %-11s | %-30s |\n",(j+1), SupplierDetails[j][0], SupplierDetails[j][1]);
					}
						System.out.println("+-------+-------------+--------------------------------+");
				}
			}
			System.out.print("\n\n enter the supplier number > ");
			int SupplierNumb = scanner.nextInt();
			for (int i = 0, j = 1; i < SupplierDetails.length;j++, i++){
				if(SupplierDetails[i][0] == null){
					continue;
				}
				if(SupplierNumb == j){
					itemArray[itemArray.length - 1][1] = SupplierDetails[i][0];
						break;
				}
			}
			System.out.println("\nItem Categories : ");
			System.out.println("+---------------------+---------------------+");
			System.out.println("|          #          |    CATEGORY NAME    |");
			System.out.println("+---------------------+---------------------+");
			 for (int i = 0; i < category.length; i++){
				 System.out.printf("| %-19s | %-19s |\n",(i+1), category[i]);
			 }
			 System.out.println("+---------------------+---------------------+");
			 System.out.print("\n\nEnter the category number > ");
			 int catNum = scanner.nextInt();
			for (int i = 0,j = 1; i < category.length; j++,i++){
				if(category[i] == null){
					continue;
				}
				if(catNum == j){
					itemArray[itemArray.length - 1][2] = category[i];
						break;
				}
			}
			 System.out.print("Description : ");
				 String Desc = scanner.next();
					itemArray[itemArray.length - 1][3] = Desc;
			System.out.print("Unit Price : ");
				 int price = scanner.nextInt();
					itemArray[itemArray.length - 1][4] = Integer.toString(price);
			System.out.print("Qty on hand : ");
				 String qty = scanner.next();
					itemArray[itemArray.length - 1][5] = qty;
			System.out.print("Added Successfully.\n\nDo you want to add another Item(y/n) > ");
			op = scanner.next();
			if(op.equalsIgnoreCase("y")){
				clearConsole();
				System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM\t\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
				System.out.println("\n\n\n\n");
				addItem();
			}else if(op.equalsIgnoreCase("n")){
				clearConsole();
				chooseOption("3");
			}else{
					boolean checkyn  =  true ;
					while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo you want to add another supplier(y/n) > ");
					op=scanner.next ();
					if(op.equals("y") || op.equals("Y")){
						checkyn = false ;
						clearConsole();
						System.out.println ("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      ADD ITEM\t\t\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
						System.out.println("\n\n\n\n");
						addItem();
					}else if(op.equals("n") || op.equals("N")){
						clearConsole();
						 chooseOption("3");
					}
				}
			}
		}
	}
	
	public static void searchSupWise(){
		System.out.print("Supplier ID: ");
        String option = scanner.next();
      
        boolean found = false;

        for (int i = 0; i < SupplierDetails.length; i++) {
            if (SupplierDetails[i][0].equals(option)) {
                System.out.println("Supplier Name: " + SupplierDetails[i][1]);
                found = true;
                System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
				System.out.println("|      ITEM CODE      |    DESCRIPTION      |      UNIT PRICE     |     QTY ON HAND     |       CATEGORY      |");
				System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
                for (int j = 0; j < itemArray.length; j++) {
					if (itemArray[j][1].equals(option)) {
							System.out.printf("| %-19s | %-19s | %-19s | %-19s | %-19s |\n", itemArray[j][0], itemArray[j][3], itemArray[j][4], itemArray[j][5], itemArray[j][2]);
                    }
                }
				System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
                System.out.println("\n");
                System.out.print("Do you want to search another Supplier (y/n) > ");
                option = scanner.next();
                if (option.equalsIgnoreCase("y")) {
                    clearConsole();
                    System.out.println("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      SEARCH SUPPLIERWISE\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
                    searchSupWise();
                } else if (option.equalsIgnoreCase("n")) {
                    clearConsole();
                    chooseOption("3");
                } else {
                    boolean checkyn = true;
                    while (checkyn) {
                        System.out.print("Oooooooooops!!! You can enter only (y/n)\n");
                        System.out.print("Do you want to search another Supplier (y/n) >  ");
                        String response = scanner.next();
                        System.out.println("");
                        if (response.equalsIgnoreCase("y")) {
                            clearConsole();
                            System.out.println("\n\n\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\t\t\t|\t\t\t\t\t      SEARCH SUPPLIERWISE\t\t\t\t\t|\n\t\t\t+-------------------------------------------------------------------------------------------------------+\n\n\n\n");
                            searchSupWise();
                        } else if (response.equalsIgnoreCase("n")) {
                            clearConsole();
                            checkyn = false;
                            chooseOption("3");
                        }
                    }
                }

                return; // Exit the method after processing the supplier
            }
        }

        if (!found) {
            System.out.println("Can't find Supplier ID. Try again!\n\n");
            searchSupWise(); // Retry the search
        }
    }
	
	public static void viewItem(){
		for (int i = 0; i < category.length; i++){
			System.out.println(category[i] + " : ");
			System.out.print("\n\n");
			System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
			System.out.println("|         SID         |        CODE         |         DESC        |        PRICE        |         QTY         |");
			System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
			 for (int k = 0; k < itemArray.length; k++){
				if(itemArray[k][2].equals(category[i])){
					System.out.printf("| %-19s | %-19s | %-19s | %-19s | %-19s |\n",itemArray[k][1], itemArray[k][0], itemArray[k][3], itemArray[k][4], itemArray[k][5]);
					System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
				}
			}
		}	
			System.out.println("\n\n");
			System.out.print("Do you want to stock manage Page (y/n) > ");
			op = scanner.next();
			if(op.equalsIgnoreCase("y")){
				clearConsole();
				chooseOption("3");
				stockManagePage();
			}else if(op.equalsIgnoreCase("n")){
				clearConsole();
				welcomePage();
			}else{
				boolean checkyn  =  true ;
					while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo you want to stock manage Page (y/n) > ");
					op=scanner.next();
					if(op.equals("y") || op.equals("Y")){
						checkyn = false ;
							clearConsole();
							chooseOption("3");
							stockManagePage();
					}else if(op.equals("n") || op.equals("N")){
								clearConsole();
							welcomePage();
					}
				
			}
		}	
			
	}		
     
     public static void rankedUnitPrice(){ 
		Integer[] prices= new Integer[itemArray.length];
		String [] rank= new String[itemArray.length];
		for (int i = 0; i < itemArray.length; i++){
			prices[i]= Integer.valueOf(itemArray[i][4]);
		}
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = 0; j < prices.length - 1; j++) {
				if(prices[j] > prices[j+1]) {
					int temp = prices[j];
					prices[j] = prices[j+1];
					prices[j+1] = temp;
				}	
			}
		}
		for (int i = 0; i < rank.length; i++){
			rank[i]=String.valueOf(prices[i]);
		}
		System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+---------------------+");
        System.out.println("|         SID         |        CODE         |         DESC        |        PRICE        |         QTY         |         CAT         |");
        System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+---------------------+");
        for (int i = 0; i < rank.length; i++){
			for (int j = 0; j < itemArray.length; j++){
				if(rank[i].equals(itemArray[j][4])){
					System.out.printf("| %-19s | %-19s | %-19s | %-19s | %-19s | %-19s |\n",itemArray[j][1], itemArray[j][0], itemArray[j][3], itemArray[j][4], itemArray[j][5], itemArray[j][2]);
					System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+---------------------+");
				} 
			}
	    }
	    System.out.println("\n\n");
		System.out.print("Do you want to stock manage Page (y/n) > ");
		op = scanner.next();
		if(op.equalsIgnoreCase("y")){
				clearConsole();
				chooseOption("3");
				stockManagePage();
		}else if(op.equalsIgnoreCase("n")){
				clearConsole();
				welcomePage();
		}else{
				boolean checkyn  =  true ;
					while(checkyn){
					System.out.println("Oooooooooops!!! You can enter only (y/n)\n");
					System.out.print("\n\nDo you want to stock manage Page (y/n) > ");
					op=scanner.next();
					if(op.equals("y") || op.equals("Y")){
						checkyn = false ;
							clearConsole();
							chooseOption("3");
							stockManagePage();
					}else if(op.equals("n") || op.equals("N")){
								clearConsole();
							welcomePage();
					}
			}
		}
	}
     
      public static void exitSystem(){
		//System.exit(0);
		System.out.println("Program is ending.......................");
        String appleScriptCommand = 
            "tell application \"Terminal\"\n" +
            "    set win to first window\n" +
            "    set winID to id of win\n" +
            "    do script \"exit\" in win\n" +
            "    delay 1\n" +
            "    if (count of windows) > 0 and id of front window is winID then\n" +
            "        close win without saving\n" +
            "    end if\n" +
            "end tell";
        try {
            Runtime.getRuntime().exec(new String[]{"osascript", "-e", appleScriptCommand});
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void logOut(){
		
        loginPage ();
    }
	
	public static void growArrayCategory(){
		tempCategrory = new String [category.length+1];
		
		for(int i = 0 ; i < category.length ; i++){
			tempCategrory[i] = category[i];
			
		}
		category = tempCategrory;
	}
	
	public static void growArrayItem() {
    String[][] tempItemArray = new String [itemArray.length + 1][6];
    for (int i = 0; i < itemArray.length; i++) {
        for (int j = 0; j < itemArray[i].length; j++) {
            tempItemArray[i][j] = itemArray[i][j];
        }
    }
    itemArray = tempItemArray; 
}
	
	public static boolean hasDuplicateItemCode(String itemCode) {
        for (String[] item : itemArray) {
            if (item[0].equals(itemCode)) {
                return true;
            }
        }
        return false;
    }
	 		
}
