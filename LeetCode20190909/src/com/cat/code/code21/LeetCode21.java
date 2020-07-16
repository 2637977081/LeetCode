package com.cat.code.code21;

public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = res;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1!=null){
            p.next = l1;
        }else {
            p.next = l2;
        }
        return res.next;
    }

    public static void main(String[] args){
        LeetCode21 leetCode = new LeetCode21();
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode res = leetCode.mergeTwoLists(l1,l2);
        while (res!=null){
            System.out.print(res.val+",");
            res = res.next;
        }
        System.out.println();
    }
}
