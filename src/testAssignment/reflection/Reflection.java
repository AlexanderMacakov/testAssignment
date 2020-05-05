package testAssignment.reflection;

import testAssignment.binaryTree.BinaryThree;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // Создание объекта
        Class c = Class.forName(BinaryThree.class.getName());
        BinaryThree binaryThree = (BinaryThree) c.getDeclaredConstructor().newInstance();
        System.out.println(binaryThree);

        // читаем/изменияем приватное поле
        Field field = binaryThree.getClass().getDeclaredField("value");
        field.setAccessible(true);
        String name = (String) field.get(binaryThree);
        System.out.println(name);
        field.set(binaryThree, "none private value");
        String editName = (String) field.get(binaryThree);
        System.out.println(editName);

        //вызов метода
        Method method = binaryThree.getClass().getDeclaredMethod("dfs");
        method.setAccessible(true);
        System.out.println(method.invoke(binaryThree));
    }
}
