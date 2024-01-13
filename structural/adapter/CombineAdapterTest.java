package adapter;

/**
 * 优点：
 * 1.可以让不兼容的接口协同工作
 * 2.可以复用现有的类，无需修改其代码
 * 3.可以增加类的透明性和复用性。
 * @author nisang
 * 2024/1/13 19:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CombineAdapterTest {
    public static void main(String[] args) {
        // 创建被适配的对象实例
        OldSystem oldSystem = new OldSystem();

        // 使用对象适配器调用新系统接口
        NewSystem newSystem = new CombineAdapter(oldSystem);
        newSystem.request();

    }
}
