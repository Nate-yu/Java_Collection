import java.util.*;

/**
 * @author Nate yu
 * @date 2020/2/24 - 10:09
 */
public class SetDemo {

    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<String>();

        // add方法的使用
        String s1=new String("hello");
        String s2=s1; // set的add方法会自动判断里面收的元素是否有相同，从而保证元素的唯一性。
        String s3=new String("world");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("添加元素后的集合为："+set);

        /*Set集合的遍历*/
        System.out.println("-------Set集合的两种遍历方式:-------");
        // Iterator迭代遍历
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterator迭代遍历结果为：");
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.print(string+" ");
        }
        System.out.println();
        // for循环遍历
        System.out.println("for循环遍历结果为：");
        for (String string : set){
            System.out.print(string+" ");
        }
        System.out.println();
        /*HashSet的2种排序方法*/
        System.out.println("-------HashSet的2种排序方法:-------");
        final HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(6);
        hashSet.add(9);
        // 把HashSet保存在ArrayList里，再用Collections.sort()方法排序
        final List<Integer> list = new ArrayList<Integer>();
        for(final Integer value : hashSet){
            list.add(value);
        }
        Collections.sort(list);
        System.out.println("通过ArrayList的排序结果为："+list);

        // 把这个HashSet作为构造参数放到TreeSet中
        final TreeSet treeSet = new TreeSet(hashSet);
        treeSet.comparator();
        System.out.println("通过把HashSet作为构造参数放到TreeSet中的排序结果为："+treeSet);


        // Set转List的两种方法
        Map<String, String> map = new HashMap<String, String>();
        map.put("ele1", "小樱");
        map.put("ele2", "若曦");
        map.put("ele3", "晴川");
        Set<String> set1 = map.keySet();
        System.out.println("-------Set转List的两种方法:-------");
        // 通过ArrayList进行转换
        List<String> list1 = new ArrayList<String>(set1);
        System.out.println("通过ArrayList进行转换后的结果为：");
        for(int i = 0; i < list1.size(); i++){
            System.out.print("list1(" + i + ")-->" + list1.get(i) + "    ");
        }
        System.out.println();

        // List实现类进行转换
        List<String> list2 = new ArrayList<String> ();
        list2.addAll(set1);
        System.out.println("通过List实现类进行转换后的结果为："+list2);
//        for(String string : list2){
//            System.out.print(string+" ");
//        }


    }
}
