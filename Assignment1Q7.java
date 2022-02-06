package basic_data_structure_assignment;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]==toCheckValue) {
             break;
    	}
    }	
      return true;
    
    }
}

public class Assignment1Q7 {
	 
     public static void main(String [] args) {
     SearchArray sa=new SearchArray();
     int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
     int valueToCheck = 19;
     boolean ans=sa.searchArray(arr,valueToCheck);
     if(ans==true) {
    	 System.out.println("Number is found !");
    	}
     else {
    	 System.out.println("Number is not found !");
 
     }
   }
}

