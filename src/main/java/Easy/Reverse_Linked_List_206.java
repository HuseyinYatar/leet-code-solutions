package Easy;

import java.util.Stack;

public class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack=new Stack<>();

        while(head!=null)
        {
            stack.push(head.val);
            head=head.next;
        }
        ListNode res=new ListNode();
        ListNode tmp=res;
        while(!stack.empty())
        {
            tmp.val=stack.pop();
            tmp.next=new ListNode();
            tmp=tmp.next;
        }
        return res;
    }
}
