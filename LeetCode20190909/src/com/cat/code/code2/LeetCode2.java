package com.cat.code.code2;


public class LeetCode2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resListNode = new ListNode(-1);

        return resListNode;
    }



    public ListNode reverseList(ListNode listNode){
        if(listNode==null || listNode.next==null){
            return listNode;
        }
        //保留最后两个节点，将最后一个节点传递给nowNode
        ListNode nowNode = reverseList(listNode.next);
        System.out.println("nowNode1:"+nowNode);
        //重复制造最后两个节点
        listNode.next.next = listNode;
        System.out.println("nowNode2:"+nowNode);
        listNode.next = null;
        System.out.println("nowNode3:"+nowNode);
        return nowNode;
    }

    public static void main(String[] args){
        LeetCode2 leetCode = new LeetCode2();

        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);
        System.out.println(l1);
        System.out.println(leetCode.reverseList(l1));

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next = new ListNode(4);
    }

}
