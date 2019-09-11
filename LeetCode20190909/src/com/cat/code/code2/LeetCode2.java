package com.cat.code.code2;


public class LeetCode2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = getStringFromListNode(l1);
        String str2 = getStringFromListNode(l2);
        String sumStr = getSumByString(str1,str2);
        ListNode listNode = getListNodeFromString(sumStr);
        return listNode;
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

    /**
     * 根据单链表获得字符串
     * @param listNode
     * @return
     */
    public String getStringFromListNode(ListNode listNode){
        StringBuffer str=new StringBuffer("");
        while (listNode!=null){
            str.append(listNode.val);
            listNode=listNode.next;
        }
        return str.toString();
    }

    /**
     * 根据字符串获取但链表
     * @param str
     * @return
     */
    public ListNode getListNodeFromString(String str){
        ListNode listNode =new ListNode(Integer.valueOf(str.substring(0,1)));
        int index =1;
        while (index<str.length()){
            ListNode temp = listNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            ListNode node = new ListNode( Integer.valueOf(str.substring(index,index+1)));
            temp.next=node;
            index++;
        }
        return listNode;
    }

    /**
     * 倒序输出字符串
     * @param str
     * @return
     */
    public String reverseString(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    /**
     * 获取两个字符数字和
     * @param str1
     * @param str2
     * @return
     */
    public String getSumByString(String str1,String str2){
        int minLen = str1.length()<str2.length()?str1.length():str2.length();
        StringBuffer stringBuffer = new StringBuffer();
        int nextNum = 0;//进位数
        for(int i=0;i<minLen;i++){
            int nowNum = (str1.charAt(i)-'0'+str2.charAt(i)-'0'+nextNum)%10;//当前位数
            nextNum = (str1.charAt(i)-'0'+str2.charAt(i)-'0'+nextNum)/10;//进位数
            stringBuffer.append(nowNum);
        }
        if(minLen==str1.length()){
            for(int i=minLen;i<str2.length();i++){
                int nowNum = (str2.charAt(i)-'0'+nextNum)%10;//当前位数
                nextNum = (str2.charAt(i)-'0'+nextNum)/10;//进位数
                stringBuffer.append(nowNum);
            }
        }else if(minLen==str2.length()){
            for(int i=minLen;i<str1.length();i++){
                int nowNum = (str1.charAt(i)-'0'+nextNum)%10;//当前位数
                nextNum = (str1.charAt(i)-'0'+nextNum)/10;//进位数
                stringBuffer.append(nowNum);
            }
        }

        if(nextNum>0){//最后还有进位
            stringBuffer.append(nextNum);
        }
        return stringBuffer.toString();
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

        leetCode.addTwoNumbers(l1,l2);
    }

}
