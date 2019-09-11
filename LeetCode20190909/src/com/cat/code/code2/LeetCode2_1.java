package com.cat.code.code2;


public class LeetCode2_1 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = null;
        int nextNum = 0;
        while (l1!=null&&l2!=null){
            int nowNum = (l1.val+l2.val+nextNum)%10;
            sumNode=addNode(nowNum,sumNode);
            nextNum = (l1.val+l2.val+nextNum)/10;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            int nowNum = (l1.val+nextNum)%10;
            sumNode = addNode(nowNum,sumNode);
            nextNum = (l1.val+nextNum)/10;
            l1=l1.next;
        }
        while (l2!=null){
            int nowNum = (l2.val+nextNum)%10;
            addNode(nowNum,sumNode);
            nextNum = (l2.val+nextNum)/10;
            l2=l2.next;
        }
        if(nextNum!=0&&l1==null&&l2==null){
            addNode(nextNum,sumNode);
        }
        return sumNode;
    }

    //将数据添加到链表中
    public ListNode addNode(int data,ListNode listNode){
        ListNode newNode = new ListNode(data);
        if(listNode==null){
            listNode = newNode;
            return listNode;
        }
        ListNode temp = listNode;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return listNode;
    }


    public static void main(String[] args){
        LeetCode2_1 leetCode = new LeetCode2_1();

        ListNode l1 = new ListNode(0);
//        l1.next=new ListNode(4);
//        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(7);
        l2.next=new ListNode(3);
//        l2.next.next = new ListNode(4);

        leetCode.addTwoNumbers(l1,l2);
    }

}
