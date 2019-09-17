public class sushu {

	public static void main(String[] args) {
		for(int i = 1; i < 101; i++){
			   boolean a = false;

			   for(int j = 2; j < i-1; j++){
			    int k=i%j;
			    if(k==0){
			     a=true;
			    }
			   }
			  
			  if(!a){
			   System.out.println(i);
			  }
			  }

	}

}
