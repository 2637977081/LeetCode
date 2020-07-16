package com.cat.code.code19;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //头部加一个哑结点，避免处理为空
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode p=res;
        ListNode q = res;
        //第一个指针p先跑n+1步，因为加了哑指针
        for (int i=0;i<=n;i++){
            p=p.next;
        }
        //等第一个指针p跑尾部结束
        while (p!=null){
            p=p.next;
            q=q.next;
        }
        //当前q.next就是倒数第n个节点，使得前一个节点指向后一个节点，删除完成
        q.next=q.next.next;
        //返回时忽略哑节点
        return res.next;
    }

    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        LeetCode19 leetCode = new LeetCode19();
        ListNode res = leetCode.removeNthFromEnd(listNode,2);
        while (res!=null){
            System.out.print(res.val+",");
            res = res.next;
        }
        System.out.println();
    }
}
