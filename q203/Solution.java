package q203;

public class Solution {
	 int val;
	 Solution next;
	 Solution() {}
	 Solution(int val) { this.val = val; }
	 Solution(int val, Solution next) { this.val = val; this.next = next; }	 


    public Solution removeElements(Solution head, int val) {
        if(head == null){
            return null;
        }

        Solution dump = new Solution(-1, head);
        Solution pre = dump;
        while(head != null){
            if(head.val == val){
                pre.next = head.next;
            }else{
                pre = head;
            }
            head = head.next;
            
        }

        return dump.next;
    }
    
    public static void main(String[] args) {
        // Create a test case
        Solution node1 = new Solution(1);
        Solution node2 = new Solution(2);
        Solution node3 = new Solution(6);
        Solution node4 = new Solution(3);
        Solution node5 = new Solution(4);
        Solution node6 = new Solution(5);
        Solution node7 = new Solution(6);
        Solution node8 = new Solution(6);
        Solution node9 = new Solution(7);

        // Connect the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        // Define the value to remove
        int val = 6;

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the removeElements function
        Solution result = solution.removeElements(node1, val);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}
