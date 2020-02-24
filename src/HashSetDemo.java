import java.util.*;

/**
 * @author Nate yu
 * @date 2020/2/24 - 20:25
 */
public class HashSetDemo {

    public static void main(String[] args) {

        /*HashSet的两种遍历方法*/
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");
        System.out.println("添加元素后的HashSet为："+hashSet);
        System.out.println("-------HashSet的两种遍历方法-------");
        // Iterator迭代方式遍历
        Iterator iterator = hashSet.iterator();
        System.out.print("通过Iterator迭代方式遍历后的结果为：");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        // for循环方式遍历
        System.out.print("通过for循环方式遍历后的结果为：");
        for (String string:hashSet) {
            System.out.print(string+" ");
        }

        String[] arr = new String[] {"i", "think", "i", "am", "the","best"};
        System.out.println();
        System.out.print("新建的数组中的元素为：[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
        /*HashSet去重的4种方法*/
        System.out.println("-------HashSet去重的4种方法-------");
        // LinkedHashSet去重，去重后保持原有顺序（重复数据只保留一条）
        Collection<String> collection = new LinkedHashSet<String>(Arrays.asList(arr));
        System.out.println("LinkedHashSet去重后的结果为："+collection);

        // HashSet去重方法一，去重后顺序打乱（重复数据只保留一条）
        Collection<String> hashSet1 = new HashSet<String>(Arrays.asList(arr));
        System.out.println("HashSet1去重后的结果为："+hashSet1);

        // HashSet去重方法二，去重后顺序打乱（重复数据只保留一条）
        Set<String> hashSet2 = new HashSet<String>();
        for (String string : arr) {
            if (!hashSet2.add(string)) {
                System.out.println("集合中的重复元素为："+string);
            }
        }
        System.out.println("HashSet2去重后的结果为："+hashSet2);

        // HashSet去重方法三，去重后顺序打乱(相同的数据一条都不保留，取唯一)
        Set<String> hashSet3 = new HashSet<String>();
        Set<String> hashSet4 = new HashSet<String>();
        for (String string : arr) {
            if (!hashSet3.add(string)){
                hashSet4.add(string);
            }
        }
        hashSet3.removeAll(hashSet4);
        System.out.println("将所有重复元素去掉后的结果为："+hashSet3);
        System.out.println("重复的元素为："+hashSet4);
    }
}