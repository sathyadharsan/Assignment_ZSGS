package stringutils;

public  class stringutils_class {

    public String concatenation(String str1,String str2){
        return  str1+str2;

    }

    public    String reverseStrig(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return  rev;
    }

    public    int lengthofString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;

        }
        return count;
    }

}
