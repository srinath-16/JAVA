public class string{
    public static void main(String[] args) {
        String str = "Java programming ";
        //length()-> to find the length of the string
        int len= str.length();
        System.out.println("length : "+len);
        //charAt()-> access the specific char
        char ch= str.charAt(13);
        System.out.println("access char :" +ch);
        //substring(benginIndex,endIndex+1)-> to find substring
        String substr = str.substring(5,12);
        System.out.println("substring : "+substr);
        // to uppercase()
        System.out.println("uppercase : "+str.toUpperCase());
        //to lowercase()                                       
        System.out.println("lowercase : "+str.toLowerCase());
        // to check the substring contain by the string
        System.out.println("<Java> contain : "+str.contains("Java"));
        // to replace substring or char
        System.out.println("replace python: "+str.replace("Java","python"));
        //compare ()
        String name = "rahul";
        boolean isSame = name.equals("rahul"); 
        System.out.println("are strings equal : "+isSame);//false
        boolean isSamecase = name.equalsIgnoreCase("rahul");
        System.out.println("are strings equal : "+isSamecase);//true


        
    }
}