package q206;

public class Solution {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode dummpy = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = dummpy;
            dummpy = cur;
            cur = temp;
        }

        return dummpy;
    }

    public static void main(String[] args) {
        // Create a test case
        Solution solution = new Solution();

        // Create a linked list [1 -> 2 -> 3 -> 4 -> 5]
        ListNode node5 = solution.new ListNode(5);
        ListNode node4 = solution.new ListNode(4, node5);
        ListNode node3 = solution.new ListNode(3, node4);
        ListNode node2 = solution.new ListNode(2, node3);
        ListNode node1 = solution.new ListNode(1, node2);

        
        ListNode node1_copy = node1;
        while (node1_copy != null) {
            System.out.print(node1_copy.val + " ");
            node1_copy = node1_copy.next;
        }
        System.out.println();
        
        // Call the reverseList function
        ListNode result = solution.reverseList(node1);

        // Print the resulting reversed linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }


}
