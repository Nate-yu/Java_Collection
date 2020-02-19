import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Nate yu
 * @date 2020/2/19 - 9:41
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.printf("添加元素之前arraylist的容量为：%d\n",arrayList.size());

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.printf("添加元素之后arraylist的容量为：%d\n",arrayList.size());

        System.out.println("打印arraylist中的元素");
        //三种遍历方式打印元素
        // 通过迭代器遍历
        System.out.print("通过迭代器遍历：");
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        // 通过索引值遍历
        System.out.print("通过索引值遍历：");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // 通过for循环遍历
        System.out.print("通过for循环遍历：");
        for (Integer number:arrayList){
            System.out.print(number+" ");
        }

        // toArray用法
        // 第一种（常用）
        Integer[] integer = arrayList.toArray(new Integer[0]);

        // 第二种（易理解）
        Integer[] integer1 = new Integer[arrayList.size()];
        arrayList.toArray(integer1);

        // 在指定位置添加元素
        arrayList.add(2,2);
        // 删除指定位置上的元素
        arrayList.remove(2);
        // 删除指定元素
        arrayList.remove((Object)3);
        // 判断ArrayList是否包含5
        System.out.println("ArrayList是否包含5："+arrayList.contains(5));
        //清空ArrayList
        arrayList.clear();
        //判断ArrayList是否为空
        System.out.println("ArrayList是否为空："+arrayList.isEmpty());
    }
}
