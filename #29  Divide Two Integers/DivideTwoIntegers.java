
import org.junit.Test;

/**
 * 化除法为减法的循环 
 * @author cast_
 *
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
    	int result = 0;
    	// 特殊情况
        if(dividend == 0) {
        	return 0;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
        	return Integer.MAX_VALUE;
        }
        if(divisor == 1) {
        	return dividend;
        }
        // 计算绝对值的倍数，用long型防止临界值转化溢出
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        long remainder = dividendL;
        while(remainder >= divisorL) {
        	remainder -= divisorL;
    		result++;
        }
        // 被除数与除数异号情况
        if((dividend > 0 & divisor < 0) || (dividend < 0 & divisor > 0)) {
        	result = 0 - result;
        }
    	return result;
    }

    @Test
    public void calculate(){
    	DivideTwoIntegers divide = new DivideTwoIntegers();
    	int result = divide.divide(-9, 2);
    	System.out.println("result1:" +result);
    	
    }
}
