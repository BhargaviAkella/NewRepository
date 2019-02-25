  public class StringDigit{
	  
	  public String method(String a,String b)
	  {
		 StringBuilder sb = new StringBuilder();
		 StringBuilder sb1 = new StringBuilder();
		 char[] arr = a.toCharArray();
		 char[] arr1 = b.toCharArray();  
		  
		  for(char c : arr)
		  {
			  if(c>='0' && c<='9')
			  {
				  sb.append(c);
			  }

		  }
		  for(char c : arr1)
		  {
			  if(c>='0' && c<='9')
			  {
				  sb1.append(c);
				 
			  }

	 }		  
		  int num = Integer.parseInt(sb.toString());
		  int num1=Integer.parseInt(sb1.toString());
		  
		  int result = num+num1;
		  
		  String fstring = String.valueOf(result); 
		  
		  return fstring;
	  }
	 
	  public static void main(String []args)
		{
		  hey h =new hey();
		  System.out.print(h.method("absw45","bhuar4"));
		}
  }