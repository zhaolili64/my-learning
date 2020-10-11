package com.zll.java.week.week1;

/**
 * @ClassName Max
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/11
 **/
public class Max {
    public static void main(String[] args) {
        //固定元素的数组
        int array[] = {7,4,6,8,5};
        int arrayCopyof[] = array.clone();
        int max = max(arrayCopyof);
        System.out.println(max);
        int index = indexOf(arrayCopyof,max);
        array = delElement(array,index);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }

    }

    //找到数组中的最大数
    public static int max(int[] array){
        int maxValue=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>maxValue)
            {
                maxValue=array[i];
            }
        }
        return maxValue;
    }

    //获得数组最大数下标
    public static int indexOf(int[]array,int key){
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static int[] delElement(int[] arrays, int index) {
        int length = arrays.length;
        //判断数据合理性
        if (index >= 0 && index < length) {
            int[] arrays_result = new int[arrays.length - 1];
            //将arrays数组在index前的元素都复制到新数组arrays_result中
            System.arraycopy(arrays, 0, arrays_result, 0, index);
            //判断index之后是否还有元素，有则将index后的元素从index位置复制到新数组中
            if (index < length - 1) {
                System.arraycopy(arrays, index + 1, arrays_result, index, arrays_result.length - index);
            }
            return arrays_result;
        } else {
            //不合理，抛越界异常
            throw new IndexOutOfBoundsException("index :" + index + ", length: " + length);
        }
    }
}
