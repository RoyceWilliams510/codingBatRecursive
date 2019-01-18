public class runner {
    public int triangle(int rows) {
        if(rows ==0){
            return 0;
        }
        if(rows==1){
            return 1;
        }
        return rows+ triangle(rows-1);
    }

    public int countHi(String str) {
        if(str.equals("hi")){
            return 1;
        }
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0,2).equals("hi")){
            return 1+countHi(str.substring(1));
        }
        return 0+countHi(str.substring(1));
    }

    public int sumDigits(int n) {
        if(n<10){
            return n;
        }
        return n%10+sumDigits(n/10);
    }

    public int countX(String str) {
        if(str.length()<=1){
            if(str.equals("x")){
                return 1;
            }
            return 0;
        }
        if(str.substring(0,1).equals("x")){
            return 1+countX(str.substring(1));
        }
        return 0+ countX(str.substring(1));
    }
    public String changeXY(String str) {
        if(str.length()<=1){
            if(str.equals("x")){
                return "y";
            }
            return str;
        }
        if(str.substring(0,1).equals("x")){
            return "y"+changeXY(str.substring(1));
        }
        return str.substring(0,1)+ changeXY(str.substring(1));
    }
    public int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public int count11(String str) {
        if(str.length()<=1){
            return 0;
        }
        if(str.substring(0,2).equals("11")){
            return 1+ count11(str.substring(2));
        }
        return 0+count11(str.substring(1));
    }
    public int strCount(String str, String sub) {
        if(str.length()< sub.length()){
            return 0;
        }
        if(str.substring(0,sub.length()).equals(sub)){
            return 1+ strCount(str.substring(sub.length()),sub);
        }
        return 0+strCount(str.substring(1),sub);
    }



}
