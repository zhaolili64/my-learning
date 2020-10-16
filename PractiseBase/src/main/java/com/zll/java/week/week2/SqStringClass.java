package com.zll.java.week.week2;

/**
 * @ClassName GetNextval
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/13
 **/
public class SqStringClass {
    final int MaxSize = 100;
    char[] data;
    int size;

    public SqStringClass() {
        data = new char[MaxSize];
        size = 0;
    }
    public  SqStringClass(char[] data)
    {
        this.data = new char[MaxSize];
        
    }

    public SqStringClass SubStr(int i, int j) {
        SqStringClass s = new SqStringClass();
        if (i < 0 || i >= size || j < 0 || i + j > size)
            return s;
        for (int k = i; k <= i + j; k++)
            s.data[k - i] = data[k];
        s.size = j;
        return s;
    }
    public  LinkStringClass InStr(int i ,LinkStringClass t)
    {
        LinkStringClass s = new LinkStringClass();
        if (i<0 || i<size)
            return s;
        LinkNode p =head.next,p1= t.head.next,q,r;
        r=s.head;
        for (int k =0;k<i;k++){
            q=new LinkNode(p.data);
            r.next =q;
            r=q;
            p=p.next;
        }
        while (p1!=null)
        {
            q=new LinkNode(p1.data);
            r.next =q;
            r=q;
            p1=p1.next;
        }
        while (p!=null)
        {
            q=new LinkNode(p.data);
            r.next =q;
            r=q;
            p=p.next;
        }
        s.size = size+t.size;
        r.next = null;
        return s;

    }

}


