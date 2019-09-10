package com.cat.code.code2;


public class LeetCode2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resListNode = new ListNode(-1);
        ListNode newL1 = reverseList1(l1);
        ListNode newL2 = reverseList1(l2);
        while (newL1!=null||newL2!=null){

        }
        return resListNode;
    }

    //循环倒序
    public ListNode reverseList1(ListNode listNode){
        if(listNode==null){
            return null;
        }
        ListNode curNode = listNode;//当前节点
        ListNode oldNode = null;//
        ListNode newNode = null;
        while (curNode!=null){
            oldNode = curNode.next;
            curNode.next = newNode;
            newNode = curNode;
            curNode = oldNode;
        }
        return newNode;
    }



    //递归倒序
    public ListNode reverseList2(ListNode listNode){
        if(listNode==null || listNode.next==null){
            return listNode;
        }
        //保留最后两个节点，将最后一个节点传递给nowNode
        ListNode nowNode = reverseList2(listNode.next);
        //重复制造最后两个节点
        listNode.next.next = listNode;
        //剪除下一节点
        listNode.next = null;
        return nowNode;
    }

    public String getStringFromListNode(ListNode listNode){
        StringBuffer str=new StringBuffer("");
        while (listNode!=null){
            str.append(listNode.val);
            listNode=listNode.next;
        }
        return str.toString();
    }

    public ListNode getListNodeFromString(String str){
        ListNode listNode =null;
        int index =0;
        while (index<str.length()){
            listNode.val=Integer.valueOf(str.substring(index,index+1));
            listNode.next = listNode;
            index++;
        }
        return listNode;
    }

    public static void main(String[] args){
        LeetCode2 leetCode = new LeetCode2();

        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next = new ListNode(4);
    }

}
