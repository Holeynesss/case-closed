/*
*Created by Holeyness on 2017/2/3.
*直接将个十百千位上的数字对应的罗马数字罗列出来
*P.S.千万不要点TOP SOLUTIONS啊啊啊 瞄一眼你就被剧透了T T...
*P.P.S.以下是别人的灵感
*/
public class Solution(){
	public String intToRoman2(int num){
        if(num<=0||num>3999){
            return null;
        }
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String M[] = {"", "M", "MM", "MMM"};

        return M[num/1000]+C[num%1000/100]+X[num%100/10]+I[num%10];
    }
}