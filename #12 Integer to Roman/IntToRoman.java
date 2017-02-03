/**
 * Created by Holeyness on 2017/2/3.
 */
public class IntToRoman {
    public String intToRoman(int num) {
        if(num<=0||num>3999){
            return null;
        }
        int numberArr[] = new int[4];
        numberArr[0] = num/1000; //千位
        numberArr[1] = (num%1000)/100; //百位
        numberArr[2] = (num%100)/10; //十位
        numberArr[3] = (num%10); //个位

        StringBuffer romanNum = new StringBuffer();
        //千位
        for(int i = 0; i < numberArr[0]; i++){
            romanNum.append("M");
        }
        //百位 若为9
        if(numberArr[1]==9){
            romanNum.append("CM");
        }else if(numberArr[1]==4){
            //若为4
            romanNum.append("CD");
        }else{
            if(numberArr[1]/5==1){
                romanNum.append("D");
                for(int i = 0; i < numberArr[1]%5; i++){
                    romanNum.append("C");
                }
            }else{
                for(int i = 0; i < numberArr[1]; i++){
                    romanNum.append("C");
                }
            }
        }
        //十位
        if(numberArr[2]==9){
            romanNum.append("XC");
        }else if(numberArr[2]==4){
            romanNum.append("XL");
        }else{
            if(numberArr[2]/5==1){
                romanNum.append("L");
                for(int i = 0; i < numberArr[2]%5; i++){
                    romanNum.append("X");
                }
            }else{
                for(int i = 0; i < numberArr[2]; i++){
                    romanNum.append("X");
                }
            }
        }
        //个位
        if(numberArr[3]==9){
            romanNum.append("IX");
        }else if(numberArr[3]==4){
            romanNum.append("IV");
        }else{
            if(numberArr[3]/5==1){
                romanNum.append("V");
                for(int i = 0; i < numberArr[3]%5; i++){
                    romanNum.append("I");
                }
            }else{
                for(int i = 0; i < numberArr[3]; i++){
                    romanNum.append("I");
                }
            }
        }


        return romanNum.toString();
    }
    public static void main(String args[]){
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(1950));
    }
}
