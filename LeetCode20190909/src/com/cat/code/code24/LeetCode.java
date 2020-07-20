package com.cat.code.code24;

public class LeetCode {

    public ListNode swapPairs(ListNode head) {
        ListNode cur = new ListNode(-1);
        ListNode res = cur;
        while (head!=null&&head.next!=null){
            //获取前一个
            ListNode p = head;
            //获取后一个
            ListNode q = head.next;
            //节点往后推两个
            head = head.next.next;
            //后一个赋值
            cur.next = q;
            //当前坐标后移
            cur = cur.next;
            cur.next = p;
            cur = cur.next;
        }
        cur.next = head;
        return res.next;
    }

    public static void main(String[] args){
        LeetCode leetCode = new LeetCode();
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode res = leetCode.swapPairs(l1);
        while (res!=null){
            System.out.print(res.val+",");
            res = res.next;
        }
        System.out.println();
    }
}
