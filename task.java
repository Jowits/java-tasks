

public class NewHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		     System.out.println("Hello World!"); 
		    

	}

}
// class fooBar
class FooBar {
    public static void main(int n) {
	for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FooBar");
            } else if (i % 3 == 0) {
            System.out.println("Foo");
            } else if (i % 5 == 0) {
            System.out.println("Bar");
            } else {
            System.out.println(i);
            }
	  
	}
    
	
       
}

// Pseudo code:
// hash_map = create_new_hash_map()
// for (int item : arr)
//    {
//    if(hash_map.contains_key(item)
//    {
//       hash_map.put(item, hash_map.get(item) + 1);
//    }else {
//       hash_map.put(elemnt, 1);
//    }
   
//    System.out.println(hash_map)
//  }