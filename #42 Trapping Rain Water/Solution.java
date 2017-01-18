/**
 * Created by Holeyness on 2017/1/17.
 * 根据（伪）面积计算的方法拼出来的题qwq
 * 讨论里那些 10-lined 算法等思考了之后再看qwq
 */
public class Solution {
    public int trap(int[] height) {
        if(height.length==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < height.length; i++){
            //找到第一个数不为0的位置
            if(i == 0){
                while(height[i]==0 && i < height.length-1){
                    i++;
                }
            }
            //找到更小值的flag
            int flag = -1;
            int others = 0;
            int max = -1;
            int max_value = -1;
            for(int j = i+1; j < height.length; j++){
                if(height[j]>=max_value){
                    max = j;
                    max_value = height[j];
                }
                /*if(height[i] > height[j]){

                    flag = 1;
                }*/
                //往后找一个更大的值
                if(height[i] <= height[j]){
                    for(int p=i+1; p<j; p++){
                        others += height[p];
                    }
                    sum += height[i]*(j-i-1)-others;
                    i = j-1;
                    break;
                }else if(j == height.length-1&&max!=-1){
                    others = 0;
                    for(int p = i+1; p<max; p++){
                        others+=height[p];
                    }
                    //找到最后都没有找到一个更大值
                    sum += height[max]*(max-i-1)-others;
                    i = max-1;
                    break;
                }
            }

        }
        return sum;
    }
    public static void main(String[] args){
        int[] arry = {1,1,1};
        Solution solution = new Solution();
        System.out.println(solution.trap(arry));
    }
}
