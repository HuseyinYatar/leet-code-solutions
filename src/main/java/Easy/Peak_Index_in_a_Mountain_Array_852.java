package Easy;

public class Peak_Index_in_a_Mountain_Array_852 {



    public static void main(String[] args) {
        int[] values = {1,0,1};

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        getDecimalValue(head);
    }

    static public int getDecimalValue(ListNode head) {
        int i = 1;
        int sum = 0;
        int count=-1;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        while(head!=null)
        {
            sum=sum+head.val*(int)Math.pow(2,count);
            i++;
            head=head.next;
        }
        return sum;
    }
}
