
/**
 * 将输入的节点链表直接转换为BigInteger进行数字运算
 */
import java.math.BigInteger;

public class TwoNumbersAdd {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		BigInteger totalL1 = new BigInteger("0");
		BigInteger totalL2 = new BigInteger("0");
		BigInteger total = new BigInteger("0");
		BigInteger NUM_TEN = new BigInteger("10");
		// 遍历节点列表1
		for(int i = 0; l1 != null; i++){
			// 所在数字位的实际数值【10的N（N=节点数字所处数值的位置）次方的倍数】
			BigInteger times = NUM_TEN.pow(i);
			BigInteger l1Val = times.multiply(BigInteger.valueOf(l1.val));
			totalL1 = totalL1.add(l1Val);
			if(l1.next == null) {
				break;
			}
			l1 = l1.next;
		}
		// 遍历节点列表2
 		for(int i = 0; l2 != null; i++){
 			BigInteger times = NUM_TEN.pow(i);
			BigInteger l2Val = times.multiply(BigInteger.valueOf(l2.val));
			totalL2 = totalL2.add(l2Val);
			if(l2.next == null) {
				break;
			}
			l2 = l2.next;
		}
		total = totalL1.add(totalL2);
		// 暴力拆分
		char[] totalNumChar = String.valueOf(total).toCharArray();
		ListNode listNodeResults = new ListNode(Integer.parseInt(String.valueOf(totalNumChar[0])));
		for(int i = 1; i < totalNumChar.length; i++) {
			ListNode listNodeResult = new ListNode(Integer.parseInt(String.valueOf(totalNumChar[i])), listNodeResults);
			listNodeResults = listNodeResult;
		}
		return listNodeResults;
	}
	

	/* Definition for singly-linked list. */
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		
	}
	public static void main(String[] arg) {
		TwoNumbersAdd numberAdd = new TwoNumbersAdd();
		TwoNumbersAdd.ListNode ln1 = numberAdd.new ListNode(1);
		for(int i = 0; i < 30; i++) {
			TwoNumbersAdd.ListNode templn = numberAdd.new ListNode(0, ln1);
			ln1 = templn;
		}
		TwoNumbersAdd.ListNode templn1 = numberAdd.new ListNode(1, ln1);
		
		TwoNumbersAdd.ListNode ln2 = numberAdd.new ListNode(5);
		TwoNumbersAdd.ListNode result = numberAdd.addTwoNumbers(templn1, ln2);
		
	}

}
